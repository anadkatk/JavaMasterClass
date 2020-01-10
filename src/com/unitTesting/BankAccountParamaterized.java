package com.unitTesting;

import com.unitTesting.BankAccount;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountParamaterized {
    private BankAccount account;
    private double amount, expected;
    private boolean branch;

    public BankAccountParamaterized(double amount, double expected, boolean branch) {
        this.amount = amount;
        this.expected = expected;
        this.branch = branch;
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("Kevin","Anadkat",1000, BankAccount.CHECKING);
        System.out.println("Running a test in new class");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][] {
            {100.00,true,1100.00},
            {200.00,true,1200.00},
                {325.14,true,1325.14},
                {489.33,true,1489.33},
                {1000.00,true,2000.00}
        });
    }
    @org.junit.Test
    public void deposit() throws Exception{

        account.deposit(amount,branch);
        assertEquals(expected,account.getBalance(),0);

    }
}
