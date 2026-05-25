//So problem with regular arrays is that the size remains fixed, the array caqnoot grow.
/*
Java does this (conceptually):

Create new bigger array
Copy old elements
Add new element
 */


//Let's create a Manual Dynamic Array:

import java.util.Arrays;

class Arrayyyyyyyyy {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3};
        int[] newarr = new int[6];

        for(int i = 0; i < arr.length; i++){
            newarr[i] = arr[i];
        }

        newarr[3] = 6;
        System.out.println(Arrays.toString(newarr));
    }
    
}
