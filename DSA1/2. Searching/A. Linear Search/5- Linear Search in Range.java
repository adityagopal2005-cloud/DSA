import java.util.Scanner;
import java.util.Arrays;

class linearrrrrr{

    int Searchinrange(int[] arr, int target, int r1, int r2){

        for (int i = r1; i <= r2; i++ ){

            if (arr[i] == target){
                System.out.println("The targeted element " + arr[i] + " is at index: " + i);
                return i;
            }

            

        }

        return -1;
    }
}

class linearrrrrrr{

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

        int target, r1, r2;
        
        System.out.print("Enter your targeted value: ");
        target = input.nextInt();

        System.out.print("Enter your range (R1): ");
        r1 = input.nextInt();

        System.out.print("Enter your range (R2): ");
        r2 = input.nextInt();


        linearrrrrr obj = new linearrrrrr();
        obj.Searchinrange(arr, target, r1, r2);




    }
}