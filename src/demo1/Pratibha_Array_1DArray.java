package demo1;

public class Pratibha_Array_1DArray 
{

	public static void main(String[] args) {
		
		// declaration
		
		String [] ar = new String [5];

		// initialization
		
		ar[0] = "Pratibha";
		ar[1] = "Prashant";
		ar[2] = "Rajveer";
		ar[3] = "Rudransh";
		ar[4] = "kavya";
		
		//usages         
		
		System.out.println("-------printing all info in array witout for loop---");
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);		
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		System.out.println(ar.length);	
	    System.out.println(ar.length-1);
	    
		System.out.println("----printing all info in array with for loop---");
		
		
				
		for (int i=0;  i<=(ar.length-1);  i++ )
		{
		System.out.println(ar[i]);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
