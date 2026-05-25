import java.util.Scanner;
import java.util.Arrays;

class linearrrrrrrrrr{

    int Search2D(int[][] arr, int target){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == target){
                    System.out.println("The targetted element was found at: " + i + " row &" + j + " column: ");

                    return i;
                }
            }
        }

        return -1;
    }

}

class linearrrrrrrrrrr{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rows of the array:  ");
        int row = input.nextInt();
        System.out.print("Enter Columns of the array:  ");
        int col = input.nextInt();

        int[][] arr = new int[row][col];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                System.out.print("Enter element for " + i + " row & " + j + " column: ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("The Array is: " + Arrays.deepToString(arr));

        System.out.println("Enter targetted value: ");
        int target = input.nextInt();

        linearrrrrrrrrr obj = new linearrrrrrrrrr();
        obj.Search2D(arr, target);
    }
}