import java.util.Arrays;
import java.util.Scanner;

class test{

    static void reverse(String str){

        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++){
            Character temp = arr[i];
            arr[i] = arr[arr.length - (i+1)];
            arr[arr[arr.length - (i+1)]] = temp;

        }

        System.out.println("Reversed Array: "+ String.valueOf(arr));
    }
}

class tests{

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = a.nextLine();

        test obj = new test();
        obj.reverse(str);
    }
}