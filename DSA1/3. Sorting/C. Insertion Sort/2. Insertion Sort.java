import java.util.Arrays;
import java.util.Scanner;

class insertion{

    static void sortASC(int[] arr){

        //For examples an Array of {3,7,5}
        //We will consider 2nd iteration where i = 2, because when when i = 1, current = 7 
        //j = i-1; so j = 0
        //Now the condition for while loop [j>=0 (0>=0, true) && arr[j]>current(3>7, false)] so true && false -> FALSE
        //while loop will never run
        //arr[j+1] = 1 = i = current = 7 -> Array remains same
        //Lets see 2nd iteration for {3,7,5}        

        for(int i = 1; i < arr.length; i++){           //i = 2

           int current = arr[i];                        //current = arr[2] = 5
           int j = i - 1;                               // j = i - 1 = 2 - 1 = 1 

           while(j>=0 && arr[j]>current){               //(j>=1)->true && [(arr[j]=7) > (current=5)]->true, while executes
            arr[j+1] = arr[j];                          //arr[j+1]->2 = arr[j]->1
                                                        //arr[1] = arr[2]
                                                        //New Array {3,7,7}
            j--;                                        //j-- = 1-1 = 0 (j is now 0)
           }

           arr[j+1] = current;                          //arr[j+1]->index 1 = current(5)
        }

        //Hence new array = {3,5,7}
        

        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }
}

class insertionn{

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

        insertion obj1 = new insertion();
        obj1.sortASC(arr);
    }

}