//Stefan Georgiev

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Recursion{
    public static int count = 1;
    public static void main(String[] args){
        ArrayList<Integer> listNums = new ArrayList<>();
        listNums.add(1);
        listNums.add(2);
        listNums.add(3);
        listNums.add(4);
        listNums.add(5);
      
        permutations(listNums, listNums.size());
       
    }

    public static void permutations(ArrayList<Integer> listNums, int sizeOfArray){
        //This recursive sequence works by going backwards from the last element to the first element...
        //...so if the sizeOfArray gets to size of 1 element that means the loop is complete and can print the elements
        if (sizeOfArray == 1){ 
            for (Integer x: listNums){
                System.out.print(x);
            }
            System.out.println(""); 
            //System.out.println(count++);  
        }
        else{
            for (Integer index = 0; index<sizeOfArray; index++){
                ArrayList<Integer> copyOfListNums = listNums;
                //Swaps first element with last and finds all permutations with the last element
                Collections.swap(copyOfListNums, index, sizeOfArray-1);
                //Calls itself until it reaches a sizeOfArray of 1
                permutations(copyOfListNums, sizeOfArray-1);
                //Performs those permutations 
                Collections.swap(copyOfListNums, index, sizeOfArray-1);   
            }
        }
    }
}
