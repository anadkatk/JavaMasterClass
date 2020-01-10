package com.unitTesting;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. ");
    }
    @org.junit.Before
    public void setup(){
        account = new BankAccount("Kevin","Anadkat",1010010, BankAccount.CHECKING);
        System.out.println("Running a test..");
    }

    @org.junit.Test
    public void deposit() {

        double balance = account.deposit(2000, true);
        assertEquals(1012010,balance,0);

    }

    @org.junit.Test
    public void withdraw() {

        account.deposit(2000, true);
        assertEquals(1012010,account.getBalance(),0);

    }

    @org.junit.Test
    public void getBalance_deposit() {

        account.deposit(2000, true);
        assertEquals(1012010,account.getBalance(),0);

    }
    @org.junit.Test
    public void getBalance_withdraw() {

        account.withdraw(2000, true);
        assertEquals(1008010,account.getBalance(),0);

    }
    @org.junit.Test
    public void isChecking_true(){

        assertTrue("The account is NOT checking account",account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This executes after any test cases.");
    }

}