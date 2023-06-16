package Practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Hashmap {
	
	public static void Hash()
	{
		HashMap<Integer,List<String>> namelist=new HashMap<Integer,List<String>>();
		ArrayList<String>names=new ArrayList<String>();
		names.add("Ade");
		names.add("ddd");
		names.add("fff");
		names.add("eee");
		ArrayList<String>names1=new ArrayList<String>();
		names1.add("Ade1");
		names1.add("ddd1");
		names1.add("fff1");
		names1.add("eee1");
		
		namelist.put(1000,names);
		namelist.put(2000,names1);
		/*namelist.put(3000, "sss");
		namelist.put(4000,"Rich");*/
		Map(namelist);
		
	}
    public static void Map(HashMap<Integer,List<String>> namelist)
    {
    	for(Entry<Integer,List<String>> student: namelist.entrySet())
    	{
    		System.out.println("Roll Number:"+ student.getKey());
    		List<String> details=student.getValue();
    		for(String detail:details)
    		{
    			System.out.println(detail);
    		}
    		//System.out.println("Student Name:"+ student.getValue());
    		
    	}
    		
    }
	public static void main(String[] args) {
		
    Hash();
	}

}
