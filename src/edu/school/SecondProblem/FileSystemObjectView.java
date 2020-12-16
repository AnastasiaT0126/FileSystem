package edu.school.SecondProblem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class FileSystemObjectView extends JComponent
{
	private FileSystemObject object;
	
	public FileSystemObjectView(Rectangle dimensions, FileSystemObject object)
	{
		this.setBounds(dimensions);
		this.object = object;
	}
	
	public void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		Graphics2D g = (Graphics2D)graphics;
		
		g.setColor(Color.yellow);
        g.fillRect(5, 5, getBounds().width - 10, getBounds().height - 10);
        
        g.setColor(Color.black);
        g.drawRect(5, 5, getBounds().width - 10, getBounds().height - 10);
        
        String folderInfo = String.format("%s | %d bytes", this.object.getName(), this.object.getSize());
        g.drawString(folderInfo, 20, 20);
	}
}
