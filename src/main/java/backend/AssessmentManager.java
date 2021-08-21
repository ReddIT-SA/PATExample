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
public class AssessmentManager {

	private static String fileName = "data//assessments.txt";

	public static String getAssessments() {
		try {
			Scanner sc = new Scanner(new File(fileName));
			String output = "";

			while (sc.hasNextLine()) {
				String line = sc.nextLine();

				Scanner linesc = new Scanner(line).useDelimiter("#");
				output += linesc.next() + "\n";
				linesc.close();
			}
			sc.close();
			return output;
		} catch (FileNotFoundException ex) {
			System.out.println("Assessments file not found");
			return null;
		}
	}

	public static String[] getAssessmentsAsArray() {
		try {
			Scanner sc = new Scanner(new File(fileName));
			int numAssessments = getNumAssessments();
			String[] outputArr = new String[numAssessments];
			int currentIndex = 0;
			while (sc.hasNextLine()) {
				String line = sc.nextLine();

				Scanner linesc = new Scanner(line).useDelimiter("#");
				outputArr[currentIndex] = linesc.next();
				currentIndex++;
				linesc.close();
			}
			sc.close();
			return outputArr;
		} catch (FileNotFoundException ex) {
			System.out.println("Assessments file not found");
			return null;
		}
	}

	private static int getNumAssessments() {
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
			System.out.println("Assessments file not found");
			return -1;
		}
	}

	public static void addAssessment(String assessmentName, String assessmentType) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(fileName, true));
			pw.println(assessmentName + "#" + assessmentType);
			pw.close();
		} catch (IOException ex) {
			System.out.println("Could not write to file");
		}
	}

	public static void deleteAssessment(String assessmentName) {
		try {
			Scanner sc = new Scanner(new File(fileName));
			String output = "";

			while (sc.hasNextLine()) {
				String line = sc.nextLine();

				Scanner linesc = new Scanner(line).useDelimiter("#");
				String currentAssessmentName = linesc.next();
				linesc.close();

				if (!currentAssessmentName.equalsIgnoreCase(assessmentName)) {
					output += line + "\n";
				}
			}
			sc.close();

			PrintWriter pw = new PrintWriter(new FileWriter(fileName, false));
			pw.print(output);
			pw.close();

			updateResults(assessmentName);
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete student");
		}
	}

	private static void updateResults(String assessmentName) {
		//to do
		//remove all results for this assessment from the results textfile
	}
}
