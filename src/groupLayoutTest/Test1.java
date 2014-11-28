package groupLayoutTest;

import java.awt.LayoutManager;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
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
		GroupLayout layout = new GroupLayout(mainWindow);
		mainWindow.setLayout(layout);
		
		JPanel panelA1 = new JPanel();
		JPanel panelA2 = new JPanel();
		JPanel panelA3 = new JPanel();
		JPanel panelA4 = new JPanel();
		
		JPanel panelBl = new JPanel();
		JPanel panelB2 = new JPanel();
		JPanel panelB3 = new JPanel();
		JPanel panelB4 = new JPanel();
		
		GroupLayout.ParallelGroup groupV1= layout.createParallelGroup();
		groupV1.addComponent(panelA1);
		groupV1.addComponent(panelA2);
		groupV1.addComponent(panelA3);
		groupV1.addComponent(panelA4);
		layout.addLayoutComponent(panelA1, groupV1);
		layout.addLayoutComponent(panelA2, groupV1);
		layout.addLayoutComponent(panelA3, groupV1);
		layout.addLayoutComponent(panelA4, groupV1);
		
		mainWindow.setVisible(true);
		
		
	}

 
}

//Click-path to enable Java proposals:
//Windows-->Preferences --> Java --> Editor --> Content Assist --> Advanced