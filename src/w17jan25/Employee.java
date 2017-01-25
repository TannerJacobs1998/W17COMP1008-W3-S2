/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17jan25;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author tannerwolfejacobs
 */
public abstract class Employee {
    private String firstName, lastName;
    private int socialInsuranceNum;
    private LocalDate dateOfBirth;
    
    public Employee(String first, String last, int sin, LocalDate dob)
    {
        firstName = first;
        lastName = last;
        socialInsuranceNum = sin;
        setBirthday(dob);
        
    }
    
    /**
     * This method will return the employees first and last name
     */
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
    
    /**
     * This method will validate that the employee is 15-90 years old and set the 
     * date of birth instance variables
     */
    public void setBirthday(LocalDate dob) // valid employee dob
    {
        LocalDate today = LocalDate.now();
        
        int age = Period.between(dob,today).getYears();
        
        if (age >= 15 && age <= 90)
            this.dateOfBirth = dob;
        else
            throw new IllegalArgumentException ("The employee must be 15-90 years old");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSocialInsuranceNum() {
        return socialInsuranceNum;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
   public abstract PayCheque getPayCheque();
}

