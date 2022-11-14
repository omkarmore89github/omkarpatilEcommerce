package com.demo;

import java.util.Scanner;

public class PlayerInfo {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner (System.in);
		System.out.println (" Players Name >>");
		String pname = sc.next();
		
		System.out.println ("Players Id >>");
		int Id = sc.nextInt();
		
		System.out.println ("Players  Age >>");
		int pAge = sc.nextInt();
		
		Player player = new Player ();
		player.setpName(pname);
		player.setpId(Id);
		player.setpAge(pAge);
		
		System.out.println ("Player Name is >>"+ player.getpName());
		System.out.println ("Player ID   is >>"+ player.getpId());
		System.out.println ("Player Age  is >>"+ player.getpAge());
		
		
		
	}

		
	
		
	}

