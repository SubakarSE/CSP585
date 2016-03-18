import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;


import javax.swing.JPanel;


public  class American extends JPanel implements Animal,Cat  {
	public static int Identifier = 2;
	public String Name;
	public int Id;
	public int Age;
	public String Type;
	public String Breed;
	public String ReadyForAdoption;
	public String Notes;
	public String MedicalCondition;
	static American a=null;
	
   private American(){}
   
   static  synchronized Animal getAnimal(){
	   if (a==null){
		   a= new American();
		   return a;
	   }
	   return a;
   }
   public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	
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
		this.setBackground(new Color(255, 175, 175));
		char [] rgc = { 'C', 'A', 'T' };
		
	    super.paintComponent(graphics); 
	    graphics.drawChars(rgc, 0, 3, 40, 10);
	    graphics.setColor(Color.GRAY);
		graphics.fillOval(20, 20, 70, 100);
		graphics.setColor(Color.BLACK);
		graphics.fillOval(32, 30, 20, 20);
		graphics.setColor(Color.BLACK);
		graphics.fillOval(60, 30, 20, 20);
		graphics.setColor(Color.RED);
		graphics.fillOval(45,80, 30, 20); 
		graphics.setColor(Color.GRAY);
		graphics.fillOval(45,100, 20, 80);
		graphics.setColor(Color.BLACK);
		graphics.drawLine(1250, 150, 1250, 10);
		graphics.setColor(Color.GREEN);
		graphics.fill3DRect(1300, 50, 40, 60, false);
	  }
}

