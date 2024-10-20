package org.krishna.advance.streamAPI;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.krishna.advance.Lambda.Student;

public class StudentDistinct {

	public static void main(String[] args) {
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1,"chandu","java"));
		slist.add(new Student(2,"mahi","SQL"));
		slist.add(new Student(3,"Raju","HTML"));
		slist.add(new Student(4,"abi","JAVA"));
		slist.add(new Student(4,"Ravi","java"));
		slist.add(new Student(4,"chinni","java"));
		slist.add(new Student(4,"Ravi","java"));
		slist.add(new Student(4,"chinni","java"));
		List<Student> list=slist.stream().distinct().collect(Collectors.toList());
		list.forEach(e-> System.out.println(e));
	}

}
