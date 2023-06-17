package Practice;
import java.util.ArrayList;

public class Arraylt {
	
	
	/*public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Adeline");
		al.add("Grace");
		al.add("Rich");
		al.add("Ajit");
		
		System.out.println(al);
		
	}*/
	public static void Numbers()
	{
		ArrayList<Integer> inte=new ArrayList<Integer>();
		inte.add(199);
		inte.add(344);
		inte.add(899);
		inte.add(900);
		calculate(inte);
	}
	public static void calculate(ArrayList<Integer> inte)
	{
		
		int sum=0;
		for(int value:inte)
		{
			
		sum=sum+value;
		
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Numbers();
	}
}
