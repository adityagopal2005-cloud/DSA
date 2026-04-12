import java.util.Arrays;

class Arrayyyy{

    public static void main(String[] args) {
        
        int[] arr = {10,70,8,40};
        System.out.println(arr);              //This will print some weird data (Memory address) cause Array is a reference type data
    
        System.out.println(Arrays.toString(arr));   //Arrays.toString() is a method of class Arrays whose fucntion is to print the array directly
    
        //Other usefull methods:
        //1. Sorting
        Arrays.sort(arr);                           //Sorts the array in ascending order
        System.out.println(Arrays.toString(arr));   

        //2. Filling Values
        int[] arr1 = new int[5];
        Arrays.fill(arr1, 10);                  //Stores the same value
        System.out.println(Arrays.toString(arr1));

    }

}