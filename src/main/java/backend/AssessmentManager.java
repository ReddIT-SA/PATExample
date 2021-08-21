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

	/**
	 * This is a "Class" level variable, remember to declare it as static.
	 * Open the assessments.txt file to see its structure.
	 */
	private static String fileName = "data//assessments.txt";

	/**
	 * Reads from the "assessments.txt" file to get a list of assessments
	 *
	 * @return a multi-lined string containing all current assessments
	 */
	public static String getAssessments() {
		try {
			/**
			 * Scanners scan either strings or files. To scan a
			 * file, you must create a file object with the path
			 * name. Note: use relative path names (i.e. start the
			 * name from your netbeans project folder).
			 */
			File f = new File(fileName);
			Scanner sc = new Scanner(f);

			//The string that we add to and return
			String output = "";

			/**
			 * the hasNext() methods don't move the position in the
			 * file, they just check if there is more in the file
			 */
			while (sc.hasNextLine()) {
				/**
				 * We dont want the whole line, only up to the
				 * '#' . We create a string scanner to only get
				 * the first token in the line
				 */
				String line = sc.nextLine();
				Scanner linesc = new Scanner(line).useDelimiter("#");

				/**
				 * This returns the first token (we ignore the
				 * next token (which is the "type" of
				 * assessment.
				 */
				output += linesc.next() + "\n";
				linesc.close();
			}
			//ALWAYS close a scanner!!!
			sc.close();
			return output;
		} catch (FileNotFoundException ex) {
			System.out.println("Assessments file not found");
			return null;
		}
	}

	/**
	 * Similar to getAssessments() but returns each line as an element in a
	 * String array
	 *
	 * @return A String array of all the assessments
	 */
	public static String[] getAssessmentsAsArray() {
		try {
			Scanner sc = new Scanner(new File(fileName));

			//We can only create an array if we know how long the array is
			int numAssessments = getNumAssessments();
			String[] outputArr = new String[numAssessments];

			//This tells us where in the array we are adding an element
			int currentIndex = 0;
			while (sc.hasNextLine()) {
				String line = sc.nextLine();

				Scanner linesc = new Scanner(line).useDelimiter("#");

				/**
				 * instead of adding all the assessments to one
				 * multi-lined string, we add each assessment to
				 * a position in an array.
				 */
				outputArr[currentIndex] = linesc.next();
				//move the index forward by one
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

	/**
	 * a private helper method to count how many assessments are in the
	 * assessments.txt file
	 */
	private static int getNumAssessments() {
		try {
			Scanner sc = new Scanner(new File(fileName));
			int count = 0;
			while (sc.hasNextLine()) {
				/**
				 * we dont use the string returned, we just move
				 * forward by one line in the file
				 */
				sc.nextLine();
				//count each line skipped
				count++;
			}
			sc.close();
			return count;
		} catch (FileNotFoundException ex) {
			System.out.println("Assessments file not found");
			return -1;
		}
	}

	/**
	 * Appends an assessment to the assessments text file
	 *
	 * @param assessmentName The name of the current assessment, e.g. "Term
	 * 1 Theory Test"
	 * @param assessmentType Either "Practical" or "Theory"
	 */
	public static void addAssessment(String assessmentName, String assessmentType) {
		try {
			/**
			 * A scanner "reads" a file, a printwriter "writes" to
			 * files A scanner needs a file object to read from, a
			 * printwriter needs a filewriter object to write with
			 * (the boolean value is to "append" - true or
			 * "overwrite" - false.
			 */
			FileWriter fw = new FileWriter(fileName, true);
			PrintWriter pw = new PrintWriter(fw);
			//add to the text file in the pre-constructed format.
			pw.println(assessmentName + "#" + assessmentType);
			//ALWAYS close a printwriter!!!!
			pw.close();
		} catch (IOException ex) {
			System.out.println("Could not write to file");
		}
	}

	/**
	 * Deletes an assessment from the assessment text file
	 *
	 * @param assessmentName The name of the assessment to be deleted
	 */
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
					/**
					 * only add to the output string if it
					 * is NOT the assessment to delete
					 */
					output += line + "\n";
				}
			}
			sc.close();

			/**
			 * use a printwriter with the "overwrite" option to
			 * re-write all the assessments without the deleted one
			 */
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
