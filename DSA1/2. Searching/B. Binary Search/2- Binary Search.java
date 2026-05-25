import java.util.Arrays;
import java.util.Scanner;

class binary{

    int Search(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start<=end){

            int mid = start + (end-start)/2;
            
            //Targeting less value
            if(target < arr[mid]){
                end = mid-1;
            }

            //Greater values
            else if(target>arr[mid]){
                start = mid+1;
            }

            else if (target == arr[mid]){
                System.out.println("Your Value " + target + " is at index: " + mid);
                
                return mid;
            }

            else
                return -1;
        }

        return -1;

    }
}


class binaryy{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int a = input.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter sorted element number in  " + (i+1) + " : ");
            arr[i] = input.nextInt();
        }

        System.out.print(" Enter Targetted value:  ");
        int target = input.nextInt();

        binary obj = new binary();
        obj.Search(arr, target);
    }
}