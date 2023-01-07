package lab01;
// Exercises 6.3: aTriangle.java

import java.util.Scanner;
public class aTriangle {
  public static void main(String[] args) {
    Scanner dHeight = new Scanner(System.in);
    int dHight, k = 0;
    System.out.printf("Nhap chieu cao kim tu thap: ");
    dHight = dHeight.nextInt();
    for (int i = 1; i <= dHight; ++i, k = 0) {
      for (int space = 1; space <= dHight - i; ++space) {
        System.out.print("  ");
      }
      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }
      System.out.println();
    }
  }
}