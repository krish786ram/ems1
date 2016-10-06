interface I
{
	default void show()
	{
		System.out.println("From interface");
	}
}

class Test implements I
{
	@Override
	public void show()
	{
		I.super.show();
		System.out.println("Test implementation");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		I obj = new Test();
		
		obj.show();

	}

}
