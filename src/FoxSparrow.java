import javax.swing.ImageIcon;


public class FoxSparrow extends Sparrow {
	
	public static int Identifier = 5;
	public String Name;
	public int Id;
	public int Age;
	public String Type;
	public String Breed;
	public String ReadyForAdoption;
	public String Notes;
	public String MedicalCondition;
	
	public FoxSparrow (String Name, int Id, int Age, String Type,String Breed, String ReadyForAdoption, String Notes, String MedicalCondition)
	{
		this.Name= Name;
		this.Id= Id;
		this.Age=Age;
		this.Type=Type;
		this.Breed=Breed;
		this.ReadyForAdoption=ReadyForAdoption;
		this.Notes = Notes;
		this.MedicalCondition = MedicalCondition;
	}
	
	@Override
	public ImageIcon draw(){
		 ImageIcon aboutIcon = new ImageIcon("src//image//Sparrow.png");
		 return aboutIcon;
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

}
