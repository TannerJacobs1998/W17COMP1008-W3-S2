/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17jan25;

import java.time.LocalDate;

/**
 *
 * @author tannerwolfejacobs
 */
public class PayCheque {
    private LocalDate dateIsuued;
    private String employeeName;
    private double amount;
    private String memo;
    private int chequeNumber;
    private static int nextChequeNumber = 10001;

    public PayCheque( String employeeName, double amount, String memo) {
        this.dateIsuued = LocalDate.now();
        this.employeeName = employeeName;
        this.amount = amount;
        this.memo = memo;
        chequeNumber = nextChequeNumber;
        
        nextChequeNumber++;
    }

    public LocalDate getDateIsuued() {
        return dateIsuued;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getAmount() {
        return amount;
    }

    public String getMemo() {
        return memo;
    }

    public static int getNextChequeNumber() {
        return nextChequeNumber;
    }
    

}
