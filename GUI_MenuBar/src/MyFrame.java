import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem= new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		//To Add Icons to MenuItems
		
//		loadIcon = new ImageIcon("load.png");
//		saveIcon = new ImageIcon("save.png");
//		exitIcon = new ImageIcon("exit.png");
//		
//		loadItem.setIcon(loadIcon);
//		saveItem.setIcon(saveIcon);
//		exitItem.setIcon(exitIcon);
;		
		
		//add hotkeys (Mnemonic
		loadItem.setMnemonic(KeyEvent.VK_L); //navigate to File or parent Menu then just press key for menu
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); //Alt +F
		editMenu.setMnemonic(KeyEvent.VK_E); //Alt +E
		helpMenu.setMnemonic(KeyEvent.VK_H); //Alt +H
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//catch sub menu of file clicks
		
		if(e.getSource()==loadItem) {
			System.out.println("Loading File .....");
			
		}
		if(e.getSource()==saveItem) {
			System.out.println("Saving File .........");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}
		
	}

}
  