package demo1;

import java.util.ArrayList;
import java.util.Iterator;

public class satish_2ndprogam {
	

	
	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		
		al.add("satish sarak");
		al.add("SATISH SARAK");
		al.add(100);
		al.add('a');
		al.add('a');
		al.add(100);
		al.add('A');
		al.add(null);
		al.add(30.3f);
		al.add(null);
		al.add(100);
		
		System.out.println(al);
		
		//print all statement using iterator
		Iterator itr= al.iterator();
		
		while(itr.hasNext(  ))
		{
			
		System.out.println(itr.next( ));
			//System.out.print(itr.next());
			
		}
	}
}
