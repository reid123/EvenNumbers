/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evennumbers;

/**
 *
 * @author rhart
 */
public class EvenNumbers {

   public static void main(String args[]) {
	int n = 150;
	System.out.print("Even Numbers from 1 to "+n+" are: ");
	for (int i = 1; i <= n; i++) {
	   //if number%2 == 0 it means its an even number
	   if (i % 2 == 0) {
		System.out.print(i + " ");
	   }
	}
   }
}