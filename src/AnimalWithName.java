import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class AnimalWithName extends JPanel implements AnimalDecorator {

	Dalmatian dalobj =null;
	public AnimalWithName(Dalmatian d){
		dalobj =d;
	}
	
	public void draw(){
		repaint();
	}

	@Override
	public int getIdentifier() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void paintComponent(Graphics graphics){
		
		char[] animalName =dalobj.getAnimalName();
		
		this.setBackground(new Color(171, 228, 170));
	    super.paintComponent(graphics); 
	    graphics.drawChars(animalName, 0, animalName.length, 40, 10); 
	    graphics.setColor(Color.GRAY);
		graphics.fillOval(100, 20, 50, 50);
		graphics.setColor(Color.BLACK);
		graphics.fillOval(112, 30, 10, 10);
		graphics.setColor(Color.BLACK);
		graphics.fillOval(132, 30, 10, 10);
		graphics.setColor(Color.CYAN);
		graphics.fillOval(122,50, 10, 10); 
		graphics.setColor(Color.GRAY);
		graphics.fillOval(10,10, 100, 60);
		graphics.setColor(Color.BLACK);
		graphics.drawLine(1250, 150, 1250, 10);
		graphics.setColor(Color.GREEN);
		graphics.fill3DRect(1300, 50, 40, 60, false);
		
	}
	
	
}
