// An array is a collection of elements stored in continuous memory locations. (All elements are of the same data type). 

/*
PROPERTIES OF AN ARRAY:
1. Fixed size (cannot grow/shrink in normal arrays)
2. Stored in continuous memory
3. Access using index
4. Index starts from 0
5. Fast access → O(1)


VISUAL LOOKING
Index:   0   1   2   3   4
Array:  [10, 20, 30, 40, 50]
 */


class Array {

    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50};
        System.out.println(arr[4]);         //Print the element at index number 4


        //NOTHER WAY TO CREATE AN ARRAY:

        int[] marks = new int[3];
        marks[0] = 90;
        marks[1] = 92;
        marks[2] = 60;
        //marks[3] = 80;            This will give error because the size of the array can contain only 3 elements

        System.out.println(marks[1]);
    }

}
