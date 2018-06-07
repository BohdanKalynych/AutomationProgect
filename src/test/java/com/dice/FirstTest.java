package com.dice;

import com.dice.base.BaseTest;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void firstTestMethod (){
        //open dice.com
        driver.get("http://www.dice.com");
        System.out.println("Dice website is opened. Test passed");
    }
}
