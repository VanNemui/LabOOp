package lab01;
// Exercises 6.5: ArrayElements.java

public class ArrayElements {
	public static void main(String[] args) {
		int[] Numbers = new int[]{1789, 2035, 1899, 1456, 2013};
		int Sum = 0;
		
		for(int i = 0; i < Numbers.length ; i++)
        Sum = Sum + Numbers[i];
		double Average = Sum / Numbers.length;
		
        System.out.println("Average value of the array elements is : " +Average); 
   }
}

