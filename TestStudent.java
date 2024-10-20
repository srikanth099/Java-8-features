package org.krishna.advance.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1,"Anitha","java"));
		slist.add(new Student(2,"mahi","sql"));
		slist.add(new Student(3,"Raju","html"));
		slist.add(new Student(4,"abi","java"));
		
		Comparator<Student>com =(e1,e2)->{
    		//return e1.getId()-e2.getId();
			return e1.getCourse().compareToIgnoreCase(e2.getCourse());

    		
	};
	Collections.sort(slist,com);
	for(Student c:slist)
	{
		System.out.println(c);
	}
	}
}
