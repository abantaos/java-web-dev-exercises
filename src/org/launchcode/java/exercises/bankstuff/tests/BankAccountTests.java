//package org.launchcode.java.exercises.bankstuff.tests;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;
//
//public class BankAccountTests {
//    //what does bank account have
//    //accountNumber
//    //balance
//    //owner(s) - Joint?
//
//    //type - checking, savings, etc.
//
//    //what can you do with a bank account
//    //deposit
//    //withdraw
//    //transfer
//    //accrueInterest
//
//    private BankAccount ba;
//
//    @Before
//    public void makeBankAccount() {
//        BankAccount ba = new BankAccount(accountNo);
//    }
//
//    @Test
//    public void testSimpleDeposit() {
//        ba.deposit(1);
//        assertEquals(1, ba.getBalace());
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testDepositNegativeValue() {
//        ba.deposit(-2);
//        fail("no");
//    }
//
//
//
//
//
//}
