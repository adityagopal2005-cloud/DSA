import java.util.Arrays;
import java.util.Scanner;

class cyclic{

    static void sort(int[] arr){

        int i = 0;

        while(i < arr.length){

            int correctindex = arr[i] - 1;

            if(arr[i] != arr[correctindex]){
                int temp = arr[i];
                arr[i] = arr[correctindex];
                arr[correctindex] = temp;
            }
            else{
                i++;
            }

        }

        System.out.println("Sorted Array is: " + Arrays.toString(arr));
    }
}

class cyclicc{
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

        cyclic obj1 = new cyclic();
        obj1.sort(arr);
    }
}
