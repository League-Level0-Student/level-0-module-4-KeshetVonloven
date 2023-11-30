package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String Change = JOptionPane.showInputDialog("how many nickels");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		double nickels = Double.parseDouble(Change);
		// Ask the user how many dimes they have, and convert their answer
		int inickels =Integer.parseInt(Change);
		// Ask the user how many quarters they have, and convert their answer
		Change = JOptionPane.showInputDialog ("how many dimes");
		// Calculate how much money the user has.  Hint: Use a double variable 
		double dimes = Double.parseDouble(Change);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		int idimes =Integer.parseInt(Change);
		Change = JOptionPane.showInputDialog("how many quarters");
		double quarters = Double.parseDouble(Change);
		int iquarters =Integer.parseInt(Change);
		double total = (nickels*5+dimes*10+quarters*25)/100;
		double itotal =(double) (inickels*5+idimes*10+iquarters*25)/100;
		JOptionPane.showMessageDialog(null, "$"+total+ "\n$"+itotal);
	}
}

