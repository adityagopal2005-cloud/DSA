import java.util.Arrays;

class Arrayyyyyyyy {
    
    public static void main(String[] args) {
        
        //Jagged Array is a 2D array where each row has different number of columns

        int[][] arr = {
            {1,2,3},
            {4,5},
            {6}
        };

        System.out.println(Arrays.deepToString(arr));

        //To Declare jagged Array:

        int[][] arr1 = new int[3][];
        
        //Assign number of columns to rows manually:
        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[2];

        System.out.println(arr[arr.length-1].length);    //Print columns of the last row
    }
}
