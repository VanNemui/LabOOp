package lab01;
// 2.2.5: btvn225.java
// A program to calculate sum, difference. product and quotient of 2 double numbers

import javax.swing.JOptionPane;
public class btvn225 {
	public static void main( String[] args) {
		String strNum1, strNum2;
		String strSum = "Sum of two numbers: ";
		String strDiff = "Difference of the two numbers: ";
		String strProduct = "Product of the two numbers: ";
		String strQuotient= "Quotient of the two numbers: ";
		
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);
		strSum += num1 + num2;
		strDiff += num1 - num2;
		strProduct += num1 * num2;
		strQuotient += num1/num2;
		
		JOptionPane.showMessageDialog(null, strSum, "Sum of the two numbers: " , JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strDiff, "Difference of the two numbers: " , JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strProduct, "Product of the two numbers: " , JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strQuotient, "Quotient of the two numbers: " , JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
	}

}
