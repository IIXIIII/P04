//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:    Course Enrollment Tester
// Course:   CS 300 Fall 2023
//
// Author:   Will Chen / Jason Jisen Li
// Email:    lchen638@wisc.edu / jjli8@wisc.edu
// Lecturer: Hobbes LeGault 
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:    Will Chen / Jason Jisen Li
// Partner Email:   lchen638@wisc.edu / jjli8@wisc.edu
// Partner Lecturer's Name: Hobbes LeGault
// 
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
//   __x_ Write-up states that pair programming is allowed for this assignment.
//   __x_ We have both read and understand the course Pair Programming Policy.
//   __x_ We have registered our team prior to the team registration deadline.
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// Persons:         NONE
// Online Sources:  NONE
//
///////////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.zip.DataFormatException;

/**
 * This utility class implements unit tests to check the correctness of methods defined in the
 * ExceptionalCourseEnrollment class of the Exceptional Course Enrollment System program.
 *
 */
public class ExceptionalCourseEnrollmentTester {

  /**
   * Ensures the correctness of the StudentRecord.equals() method.
   * 
   * Defines at least two StudentRecord objects and checks for the following test cases:<BR>
   * (1) StudentRecord.equals() is expected to return true when passed a StudentRecord with the same
   * campusID as the current one. You can compare a student record to itself.<BR>
   * (2) StudentRecord.equals() is expected to return false when passed a StudentRecord with
   * campusID different from the campusID of the current student record. (3) StudentRecord.equals()
   * is expected to return false when passed a String as input (4) StudentRecord.equals() is
   * expected to return false when passed the reference null as input
   * 
   * 
   * @return true if and only if the tester verifies a correct functionality and false if at least
   *         one bug is detected
   */
  public static boolean studentRecordEqualsTester() {
    // TODO implement this method

    return false; // default return statement
  }

  /**
   * Ensures the correctness of the constructor of the StudentRecord class when called with VALID
   * input
   * 
   * @return true if and only if the tester verifies a correct functionality and false if at least
   *         one bug is detected
   */
  public static boolean studentRecordConstructorSuccessful() {
    // TODO implement this method

    return false; // default return statement
  }

  /**
   * Ensures the correctness of the constructor of the StudentRecord class when called with one
   * INVALID input
   * 
   * @return true if and only if the tester verifies a correct functionality and false if at least
   *         one bug is detected
   */
  public static boolean studentRecordConstructorUnSuccessful() {
    // TODO implement this method

    return false; // default return statement
  }

  /**
   * Ensures the correctness of the searchById() method
   * 
   * Creates an ArrayList which contains at least 2 student records, and defines at least two cases:
   * 
   * (1) successful search<BR>
   * (2) unsuccessful search<BR>
   * 
   * 
   * @throws NoSuchElementException if the search result is not found
   * @return true if and only if the tester verifies a correct functionality and false if at least
   *         one bug is detected
   */
  public static boolean searchByIdTester() {
    String errMsg = "Bug detected: search did not return the expected result.";
    try {
      // Create an arraylist which contains 3 student records
      ArrayList<StudentRecord> records = new ArrayList<StudentRecord>();
      StudentRecord s1 = new StudentRecord("Rob", "rob@wisc.edu", "1234567890", true);
      StudentRecord s2 = new StudentRecord("Joey", "joey@wisc.edu", "1233367890", true);
      StudentRecord s3 = new StudentRecord("NotHere", "no@wisc.edu", "111167890", true);
      records.add(s1);
      records.add(s2);

      // Finds a student in the arraylist

      StudentRecord r1 = ExceptionalCourseEnrollment.searchById(s1.getCampusID(), records);
      if (r1 != s1) {
        return false;
      }
      // Does'nt find a student not in the array
      try {
        ExceptionalCourseEnrollment.searchById(s3.getCampusID(), records);
        return false; // a NoSuchElementException was not thrown as expected
      } catch (NoSuchElementException e) {
        // check for the error message
        String expectedErrorMessage = "No student record found!";
        if (!e.getMessage().equals(expectedErrorMessage)) {
          System.out
              .println("The NoSuchElementException did not contain the expected error message!");
          return false;
        }
      }

    } catch (Exception e) {
      System.out.println(errMsg);
      return false;
    }


    try {

    } catch (Exception e) {
      return true;
    }
    return true;

  }

  // You are welcome but NOT required to implement additional tester methods at your choice

  /**
   * Runs all the tester methods defined in this class.
   * 
   * @return true if no bugs are detected.
   */
  public static boolean runAllTests() {
    boolean searchTesterOutput = searchByIdTester();
    System.out.println("searchTester: " + (searchTesterOutput ? "Pass" : "Failed!"));

    System.out.println("-----------------------------------------------");
    boolean studentRecordEqualsTesterOutput = studentRecordEqualsTester();
    System.out.println(
        "studentRecordEqualsTester: " + (studentRecordEqualsTesterOutput ? "Pass" : "Failed!"));

    System.out.println("-----------------------------------------------");
    boolean studentRecordConstructorSuccessfulOutput = studentRecordConstructorSuccessful();
    System.out.println("studentRecordConstructorSuccessful: "
        + (studentRecordConstructorSuccessfulOutput ? "Pass" : "Failed!"));
    
    System.out.println("-----------------------------------------------");
    boolean studentRecordConstructorUnSuccessfulOutput = studentRecordConstructorUnSuccessful();
    System.out.println("studentRecordConstructorUnSuccessful: "
        + (studentRecordConstructorUnSuccessfulOutput ? "Pass" : "Failed!"));
    System.out.println("-----------------------------------------------");
    return searchTesterOutput && studentRecordEqualsTesterOutput
        && studentRecordConstructorSuccessfulOutput;
  }

  /**
   * Main method to run this tester class.
   * 
   * @param args list of input arguments if any
   */
  public static void main(String[] args) {
    System.out.println("-----------------------------------------------");
    System.out.println("runAllTests: " + (runAllTests() ? "Pass" : "Failed!"));
  }

}
