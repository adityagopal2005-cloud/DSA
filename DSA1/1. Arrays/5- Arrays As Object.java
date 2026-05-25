import java.util.Arrays;

class Student{              //Class names Student

        String name;            //Field 1
}

class Arrayyyyy {         // main class

    public static void main(String[] args) {
        
        Student[] arr = new Student[3];         //Created an Object named 'arr'

        arr[0] = new Student();                 //
        arr[0].name = "Adi";

        System.out.println(arr[0]);   //Here java will only print reference until you mention it print the actual value

    }
}
