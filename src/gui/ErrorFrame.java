/**
 * 
 */
package src.gui;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import javax.swing.JOptionPane;
/**
 * @author 571370
 *
 */
public class ErrorFrame extends JOptionPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1044121174784899671L;


	public ErrorFrame(Exception e) {
		this.message = (String) e.getMessage();
		//this.icon =  Toolkit.getDefaultToolkit().getImage(ErrorFrame.class.getResource("/com/sun/java/swing/plaf/motif/icons/Error.gif"));
		this.messageType = ErrorFrame.ERROR_MESSAGE;
		this.optionType= ErrorFrame.OK_CANCEL_OPTION;
	}
	
	public void notifyIssue() 
	{
		showMessageDialog(null, getMessage(), "Bruh...", JOptionPane.ERROR_MESSAGE);
		
	}
	
	public void error() 
	{
		showMessageDialog(null, getMessage(), "OOPSY DOOPSY", JOptionPane.ERROR_MESSAGE);
		final File parentDir = new File("src");
		parentDir.mkdir();
		final String hash = "error-recent" ;
		System.out.print(hash);
		final String fileName = hash + ".txt";
		final File file = new File(parentDir, fileName);
		
		try {
			file.createNewFile();
			final FileWriter writer = new FileWriter(file);
			writer.write(getMessage().toString()+ " at "+ Instant.now());
			writer.close();
			System.exit(0);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Creates file crawl_html/abc.t
	}


}
