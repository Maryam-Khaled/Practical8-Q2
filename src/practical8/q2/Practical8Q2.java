/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical8.q2;

import java.util.*;
public class Practical8Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Problem 2: 
//The initials of a person’s name are defined by the first letter of the first 
//name and the first letter of the last name java classes. 
//1. Implement a class called Initials. 
//2. Implement all the instance variables in the class using the private access modifier. 
//3. Write a constructor that takes two initials firstI and secondI, and makes 
//the user enters his first and last name.
// 4. Write a method that compares the two initials firstI and secondI with the 
//first letter of the first and the last name entered by the user, it 
//should return true if the initials are identical with the initials of the first
//and last name otherwise the method should return false.
// 5. Write the getter methods for firstI and secondI variables.
// 6. Write a method char getFirstNameInitial() and char getFirstNameInitial()
//to get only the first initials of each string. 
//7. Write a main method to test all the methods defined in the class Initials.

          Scanner s = new Scanner(System.in);
          
          Initials i = new Initials((char)('a' + Math.random() * ('z' - 'a' + 1)), (char)('a' + Math.random() * ('z' - 'a' + 1)));
          
          System.out.println("Enter your first and last name: ");
          String firstName = s.next();
          String lastName = s.next();
          
          System.out.println("First name: " + firstName + "\nLast name: " + lastName);
          System.out.println("First Initial: " + i.getfNameI(firstName) + "\nLast Initial: " + i.getlNameI(lastName));
          System.out.println("First Initial of my choice: " + i.getFirstI() + "\nLast initial of my choice: "
                  + i.getSecondI());
          System.out.println("It is " + i.compare(firstName, lastName) +
                  " that both the initials are equal");

    }
    
}
