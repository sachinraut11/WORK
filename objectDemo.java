class Calc
{
	int num1;
	int num2;
	int result;
	
	
	public Calc()
	{
		num1=5;
		num2=5;
		System.out.println("In Constructor");
		}
	public Calc(int n)
	{
	num1 =n;
	num2 =n;
	}
	public Calc(double d)
	{
	num1=(int)d;
	}
public class objectDemo {

	public static void main(String[] args) {
		Calc obj=new Calc(7); //constructor
		
		System.out.println(obj.num1);
		
		
		
	}

	}

}
