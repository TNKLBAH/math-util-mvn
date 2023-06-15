/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.khanhtn.mathutil.core;

/**
 *
 * @author TNK
 */
//class nay clone lai 100% cai class java.util.Math cua JDK
//Math.sqrt() Math.sin() Math.random()
public class MathUtility {

    public static final double PI = 3.1415;

    //tinh n! = 1.2.3....n
    //thiet ke/ quy uoc cho ham/method nay
    //0! = 1! = 1
    //ko ap dung giai thua cho so am. Neu N < 0: LOI, EXCEPTION
    //ko giai thua cho so > 20. Vi 20! vua khit kieu long (18 so 0)
    //21!: LOI, EXCEPTION
    public static long getFactorial(int n) {

        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20.");        
        
        if (n == 0 || n == 1) 
            return 1;        
        
        long product = 1; //tich khoi dau la 1, sau do nhan don vao
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }
}
