/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author Ghufran
 */
public class Methods {

    private static int number = 10;
    public static void main(String[] args) {
        // TODO code application logic here
        Methods mtd = new Methods();
        
        System.out.println("The square of i is = " + checkNumber(32));
        
        System.out.println("\nThe sum of " + number + " and function parametre number is = " + mtd.sumUptoN(20)+"\n");
       
        mtd.printNumberTriangle();

        mtd.exceptionHandeling();
    }
    
    //Method 1 check if number and square it
    private static int  checkNumber(int i) {
	int result;
	if (i == 25) {
            System.out.println("i = 25");
	} else if (i == 24) {
            System.out.println("i = 24");
	} else if (i == 23) {
            System.out.println("i = 23");
	} else {
            System.out.println("i != 24 and i !=25 and i !=23\nFind value of i from bellow square value");
	}
        result = i*i;
        return result;
    }
    
    //Method 2 Sum number with function parameter number
    private int sumUptoN(int sum) {
	for (int i = 1; i <= number; i++) {
            sum = sum + i;
	}
        return sum;
    }
    
    //Method 3 Print triangle numbers base on static variable number
    public void printNumberTriangle() {
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
	for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
		System.out.print(j + " ");
            }
		System.out.println();
        }

    }
     
    //Method 4 and 5 is divide the number if its divide by 0 then throw the exception
    private int divide(int a, int b){
        int result = a/b;
        return result;
    }
    public void exceptionHandeling(){
        try {
            int newResult = divide(20, 2);
            System.out.println("\nThe Answer is = " + newResult);
        } catch (Exception e) {
            //System.out.println("\nConnot Divide By 0");
            throw e;
        }
    }
    
}
