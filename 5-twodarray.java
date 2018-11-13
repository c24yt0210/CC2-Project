package twodarray;

import java.util.Scanner;

public class TwoDarray
{
   public static void main(String[] args)
   {
// initialization0
       int row, col, i, j;
       int arr[][] = new int[10][10];
       Scanner scan = new Scanner(System.in);
	   
// enter row and column for array
            System.out.print("Enter row : ");
       row = scan.nextInt();
            System.out.print("Enter column : ");
       col = scan.nextInt();
	   
// enter array elements
            System.out.println("Enter " +(row*col)+ " Array Elements : ");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               System.out.println("\nEnter elemnts for row " + (i + 1) + " column " + (j + 1) + " : ");
            arr[i][j] = scan.nextInt();
           }
       }
	   
// the 2D array is here
            System.out.print("\nThe Array is :\n");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
            System.out.print(arr[i][j]+ "\t");
           }
            System.out.println();
       }
   }
}