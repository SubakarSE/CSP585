
public class Dalmatian extends Dog implements Animal {

	public String Name;
	public int Id;
	public int Age;
	public int Type;
	public int Breed;
	public int ReadyForAdoption;
	
	public Dalmatian (String Name, int Id, int Age, int Type,int Breed, int ReadyForAdoption)
	{
		this.Name= Name;
		this.Id= Id;
		this.Age=Age;
		this.Type=Type;
		this.Breed=Breed;
		this.ReadyForAdoption=ReadyForAdoption;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
	}


	@Override
	public void toPrint() {
		System.out.println("Inside Dalmatian's Class\n");
		System.out.println(Name);
		System.out.println(Id);
		System.out.println(Age);
		System.out.println(Type);
		System.out.println(Breed);
		System.out.println(ReadyForAdoption);
	}

}
