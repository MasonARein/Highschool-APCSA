package apcs.pixLab;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image {

	/*
	 * Instance variables: image - a 2D Array of Colors
	 */
	
	private Color[][] image;

	/**
	 * Creates a new Image based on an existing 2D array of colors
	 * @param image the array of Colors
	 */
	public Image (Color[][] image) {
		this.image = image;
	}
	/**
	 * Creates a new Image from an image stored in a file 
	 * @param file the name of the file to create the Image from
	 */
	public Image (String file) {
		// read image and load into array of Colors
		try {
			BufferedImage img = ImageIO.read(new File(file));
			image = new Color[img.getHeight()][img.getWidth()];
			for (int r = 0; r < image.length; r++) {
				for (int c = 0; c < image[r].length; c++) {
					image[r][c] = new Color(img.getRGB(c, r));
				}
			}
		} catch (IOException e) {  // couldn't open file
			e.printStackTrace();
			System.exit(-1);
		}
	}
	/**
	 * Display the image into a Java GUI Window
	 * @param title The title to be displayed in the window's title bar
	 */
	public void display (String title) {
		new ImageGUI (image, title);
	}
	/**
	 * noBlue - returns a new Image of this with all the Blue components
	 * removed
	 * 
	 * @return Image without any blue
	 */
	public Image removeBlue() {

		Color[][] newImg = new Color[image.length][image[0].length];
		
		// loop through all pixels
		for (int r = 0; r < image.length; r++) {
			for (int c = 0; c < image[r].length; c++) {
				
				// get component parts of pixel's color
				int red = image[r][c].getRed();
				int green = image[r][c].getGreen();
				int blue = image[r][c].getBlue();

				// construct a new pixel with the same red and green but no blue
				newImg[r][c] = new Color(red , green, 0);
			}
		}
		
		return new Image (newImg);
	}
	public Image removeRed() {

		Color[][] newImg = new Color[image.length][image[0].length];
		
		// loop through all pixels
		for (int r = 0; r < image.length; r++) {
			for (int c = 0; c < image[r].length; c++) {
				
				// get component parts of pixel's color
				int red = image[r][c].getRed();
				int green = image[r][c].getGreen();
				int blue = image[r][c].getBlue();

				// construct a new pixel with the same red and green but no blue
				newImg[r][c] = new Color(0, green, blue);
			}
		}
		
		return new Image (newImg);
	}
	public Image removeGreen() {

		Color[][] newImg = new Color[image.length][image[0].length];
		
		// loop through all pixels
		for (int r = 0; r < image.length; r++) {
			for (int c = 0; c < image[r].length; c++) {
				
				// get component parts of pixel's color
				int red = image[r][c].getRed();
				int green = image[r][c].getGreen();
				int blue = image[r][c].getBlue();

				// construct a new pixel with the same red and green but no blue
				newImg[r][c] = new Color(red, 0, blue);
			}
		}
		
		return new Image (newImg);
	}
	public Image invertColor() {

		Color[][] newImg = new Color[image.length][image[0].length];
		
		// loop through all pixels
		for (int r = 0; r < image.length; r++) {
			for (int c = 0; c < image[r].length; c++) {
				
				// get component parts of pixel's color
				int red = image[r][c].getRed();
				int green = image[r][c].getGreen();
				int blue = image[r][c].getBlue();

				// construct a new pixel with the same red and green but no blue
				newImg[r][c] = new Color(255-red, 255-green, 255-blue);
			}
		}
		
		return new Image (newImg);
	}
	public Image blackWhite() {

		Color[][] newImg = new Color[image.length][image[0].length];
		
		// loop through all pixels
		for (int r = 0; r < image.length; r++) {
			for (int c = 0; c < image[r].length; c++) {
				
				// get component parts of pixel's color
				int red = image[r][c].getRed();
				int green = image[r][c].getGreen();
				int blue = image[r][c].getBlue();

				// construct a new pixel with the same red and green but no blue
				newImg[r][c] = new Color((red+blue+green)/3, (red+blue+green)/3, (red+blue+green)/3);
			}
		}
		
		return new Image (newImg);
	}
	public Image flipHorizontal() {

		Color[][] newImg = new Color[image.length][image[0].length];
		
		// loop through all pixels
		for (int r = 0; r < image.length; r++) {
			for (int c = 0; c < image[r].length; c++) {
				
				// get component parts of pixel's color
				int red = image[r][c].getRed();
				int green = image[r][c].getGreen();
				int blue = image[r][c].getBlue();

				// construct a new pixel with the same red and green but no blue
				newImg[r][image[r].length-1-c] = new Color(red, green, blue);
			}
		}
		
		return new Image (newImg);
	}
	public Image mirrorVertical() {

		Color[][] newImg = new Color[image.length][image[0].length];
		
		// loop through all pixels
		for (int r = 0; r < image.length; r++) {
			for (int h = 0; h < image[r].length; h++) {
				int c = 0;
				if(h < (image[r].length-1)/2.0) {
					 c= h;
				}
				else {
					c = image[r].length-1-h;
				}
				// get component parts of pixel's color
				int red = image[r][c].getRed();
				int green = image[r][c].getGreen();
				int blue = image[r][c].getBlue();
				// construct a new pixel with the same red and green but no blue
				newImg[r][h] = new Color(red, green, blue);
			}
		}
		
		return new Image (newImg);
	}
	public Image mirrorHorizontal() {

		Color[][] newImg = new Color[image.length][image[0].length];
		
		// loop through all pixels
		for (int h = 0; h < image.length; h++) {
			for (int c = 0; c < image[h].length; c++) {
				int r = 0;
				if(h < (image.length-1)/2.0) {
					 r= h;
				}
				else {
					r = image.length-1-h;
				}
				// get component parts of pixel's color
				int red = image[r][c].getRed();
				int green = image[r][c].getGreen();
				int blue = image[r][c].getBlue();
				// construct a new pixel with the same red and green but no blue
				newImg[h][c] = new Color(red, green, blue);
			}
		}
		
		return new Image (newImg);
	}
	public Image blurImage() {

		Color[][] newImg = new Color[image.length][image[0].length];
		
		// loop through all pixels
		for (int r = 0; r < image.length; r++) {
			for (int c = 0; c < image[r].length; c++) {
				
				// get component parts of pixel's color
				int red = image[r][c].getRed();
				int red1 = image[r-1][c].getRed();
				int red2 = image[r+1][c].getRed();
				int red3 = image[r-1][c-1].getRed();
				int red4 = image[r+1][c-1].getRed();
				int red5 = image[r][c-1].getRed();
				int red6 = image[r-1][c+1].getRed();
				int red7 = image[r+1][c+1].getRed();
				int red8 = image[r][c+1].getRed();
				int green = image[r][c].getGreen();
				int green1 = image[r-1][c].getGreen();
				int green2 = image[r+1][c].getGreen();
				int green3 = image[r-1][c-1].getGreen();
				int green4 = image[r+1][c-1].getGreen();
				int green5 = image[r][c-1].getGreen();
				int green6 = image[r-1][c+1].getGreen();
				int green7 = image[r+1][c+1].getGreen();
				int green8 = image[r][c+1].getGreen();
				int red = image[r][c].getRed();
				int red1 = image[r-1][c].getRed();
				int red2 = image[r+1][c].getRed();
				int red3 = image[r-1][c-1].getRed();
				int red4 = image[r+1][c-1].getRed();
				int red5 = image[r][c-1].getRed();
				int red6 = image[r-1][c+1].getRed();
				int red7 = image[r+1][c+1].getRed();
				int red8 = image[r][c+1].getRed();
				int green = image[r][c].getGreen();
				int blue = image[r][c].getBlue();

				// construct a new pixel with the same red and green but no blue
				newImg[r][c] = new Color(red , green, 0);
			}
		}
		
		return new Image (newImg);
	}

}