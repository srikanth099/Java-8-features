package org.krishna.advance.streamAPI;


import java.util.ArrayList;
import java.util.List;

import org.krishna.advance.Lambda.Student;
	public class TestMax3 {
	public static void main(String[] args) {
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1,"Anitha","java"));
		slist.add(new Student(2,"mahi","sql"));
		slist.add(new Student(3,"Raju","html"));
		slist.add(new Student(4,"abi","java"));
		slist.add(new Student(5,"Ravi","aws"));
		slist.add(new Student(6,"chinna","jdbc"));
					
		Student student=slist.stream().max((e1,e2)->{
			return e1.toString().compareToIgnoreCase(e2.toString());
				}).get();
			System.out.println(student);
			}
			}
