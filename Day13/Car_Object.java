package Day13;

class Car
{
	private String Model;
	private String Colour;
	private int Warranty;

public Car(String Model, String Colour, int Warranty)
{
	this.Model= Model;
	this.Colour= Colour;
	this.Warranty= Warranty;
}
public void start()
{
	System.out.println("Model:"+ Model);
}
public void display()
{
	System.out.println("Car:"+ Model);
	System.out.println("Colour:"+ Colour);
	System.out.println("Warranty:"+ Warranty);
}
}
public class Car_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1= new Car("Audi", "White", 10);
		obj1.start();
		obj1.display();
	}

}
