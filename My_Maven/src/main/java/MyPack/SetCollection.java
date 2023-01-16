package MyPack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection
{

	public static void main(String[] args)
	{
		Set hash_Set=new HashSet();
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add("arunima");
		System.out.println(ar);
		
		hash_Set.add("anna");
		hash_Set.add("aami");
		hash_Set.add("anupama");
		hash_Set.add(500);
		//hash_Set.add(101.35f);
		hash_Set.add("veena");
		hash_Set.add("chinchu");
		hash_Set.add("manu");
		hash_Set.add("vishnu");
		hash_Set.add("anu");
		System.out.println(hash_Set);
		
		boolean b=hash_Set.contains("john");
		System.out.println(b);
		boolean b1=hash_Set.contains("anu");
		System.out.println(b1);
		
		hash_Set.remove("anupama");
		System.out.println(hash_Set);
		
		Iterator<String> it=hash_Set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
