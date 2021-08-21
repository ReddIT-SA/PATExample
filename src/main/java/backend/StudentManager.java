/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class StudentManager {

	private static String fileName = "data//students.txt";

	public static String getStudents() {
		try {
			Scanner sc = new Scanner(new File(fileName));
			String output = "";

			while (sc.hasNextLine()) {
				output += sc.nextLine() + "\n";
			}
			sc.close();
			return output;
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
			return null;
		}
	}

	public static String[] getStudentsAsArray() {
		try {
			Scanner sc = new Scanner(new File(fileName));
			int numStudents = getNumStudents();
			String[] outputArr = new String[numStudents];
			int currentIndex = 0;
			while (sc.hasNextLine()) {
				outputArr[currentIndex] = sc.nextLine();
				currentIndex++;
			}
			sc.close();
			return outputArr;
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
			return null;
		}
	}

	private static int getNumStudents() {
		try {
			Scanner sc = new Scanner(new File(fileName));
			int count = 0;
			while (sc.hasNextLine()) {
				sc.nextLine();
				count++;
			}
			sc.close();
			return count;
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
			return -1;
		}
	}

	public static void addStudent(String name, String surname) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(fileName, true));
			pw.println(name + " " + surname);
			pw.close();
		} catch (IOException ex) {
			System.out.println("Could not write to file");
		}
	}

	public static void deleteStudent(String name, String surname) {
		try {
			Scanner sc = new Scanner(new File(fileName));
			String output = "";
			String fullname = name + " " + surname;

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.equalsIgnoreCase(fullname)) {
					output += line + "\n";
				}
			}
			sc.close();

			PrintWriter pw = new PrintWriter(new FileWriter(fileName, false));
			pw.print(output);
			pw.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete student");
		}
	}
}
