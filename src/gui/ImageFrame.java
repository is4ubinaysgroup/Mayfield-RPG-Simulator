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
	private boolean hasImage;
	private Color color;
	private static final long serialVersionUID = 7535309559989379922L;
	private BufferedImage image;
	
	public ImageFrame() 
	{
		this.image = null;
		this.hasImage = false;
		this.color = defaultColor;
	}
	
	public ImageFrame(BufferedImage image) 
	{
		this.image = image;
		this.hasImage = true;
		this.color = defaultColor;
	}

	/**
	 * 
	 */
	public void paint(Graphics g) 
	{
		g.setColor(getColor());
		g.fillRect(0, 0, 40, 40);
		if(this.hasImage) 
		{
		g.drawImage(getImage(), 0, 0, 40, 40, null);//TODO update to different boss and enemythis.getGraphics();
		}
	}
	
	public BufferedImage getImage()
	{
		return image;
	}

	public void setImage(BufferedImage image) 
	{
		this.hasImage = true;
		this.image = image;
	}

	public void removeImage() 
	{
		this.image = null;
		this.hasImage = false;
	}
	
	public Color getColor() 
	{
		return color;
	}

	public void setColor(Color color) 
	{
		this.color = color;
		setBackground(color);
	}

}