package src.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ImageFrame extends JPanel{

	/**
	 * 
	 */
	private Color defaultColor = new Color(209,	166,	228, 105);
	private Color color;
	private static final long serialVersionUID = 7535309559989379922L;
	private BufferedImage image;
	
	public ImageFrame() 
	{
		this.setImage(null);
		this.setColor(null);
	}
	
	public ImageFrame(BufferedImage image) 
	{
		this.setImage(image);
		this.setColor(new Color(7,225,44,40));
	}

	/**
	 * 
	 */

	public void paint (Graphics g) 
	{
		if(getImage() != null)
		{
			g.drawImage(getImage(), 0, 0, 40, 40, null);//TODO update to different boss and enemy
		}
		else 
		{
			g.setColor(getColor());
			g.fillRect(0, 0, getWidth(), getHeight());
		}
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Color getBackground() 
	{
		return getColor();
	}

	public void setBackground(Color color) 
	{
		setImage(null);
		setColor(color);
		repaint();
	}

}