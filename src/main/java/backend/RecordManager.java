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
public class RecordManager {

	//READ COMMENTS IN ASSESSMENT MANAGER FIRST
	private static String fileName = "data//records.txt";

	public static String getStudentRecords(String student) {
		try {
			Scanner sc = new Scanner(new File(fileName));
			String output = "";

			while (sc.hasNextLine()) {
				String line = sc.nextLine();

				Scanner linesc = new Scanner(line).useDelimiter("#");
				//Use the scanner to get the student name from
				//the line
				String currentStudent = linesc.next();
				//only if the student is the student we are looking
				//for should you add the record to the output
				//(excluding the students actual name
				if (currentStudent.equalsIgnoreCase(student)) {
					output += linesc.next() + " : " + linesc.next() + "\n";
				}
				linesc.close();
			}
			sc.close();
			return output;
		} catch (FileNotFoundException ex) {
			System.out.println("records file not found");
			return null;
		}
	}

	public static void addRecord(String name, String assessment, String percentage) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(fileName, true));
			pw.println(name + "#" + assessment + "#" + percentage);
			pw.close();
		} catch (IOException ex) {
			System.out.println("Could not write to file");
		}
	}
}
