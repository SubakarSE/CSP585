
public class AnimalFactory {
	
	public static Animal getAnimal(String animalName) {

		Animal animal=null;
		if(animalName.equals("Poodle")){
			animal = Poodle.getAnimal();
		}
		else if(animalName.equals("American")){
			animal = American.getAnimal();
		}
		return animal;
	}

}
