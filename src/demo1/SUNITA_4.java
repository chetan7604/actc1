package demo1;

import java.util.Vector;

public class SUNITA_4 
{

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add("pqr");
		v.add(30);
		v.add(4);
		v.add('V');
		v.add(null);
		v.add(null);
		v.add(null);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.contains(4));
		System.out.println(v.indexOf('V'));

	}

}
