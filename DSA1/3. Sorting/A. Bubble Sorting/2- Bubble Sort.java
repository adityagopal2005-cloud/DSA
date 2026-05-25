import java.util.Arrays;
import java.util.Scanner;

class Bubble{

    //For Ascending
    static void SortASC(int[] arr){

        for (int i = 0; i < arr.length; i++){       //Number of passes
            for (int j = 1;j < arr.length - i;j++){     //j=1 because we compare index1 with index 0,
                                                        //j < arr.length - i is because for suppose an array of lenght 5 will
                                                        //have 4 comparisions, cause j starts from 1 not from 0. It is i 
                                                        //instead of 1 is because after one pass the last element gets fixed
                                                        //so we dont need to compare that value again.


                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

            
        }
    System.out.println( "The sorted array is ascending order is: "+Arrays.toString(arr));
        
    }


    //For Descending
    static void SortDSC(int[] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){

                if(arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }

        System.out.println("The sorted array in desending order is: " + Arrays.toString(arr));

    }

}

class Bubblee{

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

        Bubble obj1 = new Bubble();
        obj1.SortASC(arr);

        Bubble obj2 = new Bubble();
        obj2.SortDSC(arr);
    }
}