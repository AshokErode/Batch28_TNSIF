package statements;

public class WhileDemo {

	public static void main(String[] args) 
	{
		int i=99;
		while(i<=100)//99<=100 t//100<=100 t//101<=100 f
		{
			System.out.println(i);//99 100 
			i++;//i=i+1; 
		}
		System.out.println("Loop Ends");
	}

}
