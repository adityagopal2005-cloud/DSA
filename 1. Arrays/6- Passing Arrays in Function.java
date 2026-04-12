class Arrayyyyyy{

    public static void change(int[] arr){
        arr[0] = 100;
        arr[1] = 200;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        change(arr);
        System.out.println(arr[1]);
    }
}


/*  What happens here is we create a method where in the parameter we create a array named 'arr'. 
Then in the main method we create the an array with same name. Now what happens if the array above precides over the array
in the main main function. 
For ex if index 0,1 of 'arr' in the above method is 100,200. Then in main method we again assign the values for index 0,1 & 2
for 'arr' 1,2,3. When we print the 'arr' the values would be 100,200,3
 */