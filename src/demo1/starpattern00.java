package demo1;

public class starpattern00 
{

	//* * * * *
	//* * * *
	//* * * 
	//* *
	//*
	public static void main(String[] args) 
	{
		int star=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print(" ");
				System.out.print("* ");
			}
			System.out.println();
			star--;
		}
	}

}
