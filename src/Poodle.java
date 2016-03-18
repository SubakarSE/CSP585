import java.awt.Graphics;

import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.JPanel;



public class Poodle extends JPanel implements Animal,Dog {

	public static int Identifier=0;
	public double height,width;
	public String Name;
	public int Id;
	public int Age;
	public String Type;
	public String Breed;
	public String ReadyForAdoption;
	public String Notes;
	public String MedicalCondition;
	static Poodle p=null;
	
	private Poodle() {
	}

	static synchronized Animal getAnimal() {
		if (p == null) {
			p = new Poodle();
			return p;
		}
		return p;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
		
	@Override
	public void draw(){
	repaint();
	}

	
	@Override
	public String toString() {

		String temp;
		String temp1="     ";
		StringBuilder a = new StringBuilder();
		temp= "Animal Name: ";
		a.append(temp);
		a.append(Name);
		a.append(temp1);
		temp = "Type: ";
		a.append(temp);
		a.append(Type);
		a.append(temp1);
		temp = "Breed: ";
		a.append(temp);	
		a.append(Breed);
		a.append(temp1);
		temp = "Ready For Adoption:  ";
		a.append(temp);
		a.append(ReadyForAdoption);
		a.append(temp1);
		temp = "Medical Condition: ";
		a.append(temp);
		a.append(MedicalCondition);
		a.append(temp1);
		temp = "Notes: ";
		a.append(temp);
		a.append(Notes);
		return a.toString();
	}



	@Override
	public int getIdentifier() {
		// TODO Auto-generated method stub
		return Identifier;
	}
	
	 protected void paintComponent(Graphics graphics) {
		    this.setBackground(new Color(255, 228, 181));
		 	char [] rgc = { 'P', 'O', 'O' ,'D', 'L', 'E' };
			
		    super.paintComponent(graphics); 
		    graphics.drawChars(rgc, 0, 6, 40, 10); 
		    graphics.setColor(Color.GRAY);
			graphics.fillOval(100, 20, 50, 50);
			graphics.setColor(Color.BLACK);
			graphics.fillOval(112, 30, 10, 10);
			graphics.setColor(Color.BLACK);
			graphics.fillOval(132, 30, 10, 10);
			graphics.setColor(Color.RED);
			graphics.fillOval(122,50, 10, 10); 
			graphics.setColor(Color.GRAY);
			graphics.fillOval(10,10, 100, 60);
			graphics.setColor(Color.BLACK);
			graphics.drawLine(1250, 150, 1250, 10);
			graphics.setColor(Color.GREEN);
			graphics.fill3DRect(1300, 50, 40, 60, false);
		  }
	 
}