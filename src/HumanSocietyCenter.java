import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;



public class HumanSocietyCenter {
	
	public void inputData()
	{
		
	}

	public static void main(String[] args) {
	
		
		ArrayList<Dog> dl = new ArrayList<Dog>();
		ArrayList<Cat> cl =new ArrayList<Cat>();
		ArrayList<Chicken> chl = new ArrayList<Chicken>();
		ArrayList<Sparrow> sl = new ArrayList<Sparrow>();
		Dog d;
		int selection,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Human Society Center \n");
		System.out.println("Press Enter to start \n");
		try{
			System.in.read();
		}
		catch(Exception e){}
		do{
			JOptionPane.showMessageDialog(null, "loop", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
		System.out.println("Please enter the animal name \n");
		String animal_name = sc.next();
		System.out.println("Please enter the ID \n");
		int id = sc.nextInt();
		System.out.println("Please enter the animal's Age\n");
		int animal_age = sc.nextInt();
		System.out.println("Please make a choice \n");
		System.out.println("1. Dog\t 2. Cat \n");
		int animal_type = sc.nextInt();
		//JOptionPane.showMessageDialog(null, animal_type.length(), "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
		System.out.println("Please enter the Animal's Breed \n");
		System.out.println("1. Poddle \t 2. Dalmatian \n");
		int animal_breed = sc.nextInt();
		System.out.println("Is it Ready For Adoption \n");
		int ready_for_adoption = sc.nextInt();
		//JOptionPane.showMessageDialog(null, int_type, "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, animal_breed, "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
		
		switch(animal_type)
		{
			case 1:
		{
			if(animal_breed == 1)
			{
			d = new Poodle(animal_name,id,animal_age,animal_type,animal_breed,ready_for_adoption);
			dl.add(d);
			}
			else if(animal_breed == 2)
			{
			d = new Dalmatian(animal_name,id,animal_age,animal_type,animal_breed,ready_for_adoption);
			dl.add(d);
			d.toPrint();
			}
			System.out.println("Do you want to add one more animal\n");
			System.out.println("1. Yes \t 2. No \n");
			selection = sc.nextInt();
			if(selection == 1){
				JOptionPane.showMessageDialog(null, selection, "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
				i = 0;
				JOptionPane.showMessageDialog(null, i, "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				i=2;
			}
			break;
		}
		}
		JOptionPane.showMessageDialog(null, "Out of Switch", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
		}while(i==0);
		
		
		}
		
		
	}

