package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    //TODO: constructor sets gasTankLevel properly

    private Car test_car;

    @Before
    public void makeCar() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }
    
    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), 0.0);
    }


    //TODO: gasTankLevel is accurate after driving within tank range
    public void testGasTankLevelAfterDrive() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(),0.0);
    }
    
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testDriveFartherThanTankAllows() {
        test_car.drive(501);
        assertEquals(0, test_car.getGasTankLevel(), 0.0); //tank should be empty
    }
    
    //TODO: can't have more gas than tank size, expect an exception
    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        test_car.addGas(5);
        fail("no");

    }
    

}
