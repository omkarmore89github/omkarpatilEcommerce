package com.demo;

import java.util.Scanner;

public class Marks {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println ( "Student Name  >>");
		String stdname = sc.next();
		
		System.out.println ("Student Physics Marks >>");
		int phymarks = sc.nextInt();
		
		System.out.println ("Student Chemistry Marks >>");
		int chemmarks = sc.nextInt();
		
		System.out.println ("student Biology Marks >>");
		int biomarks = sc.nextInt();
	
		
		
		StudentMarks stdmarks = new StudentMarks ();
		stdmarks.setStudentName(stdname);
		stdmarks.setPhyMarks(phymarks);
		stdmarks.setChemMarks(chemmarks);
		stdmarks.setBioMarks(biomarks);
		
		
		
		
	
		System.out.println (" Student Name >>>"+ stdmarks.getStudentName());
		System.out.println (" Student Physics Marks >>>"+ stdmarks.getPhyMarks());
		System.out.println (" Student Chemistry  Marks >>>"+ stdmarks.getChemMarks());
		System.out.println (" Student Biology  Marks >>>"+ stdmarks.getBioMarks());
		
		
	}

	
		
	
	}

