import java.util.Arrays;
import java.util.Scanner;

class Selection{

    static void SortASC(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){            //This starts from 0 and ends at second last element
            int minindex = i;                               //The minimum value is at index 0 right now

            for(int j = i + 1; j < arr.length; j++){        //j = i+1, cause i must be compared with the next element
                                                            //j < arr.length as i only goes till second last


                if(arr[j]<arr[minindex]){                   //Compares
                    minindex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }

        System.out.println("Sorted Array is ascending is: " + Arrays.toString(arr));
    }
}

class Selectionn{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Array:  ");
        int a = input.nextInt();
    
        int[] arr = new int[a];

        for(int i=0; i < arr.length; i++){
            System.out.print("Enter element no " + (i+1) + " : ");
            int b = input.nextInt();
        
            arr[i] = b;
        }

        System.out.println("Your array is: " + Arrays.toString(arr));

        Selection obj1 = new Selection();
        obj1.SortASC(arr);
    }
}