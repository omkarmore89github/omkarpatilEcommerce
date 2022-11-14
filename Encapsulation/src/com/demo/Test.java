package com.demo;

import java.util.Scanner;

public class Test {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println ("Enter Student Name  >>");
	String name=sc.next();
	
	System.out.println("Enter Student RollNo >>");
	int rollno = sc.nextInt();
	
	System.out.println("Enter Student Id >>");
	int id = sc.nextInt();
	
	
	Student student= new Student();
	student.setStdName(name);
	student.setStdRollNo(rollno);
	student.setStdId(id);
	
	
	System.out.println ("StudentName >>"+student.getStdName());
	System.out.println ("StudentRollNo >>"+student.getStdRollNo());
	System.out.println ("StudentId  >>" +student.getStdId());
	
	
}
}
