package demo1;

public class revesrestringword1 {
	
	public static void main(String[] args) {
		
	
	String s= "we are three";
	String[] parts= s.split(" ");
	for(int i=parts.length-1; i>=0; i--)
	{
		System.out.print(parts[i]+ " ");
	}
}

}
