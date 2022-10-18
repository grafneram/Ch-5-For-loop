//Ashley Grafner
//CSC 10606080, Computer Science 1 (Java)
//9/8/2022
//This program will use a FOR loop to print the multiples of 3 from 3 through 99. Print each multiple on a different line.

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Multiples of Three");

    int count = 1;
    int max = 99 ;
    
    for (count = 1;count<= max;count++) {
      //* start count at 1, count will go up to 99 (but wil be cut off) and will increase each loop by 1 */
      
      System.out.println(3 * count); //Will find multiples of 3 for every loop
      while (max <= 3 * count); //ONLY runs until we reach 99 as sum
    }
  }
}


  //passed input/output tests