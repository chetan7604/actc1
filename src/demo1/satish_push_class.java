package demo1;

public class satish_push_class 
{


	// *
	// *  *
	// *  *  *
	// *  *  *  *
	// *  *  *  *  *
	// *  *  *  *  *  *
	
	public static void main(String[]args)
	{
		
		int star=1;
		
		for(int i=1; i<=6; i++)   // outer loop for coulumn
		{
			for(int j=1; j<=star; j++)  // inner loop for row
			{
				System.out.print("*  ");
			}
			
			System.out.println();
			star++;		
		
		}

}

	}		
