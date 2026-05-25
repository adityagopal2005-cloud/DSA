import java.util.Scanner;
import java.util.Arrays;
import java.util.*;


class linearrrr{

    int Charsearch(String charArr, char target){

        
        for (int i = 0; i < charArr.toCharArray().length; i++){
            if(charArr.toCharArray()[i] == target){
                
                System.out.println("Index: " + i);
                
            }
            
        } 

        

        return 0;
    }

    int Charcountsearch(String charArr, char target){

          int count = 0;

          for(int i = 0; i < charArr.toCharArray().length; i++){
            if (charArr.toCharArray()[i] == target){
                count++;
            }
          }

          return count;
    }
}



class linearrrrr{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String a = input.nextLine();
        String charArray = a.toLowerCase();

        System.out.print("Enter targeted element: ");
        char target = input.next().charAt(0);

        linearrrr obj = new linearrrr();
        int result = obj.Charsearch(charArray,target);

        

        linearrrr obj1 = new linearrrr();
        int result1 = obj1.Charcountsearch(charArray ,target);

        System.out.println("Repeated " + result1 + " times.");
    }
    
}

