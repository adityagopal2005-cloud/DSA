import java.util.Scanner;
import java.util.Arrays;

class Arrayyyyyyy {

    public static void main(String[] args) {
        
        int[][] arr =                           //[][]: 2 Dimentional Array
        {
            {1,2},                              //{00,01},
            {3,4},                              //{10,11},
            {5,6}                               //{20,21}

        };

        //Number of rows and columns : 3x2
        System.out.println(arr.length); //Prints number of rows
        System.out.println(arr[arr.length - 1].length); //Prints number of columns


        //Transversal
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[arr.length - 1].length; j++){
                System.out.println(arr[i][j]);
            }

        }
        

        //Taking Input and Printing output:
        Scanner input = new Scanner(System.in);

        

        System.out.print("How many rows?: ");
        int a = input.nextInt();
        System.out.print("How many columns?: ");
        int b = input.nextInt();

        int[][] arr1 = new  int[a][b];
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[arr1.length - 1].length; j++){
                System.out.println("Enter you element to put in row " + (i+1) + " and column " + (j+1) + ": ");
                arr1[i][j] = input.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr1));


        
    }
    
}
