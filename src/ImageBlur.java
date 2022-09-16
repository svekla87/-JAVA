package CourseTasks;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class ImageBlur {
    public static void main(String[] args) throws IOException {
        BufferedImage inputImage = ImageIO.read(new File("image.jpg"));
        WritableRaster inputRaster = inputImage.getRaster();

        BufferedImage outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), inputImage.getType());
        WritableRaster outputRaster = outputImage.getRaster();

        int width = inputRaster.getWidth();
        int height = inputRaster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;

        int[] pixel = new int[COLORS_COUNT_IN_RGB];

        double coefficient = 1.0 / 9;

        double[][] blurMatrix = {
                {coefficient, coefficient, coefficient},
                {coefficient, coefficient, coefficient},
                {coefficient, coefficient, coefficient}
        };

        int blurSize = blurMatrix.length;
        int radius = blurSize / 2;

        int radiusIndentedHeight = height - radius;
        int radiusIndentedWidth = width - radius;

        double[] resultantPixel = new double[COLORS_COUNT_IN_RGB];

        for (int y = radius; y < radiusIndentedHeight; ++y) {
            for (int x = radius; x < radiusIndentedWidth; ++x) {
                for (int a = 0; a < COLORS_COUNT_IN_RGB; a++) {
                    resultantPixel[a] = 0;
                }

                for (int i = -radius, m = 0; i <= radius; i++, m++) {
                    for (int j = -radius, n = 0; j <= radius; j++, n++) {
                        inputRaster.getPixel(x + j, y + i, pixel);
                        for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                            resultantPixel[k] += blurMatrix[m][n] * pixel[k];
                        }
                    }
                }

                for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                    if (resultantPixel[k] > 255) {
                        resultantPixel[k] = 255;
                    } else if (resultantPixel[k] < 0) {
                        resultantPixel[k] = 0;
                    }
                }

                outputRaster.setPixel(x, y, resultantPixel);
            }
        }

        ImageIO.write(outputImage, "png", new File("output3.png"));
    }
}