import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
/*
Author Carson Fujita Turnbull
Purpose: Makes a Panel that requires and prints an Image to its graphics.
Version B1
*/
public class ImagePanel extends JPanel{

    private BufferedImage image;
    
    public ImagePanel()  
    {            
    }
    
    public ImagePanel(String fileName) throws IOException 
    {            
          image = ImageIO.read(new File(fileName));
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image,  0,0, this.getWidth(),this.getHeight(), this); //Prints the Image
    }
    
    public void setImage(BufferedImage image) 
    {
    	this.image = image;
    }

    public BufferedImage getImage() 
    {
    	return this.image;
    }
}
