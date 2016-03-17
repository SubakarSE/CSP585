import javax.swing.ImageIcon;

//Abstract Class Mammal which implements animal
public interface Mammal extends Animal{
	public abstract ImageIcon draw();
	public abstract String toString();
	public abstract int getIdentifier();
}
