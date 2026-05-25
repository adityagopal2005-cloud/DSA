import java.util.Arrays;
import java.util.Scanner;

class binaryyy{

    int agnostic(int[] arr, int tar){

        int start = 0;
        int end = arr.length - 1;

        Boolean isASC = arr[start] < arr[end];


        while(start<=end){

            int mid = start + (end-start)/2;


            if (tar == arr[mid]){
                System.out.println("Your Valuee " + tar + " is at index: " + mid);
                
                return mid;
            }
            
            else if (isASC){
                    if(tar < arr[mid]){
                    end = mid-1;
                    }

           
                    else if(tar>arr[mid]){
                    start = mid+1;
                    }
            }

            else{
                //For descending it's directly the reverse of ascending

                if(tar > arr[mid]){
                    end = mid - 1;
                }

                else{
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

}

class binaryyyy{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int a = input.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter sorted element number in  " + i + " : ");
            arr[i] = input.nextInt();
        }

        System.out.print(" Enter Targetted value:  ");
        int tar = input.nextInt();

        binaryyy obj = new binaryyy();
        obj.agnostic(arr, tar);
    }
}