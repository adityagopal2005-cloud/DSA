import java.util.Scanner;

class Arrayyy{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the element: ");
            arr[i] = input.nextInt();
        }

        System.out.println("Here is your array ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        //Here Z directly stores all the value from arr and then we print Z
        for(int z:arr){
            System.out.println(z);
        }

        //By using for-each loop we can modify the array temporarily
        for (int a:arr){                            
            a = a + 5;
            System.out.println(a);
        }
    }
}