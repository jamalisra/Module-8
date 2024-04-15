/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

	public static void main(String[] args) {
		// Creating instances of Student, Freshman, and Senior classes
		Student std1= new Student("James",  (short) 20);
		Freshman std2= new Freshman("Josh", (short) 20, 12);

		Senior std3 = new Senior("John", (short) 30, 90);

		Scanner scnr = new Scanner(System.in);

		System.out.print("Enter GPA for " + std1.getName() + ": ");
		double GPA1 = scnr.nextDouble();
		std1.setGPA(GPA1);
		System.out.println(std1);

		System.out.print("Enter GPA for " + std2.getName() + ": ");
		double GPA2 = scnr.nextDouble();
		std2.setGPA(GPA2);
		System.out.println(std2);

		System.out.print("Enter GPA for " + std3.getName() + ": ");
		double GPA3 = scnr.nextDouble();
		std3.setGPA(GPA3);
		System.out.println (std3);
	}
}
