package mypack;

interface MathOperations
{
	int operatation(int a,int b);
}
public class LambdaExpression {

	public static void main(String[] args) {
		MathOperations m = new MathOperations(){

			@Override
			public int operatation(int a,int b) {
				
				return a+b;
			}
			
		};
		
		System.out.println(m.operatation(2, 2));
		
		MathOperations m1 = (a, b) -> a+b;
		
		
		System.out.println(m1.operatation(5, 5));
		

	}

}
