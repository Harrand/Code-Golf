import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColouredGrid64
{
	public JFrame guiFrame;
	public JPanel grid;
	public ColorLabel[] arrayLabels;
	public Random rand;
	
	protected void randomiseColours()
	{
		for(int i = 0; i < 64; i++)
			arrayLabels[i].drawColor = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
		guiFrame.repaint();
	}
	
	public void createGUI()
	{
		rand = new Random();
		guiFrame = new JFrame("Label demo");
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		grid = new JPanel();
		GridLayout gl = new GridLayout(8, 8);
		guiFrame.add(grid);
		grid.setLayout(gl);
		arrayLabels = new ColorLabel[64];
		for(int i = 0; i < 64; i++)
		{
			System.out.println(i);
			arrayLabels[i] = new ColorLabel(8, 8, new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
			int w = arrayLabels[i].getWidth(), h = arrayLabels[i].getHeight();
			arrayLabels[i].setBounds(i*w, i*h, w, h);
			grid.add(arrayLabels[i]);
		}
		guiFrame.setSize(64*8, 64*8);
		guiFrame.setVisible(true);
		//Frame height increased by 20
		JButton b = new JButton("Press me to refresh labels");
		guiFrame.add(b, BorderLayout.SOUTH);
		b.setSize(64, 8);
		b.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						randomiseColours();
					}
		
				});
	}
	
	public static void main(String[] args)
	{
		ColouredGrid64 main = new ColouredGrid64();
		main.createGUI();
	}
}
