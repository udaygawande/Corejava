package Feb8;

import java.util.HashSet;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> set=new HashSet<>();
		set.add("Mumbai");
		set.add("pune");
		set.add("Mumbai");
		set.add("pune");
		set.add("Mumbai");
		set.add("Mumbai");

	System.out.println(set);
	for(String s:set)
	{
		System.out.println(s);
		
	}
	}

}
