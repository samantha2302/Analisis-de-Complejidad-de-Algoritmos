/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisiscomplejidadalgoritmos;

import java.util.Arrays;


public class DynamicProgrammingAlgorithm {
    // Java implementation of above approach
 
    static int numberAssignment = 5; // Assignments Variable. // Variable Assignment maxSum, arrSize, visit, subNum, subs.
    static int numberComparisons; // Comparisons Variable

    static int maxSum = 2000;
    static int arrSize = 1000;
 
    static boolean[][] visit = new boolean[arrSize][maxSum];
    static boolean subNum = false;
    static String subs = "";
    
    /**
     * It changes the value of the static variable subNum if the final sum equals 0
     * @param sum Variable where we sum number to see if it equals 0
     * @param num Number that we will sum to the variable sum to see if it equals 0
     * @return Boolean It returns if sum equals 0
    */
    static boolean finalCase(int sum, int num){
        numberAssignment+=3; // Variable Assignment sum and num and sum below
        sum+=num;  
        
        if (sum == 0&&!subNum){ //We found the first subset that equals 0
            numberAssignment++; // Variable Assignment subNum
            subNum=true;  
        }
        numberComparisons++; // Comparison if
        numberAssignment++; // Variable Assignment return
        
        return subNum;
    }
    
    /**
     * Finds the first subset of the arrA that equals 0 
     * @param index Index of the number in the array to sum to the @param sum
     * @param sum Current result of the sum
     * @param arr Array where we get the numbers to sum
     * @param length Length of the array arr
     * @return Boolean It returns if it finds a subset that equals 0 of the arr
    */
    static boolean subsetCnt(int index, int sum, int arr[], int length)
    {
        // Returns the value if a state is already solved
        numberComparisons++; // Comparison if
        if (visit[index][sum + arrSize]){
            numberAssignment++; // Variable Assignment of return

            return false;
        }
 
        // If the state is not visited, then continue
        visit[index][sum + arrSize] = true;
        numberAssignment++; // Variable Assignment of visit
 
        
        Boolean tmp = false; 
        numberAssignment++; // Variable Assignment of tmp

        numberComparisons+=2; // Comparison both if
        if(index+1==length){ //We are ending the sums
            numberAssignment++; // Variable Assignment tmp
            tmp = finalCase(sum, arr[index]);
            if(tmp){ //We found the first subset that equals 0 so we add one of the numbers of the subset
                numberAssignment+=2; // Assignment of subs and return
                subs=String.valueOf(arr[index]);

                return tmp;
            }
            numberAssignment+=2; //Variable Assignment tmp and return 
            tmp = tmp||finalCase(sum, 0);

            return tmp;
        }
        
        
        // Recurrence relation
        tmp = subsetCnt(index + 1, sum + arr[index], arr, length);
        numberAssignment++; // Variable Assignment

        numberComparisons+=2; // Comparison if

        if(tmp){//We add one of the numbers of the subset
            if(!subs.equals("")){ //This is not the first number of the subset so we add a comma
                numberAssignment++; // Assignment of subs
                subs+=",";

            }
            subs+=String.valueOf(arr[index]);
            numberAssignment+=2; // Variable Assignment of subs and return
            
            return tmp;
        }
        numberAssignment+=2;// Variable Assignment tmp and return
        tmp = tmp|| subsetCnt(index + 1, sum, arr, length);
        
        return tmp; // Returning the value
    }
    
    /**
     * Prints the first subset of the arrA that equals 0 
     * @param arrA array with numbers to find a subset that equals 0
    */
    public void findSets(int [] arrA){
        numberAssignment++; // Variable Assignment arrA 
        System.out.println("Given Array: " + Arrays.toString(arrA) + ", required sum: " + 0);
      
        //Stopwatch
        long time_start, time_end;
        time_start = System.nanoTime(); 

        int length = arrA.length; //Length
        numberAssignment++; // Variable Assignment length

        subsetCnt(0, 0, arrA, length);
        
        //Stopwatch
        time_end = System.nanoTime(); 
        System.out.println("The task has taken "+ ( time_end - time_start ) +" nanoseconds");
        
        //Results
        if(subs.equals("")){
            System.out.println("Not found");
        } else{
            System.out.println(subs);
        }
        
        
    }

    public int getNumberAssignment(){
        return numberAssignment;
    }   

    public int getNumberComparisons(){
        return numberComparisons;
    }


}