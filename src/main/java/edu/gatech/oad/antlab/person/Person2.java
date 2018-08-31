package edu.gatech.oad.antlab.person;

import java.util.ArrayList;
import java.util.List;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int randIndex = (int)(Math.random() * (arr.length - 1));
            char temp = arr[randIndex];
            arr[randIndex] = arr[i];
            arr[i] = temp;
        }
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
