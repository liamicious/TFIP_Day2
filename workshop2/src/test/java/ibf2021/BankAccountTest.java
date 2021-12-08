package ibf2021;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankAccountTest {

    @Test
    public void testGetBalance(){
        BankAccount account = new BankAccount("John Smith", 123.45f);
        // use delta for comparison of float with different decimals points (123.45 vs 123.456)
        // use compare for floats with same decimal values (123.45 vs 123.45)
        String testName = account.getName();
        Float testValue = account.getAccountBalance();
        Float testBalance = 123.45f;
        assertEquals(testName, "John Smith");
        assertEquals(testValue, testBalance);
        System.out.println("\ntestGetBalance successful\n");
    }

    @Test
    public void testDeposit(){
        BankAccount account = new BankAccount("John Wick", 12.34f);
        account.deposit(1.23f);
        Float testBalance = 13.57f;
        Float testDeposit = account.getAccountBalance();
        assertEquals(testDeposit, testBalance);
        System.out.println("testDeposit successful\n");

    }
}
