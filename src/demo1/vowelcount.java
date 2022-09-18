package demo1;

public class vowelcount {

	
	public static void main(String[] args) {
		
		 String S = "welcome india";
		 
		char[]letters= S.toCharArray();
		int count=0;
		
		for(char c: letters)
		{
			switch(c)
			{
			case'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			 count++;
			 break;
			 default :
			}
		}
		System.out.println("total vowels in string=" + count);	
	}
}


