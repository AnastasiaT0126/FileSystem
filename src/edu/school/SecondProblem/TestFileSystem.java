package edu.school.SecondProblem;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFileSystem {
	public static void main(String[] args)
	{
		File file1 = new File("Parks.txt", 20);
		File file2 = new File("Gardents.txt", 30);
		File file3 = new File("Reservations.txt", 60);
		FileSystemObject[] files = {file1, file2, file3};
		Folder folder = new Folder("Green files", files);
		
		JFrame frame = new JFrame();
		frame.setBounds(20, 20, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		
		FileSystemObjectView object = new FileSystemObjectView(new Rectangle(50, 50, 150, 30), folder);
		frame.add(object);
		
		/*JButton open = new JButton("Open");  
	    open.setBounds(50,100,95,30);  
	    open.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0)
	    	{
	    		
	    	}
	    };
	    
	    frame.add(open);*/
	}
}
