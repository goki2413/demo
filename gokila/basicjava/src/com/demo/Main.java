package com.demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char search=s.next().charAt(0);
		Count co=new Count();
		int c=co.countChar(str, search);
System.out.println("char:"+search+" "+"occured:"+c);
		}


	}


