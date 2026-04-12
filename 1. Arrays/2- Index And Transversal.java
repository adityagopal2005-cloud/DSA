//Index is the position of element in the array. The index always starts from 0.
//Transversal is basically visiting every element in the array.


class Arrayy {
    
    public static void main(String[] args) {
        
    int[] arr = {10,20,30,40,50};


    //METHOD 1: (Using for Loop)
    for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }

    //METHOD 2: (Reverse Transversal)
    for(int i = arr.length - 1; i >= 0; i--){
        System.out.println(arr[i]);
    }

    }
}
