package org.krishna.advance.streamAPI;

	

import java.util.ArrayList;
import java.util.List;

import org.krishna.advance.Lambda.Student;

public class TestMin2 {

	public static void main(String[] args) {
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1,"Anitha","java"));
		slist.add(new Student(2,"mahi","sql"));
		slist.add(new Student(3,"Raju","html"));
		slist.add(new Student(4,"abi","java"));
		slist.add(new Student(5,"Ravi","aws"));
		slist.add(new Student(6,"chinna","jdbc"));
		
		Student student=slist.stream().min((e1,e2)->{
		return e1.getName().compareToIgnoreCase(e2.getName());
		}).get();
		System.out.println(student);

		Student student1=slist.stream().min((e1,e2)->{
		return e1.getCourse().compareToIgnoreCase(e2.getCourse());
		}).get();
		System.out.println(student1);
		

		Student student2=slist.stream().min((e1,e2)->{
		return e1.getId()-(e2.getId());
		}).get();
		System.out.println(student2);

	}

}
