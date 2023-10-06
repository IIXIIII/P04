//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:    all of the methods needed for the course enrollment management app
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
// Partner Lecturer's Name: NONE
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


// BE SURE to credit outside help

// NO additional imports are allowed
import java.util.zip.DataFormatException;

// TODO complete the below class header with a descriptive description
/**
 * TODO Add a descriptive class header
 */
public class StudentRecord {

  // TODO add fields with respect to the details in the javadocs

  /**
   * Constructor for a student record object. Assigns values to all fields.
   * 
   * @param name     the name of the student
   * @param email    the email of the student
   * @param campusID the campusID of the student
   * @param preReq   the boolean representing if the student satisfies the prerequisites
   * @throws DataFormatException with message "Bad name, email, or campusID!" if name or email or
   *                             campusID are NOT valid
   */
  public StudentRecord(String name, String email, String campusID, boolean preReq)
      throws DataFormatException {
    // TODO complete the implementation of this constructor
    // [HINT] implement the below methods isValidName(), isValidEmail(), and isValidCampusID() FIRST
  }

  /**
   * Validator method for a student's name
   * 
   * @param name the student's name
   * @return true if and only if the name is not null and not blank
   */
  public static boolean isValidName(String name) {
	// TODO implement this method
	return false; // default return statement
  }

  /**
   * Validator method for a student's email
   * 
   * @param email the student's email
   * @return true if and only if the email is not null, has one @ symbol, ends with .edu, is between
   *         0 and 40 characters (EXCLUSIVE, that is, 0 and 40 are not allowed lengths but 1 and 39
   *         are), and has at least two characters before the @ symbol.
   */
  public static boolean isValidEmail(String email) {
	// TODO implement this method
	return false; // default return statement
  }

  /**
   * Validator method for a student's id
   * 
   * @param campusID the student's campusID
   * @return true if and only if the campusID is not null and can be parsed to a long with
   *         10-digits. Extra leading and trailing whitespace should be disregarded.
   */
  public static boolean isValidCampusID(String campusID) {
	// TODO implement this method
	return false; // default return statement
  }

  /**
   * Getter method for a student's name
   * 
   * @return the student's name
   */
  public String getName() {
	// TODO implement this method
	return null; // default return statement
  }

  /**
   * Getter method for a student's email
   * 
   * @return the student's email
   */
  public String getEmail() {
	// TODO implement this method
	return null; // default return statement
  }

  /**
   * Getter method for a student's campusID
   * 
   * @return the student's campusID
   */
  public String getCampusID() {
	// TODO implement this method
	return null; // default return statement
  }

  /**
   * Returns true if this student record satisfies the pre-requisites of the course
   * 
   * @return true if this student record satisfies the pre-requisites of the course
   */
  public boolean isPrerequisiteSatisfied() {
	// TODO implement this method
	return false; // default return statement
  }

  /**
   * Compared this StudentRecord to the specified object
   * 
   * @return true if anObject is instanceof StudentRecord and has the same campusID as this
   *         StudentRecord.
   */
  public boolean equals(Object other) {
	// TODO implement this method
	return false; // default return statement
  }


  /**
   * Returns a string representation of this student record in the following format (comma followed
   * by a space ", " separated): <BR>
   * name, email, campusID, preReqValue
   * 
   * @return the string representation of a studentRecord as described above
   */
  @Override
  public String toString() {
	// TODO implement this method
    return null; // default return statement
  }
}
