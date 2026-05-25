// Key Points:
// 1. ArrayList is a resizable array implementation in Java, part of the java.util package.
// 2. Unlike arrays, ArrayLists can dynamically grow and shrink in size as elements are added
//   or removed.
// 3. Data is added by using the add() method.
// 4. ArrayLists can only store objects, so for primitive types like int, double, etc.,
//   their corresponding wrapper classes (Integer, Double, etc.) must be used.
// 5. ArrayLists are reference type variables that store references to the actual objects in memory.
//   But when your print it prints the values. This is because toString() method is overridden in 
//   the ArrayList class to provide a string representation of the list's contents.

import java.util.ArrayList;  
import java.util.List;                

class Arrayyyyyyyyyy {
    public static void main(String[] args){

        int[] array1 = new int[5];          //Static Array (Size not mutable)

        ArrayList<Integer> array2 = new ArrayList<>();   //Dynamic Array (Size mutable)
        array2.add(1);
        array2.add(2);
        array2.add(3);
        array2.add(4);
        array2.add(5);
        
        //..........

        System.out.println(array2);

        List<Integer> list = new ArrayList<>();         //List<> is an interface, ArrayList<> is a class that implements List<>
        list.add(10);                                   //Adding elements to the list
        list.add(20);
        list.add(30);
        list.add(40);                                   //".add(x)" functions adds the element x to the end of the list

        list.add(2, 25);                                //".add(index, y)" function adds the element y at the specified index

        System.out.println("List after additions: " + list);


        List<Integer> list1 = new ArrayList<>(list);   //Creating a new list by copying elements from the existing list
        list1.add(50);
        System.out.println("New List after copying and adding 50: " + list1);


        //Another way to merge two lists is:
        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);

        list.addAll(list2);
        System.out.println("Merged List: " + list);



        //To get an element at a specific index:
        int elementAtIndex3 = list.get(3);           //".get(index)" function retrieves the element at the specified index
        System.out.println("Element at index 3: " + elementAtIndex3);

        List<Integer> elementslicing = list.subList(1, 3);  //Slicing the list from index 1 to 3 (3 is exclusive)
        System.out.println("Elements from index 1 to 3: " + elementslicing);


        //To remove an element at a specific index:
        list.remove(2);                             //".remove(index)" function removes the element at the specified index
        System.out.println("List after removing element at index 2: " + list);
        list.remove(Integer.valueOf(200));
        System.out.println("List after removing element 200: " + list);



        //To update an element at a specific index:
        list.set(0, 15);                           //".set(index, value)" function updates the element at the specified index with the new value
        System.out.println("List after updating index 0 to 15: " + list);


        //To check if the list contains a specific element:
        boolean contains30 = list.contains(30);     //".contains(value)" function checks if the list contains the specified value
        System.out.println("List contains 30: " + contains30);

    }
    
}
