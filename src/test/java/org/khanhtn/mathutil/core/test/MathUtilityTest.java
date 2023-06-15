/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.khanhtn.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.khanhtn.mathutil.core.MathUtility;

/**
 *
 * @author TNK
 */
public class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArguementRunsWell() {
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    //DDT - Data Driven Testing - Parameterized Test
    //Tách bộ data test ra khỏi lệnh test sau đó chia thành tham số
}
