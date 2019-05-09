// everyone
// last updated 05-09-19

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class Main
{
	public static void main(String[] args)
	{
		GUIExtension1.initFrameAndParentPanel ();
		
		MainMenu.initGUI();
		Help.initGUI();
		Navigation.initGUI();
		Map.initGUI();
		Shop.initGUI();
		
		GUIExtension1.showFirstPane(MainMenu.getPane());
	
	} // Main method
} // Main class
