package demo1;

import java.util.TreeSet;

public class SUNITA_3 
{

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(5);
		ts.add(60);
		ts.add(70);
		ts.add(40);
		ts.add(100);
		System.out.println(ts);
		ts.remove(40);
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.contains(5));

	

	}

}
