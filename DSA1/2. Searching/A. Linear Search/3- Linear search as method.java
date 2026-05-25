import java.util.Scanner;
import java.util.Arrays;

class Linearr {

    int Lsearch(int[] arr, int target) {            

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("The targeted element" + arr[i] + " is at index: " + i);
                return i;  // return index if found
            }
        }

        return -1; // not found then break and the method and move ahead
    }
}

class Linearrr{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int a = input.nextInt();

        int[] arr = new int[a];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter element no "+(i+1)+" : ");
            arr[i] = input.nextInt();
        }

        System.out.print("The array is: " + Arrays.toString(arr));

        
        System.out.print("Enter the tagetted value: ");
        int target = input.nextInt();

        Linearr obj = new Linearr();
        int result = obj.Lsearch(arr,target);

        System.out.println(result);

        





    }
}