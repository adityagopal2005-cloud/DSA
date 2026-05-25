import java.util.Scanner;
import java.util.Arrays;


//This program takes input from user and creates and array, then it asks the user what element they want to find and it returns the index where that value is at.
class Linear{

    public static void main(String[] args){

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter length of your Array: ");
        int a = input1.nextInt();
        int[] arr = new int[a];
        

        Scanner input2 = new Scanner(System.in);
    


        for(int i=0; i < arr.length; i++){
            System.out.print("Enter element no " + (i+1) + " : ");
            int b = input2.nextInt();
        
            arr[i] = b;
        }
        
        System.out.println("Array is: " + Arrays.toString(arr));
    

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the targetted element: ");
        int c = input3.nextInt();

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == c){
                System.out.println("The targeted element" + arr[i] + " is at index: " + i);    
                break;
            }
            
        }



    }


}


