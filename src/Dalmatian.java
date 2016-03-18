import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Dalmatian extends JPanel implements Animal,Dog {
	
	public static int Identifier = 1;
	public char[] Name;
	public int Id;
	public int Age;
	public String Type;
	public String Breed;
	public String ReadyForAdoption;
	public String Notes;
	public String MedicalCondition;
	static Dalmatian d=null;
	
	public Dalmatian(String Name){
		this.Name= Name.toCharArray();
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
	
	public char[] getAnimalName(){		
		return this.Name;
	}	

}
