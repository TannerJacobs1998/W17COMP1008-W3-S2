/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17jan25;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author tannerwolfejacobs
 */
public class W17Jan25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HourlyEmployee employee1 = new HourlyEmployee("Fred", "Flintstone", 1234, 
                                                    LocalDate.of(1998, Month.MARCH, 14),30);
        System.out.printf("Employee1 is %s%n", employee1);
        System.out.printf("the employee was born on %s, that was a %s%n", 
                                employee1.getDateOfBirth(), employee1.getDateOfBirth().getDayOfWeek());
        
        Employee employee2 = new HourlyEmployee("Tanner","TREX",1234, LocalDate.of(1998, Month.MARCH, 16),30);
        System.out.printf("Employee2 is %s%n", employee2);
         System.out.printf("the employee was born on %s, that was a %s%n", 
                                employee2.getDateOfBirth(), employee2.getDateOfBirth().getDayOfWeek());
    }
    
}
