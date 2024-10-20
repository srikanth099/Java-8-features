package org.krishna.advance.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DriverStu {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("starting letter");
//		String string=scn.nextLine();
		int filter=scn.nextInt();
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1,"berry","html"));
		slist.add(new Student(2,"abi","java"));
		slist.add(new Student(3,"mahi","AWS"));
		slist.add(new Student(4,"chandu","AWS"));

		slist.add(new Student(5,"aerry","AWS"));

		
		slist.add(new Student(6,"derry","java"));
		switch(filter)
		{
		case 1:
			List<Student>filteredList =slist.stream().filter(e->{
			return e.getName().startsWith("a");
		}).collect(Collectors.toList());
		for(Student s:filteredList) {
			System.out.println(s);
		}
		
		break;
		
		case 2:
			
			Predicate<Student> Pre=new Predicate<Student>() {
				@Override
				public boolean test(Student t) {
					return t.getCourse().equalsIgnoreCase("java");
					
				}
			};
			List<Student> filteredList2=slist.stream().filter(Pre).collect(Collectors.toList());
			for(Student s:filteredList2) {
				System.out.println(s);
			}
				break;
				
		case 3:
			
			Predicate<Student> name=new Predicate<Student>() {
				@Override
				public boolean test(Student t) {
					return t.getName().equalsIgnoreCase("berry");
//					t.getName().equalsIgnoreCase("anupama");
//					t.getName().equalsIgnoreCase("abi");
					
				}
			};
			List<Student> filteredList3=slist.stream().filter(name).collect(Collectors.toList());
			for(Student s:filteredList3) {
				System.out.println(s);
			}
			
			
			break;
			}
		}
}
