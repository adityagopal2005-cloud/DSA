import java.util.Scanner;
import java.util.Arrays;

class linearrrrrrrr{

    int findmin(int[] arr){

        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }

            
        }

        System.out.println("The minimum elemennt is: " + min);
        
        return min;

    }
        
}


class linearrrrrrrrr{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of array; ");
        int a = input.nextInt();

        int[] arr = new int[a];

        for(int i=0; i < arr.length; i++){
            System.out.print("Enter element no " + (i+1) + " : ");
            int b = input.nextInt();
        
            arr[i] = b;
        }

        linearrrrrrrr obj = new linearrrrrrrr();
        obj.findmin(arr);
        

    }
}