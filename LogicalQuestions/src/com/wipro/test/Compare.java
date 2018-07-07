package com.wipro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class MyComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		//Person e1=(Person)o1.getCity();
		//Person e2=(Person)o1;
		//return o1.getId()-o2.getId();
		int length1=o1.getFirstName().length();
		int length2=o2.getFirstName().length();
		if(length1<length2)
		{
			return -1;
		}
		else if(length1>length2)
			return -1;
		else 
			return o1.getFirstName().compareTo(o2.getFirstName());
		//return o1.getId().compareTo(o2.getId());
		//return e1.compareTo(e2);
		
	}
	
}

public class Compare{
	
	public static void main(String[] args) {
		
		
		int a=066;
		System.out.println(a);
		List list=new ArrayList<Person>();
		list.add(new Person(1,"auro","samal","bangalore"));
		list.add(new Person(8,"aurosamla","samal","bangalore"));
		list.add(new Person(9,"auroxfv","samal","bangalore"));
		list.add(new Person(5,"aurodrg","samal","bangalore"));
		list.add(new Person(4,"aurotrt","samal","bangalore"));
		list.add(new Person(3,"aurogesrt","samal","bangalore"));
		Collections.sort(list,new MyComparator());
		Iterator< Person> itr=list.iterator();
		while(itr.hasNext()) 
			//Person p=itr.next();
		System.out.println(itr.next());
			//System.out.println(p);
		}
		
	//System.out.println(list);
		
		
	}


