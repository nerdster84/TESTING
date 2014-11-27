package groupLayoutTest;

import java.awt.LayoutManager;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 {

	
	/** 
	 * QUATSCHZEILE BITTEL LOESCHEN
	 * Tests how grouplayout works. Aim: Being able to set proportions for resizing.
	 * 
	 * Therefor create some JPanels and add images to them to play with this LayoutManager.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame mainWindow = new JFrame("Test1");
		LayoutManager layout1 = new GroupLayout(mainWindow);
		
		JPanel panelA1 = new JPanel();
		JPanel panelA2 = new JPanel();
		JPanel panelA3 = new JPanel();
		JPanel panelA4 = new JPanel();
		
		JPanel panelBl = new JPanel();
		JPanel panelB2 = new JPanel();
		JPanel panelB3 = new JPanel();
		JPanel panelB4 = new JPanel();
		
		
		
	}


}
