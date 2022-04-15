
package analisiscomplejidadalgoritmos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BruteForceAlgorithm {

    static int numberAssignment; // Assignments Variable
    static int numberComparisons; // Comparisons Variable

    /**
     * Prints the first subset of the arrA that equals 0 
     * @param arrA array with numbers to find a subset that equals 0
    */
    public void findSets(int [] arrA){
        numberAssignment++; // Variable Assignment arrA 
        
        //StopWatch
        long time_start, time_end;
        time_start = System.nanoTime(); 

        System.out.println("Given Array: " + Arrays.toString(arrA) + ", required sum: " + 0);
        arrA = SortAlgorithm.QuickSort(arrA, 0, (arrA.length)-1);  //We sort the array
        numberAssignment += SortAlgorithm.getA();                  // Addition of the quicksort assigments
        numberComparisons += SortAlgorithm.getC();                 // Addition of the quicksort comparisons
        List<Integer> combinationList = new ArrayList<>();

        String result = combinationUtil(arrA, 0, 0, combinationList);

        numberAssignment++; // Variable Assignment result
        
        //StopWatch
        time_end = System.nanoTime();
        System.out.println("The task has taken "+ ( time_end - time_start ) +" nanoseconds");
        
        //Results
        if(result.equals("")){
            System.out.println("Not found");
        } else{
            System.out.println(result);
        }
        
    }

    /**
     * Finds the first subset of the arrA that equals 0 
     * @param arrA Array where we get the numbers to sum
     * @param currSum Current result of the sum
     * @param start Index of where we start the new subset
     * @param combinationList List where we put the possible subsets that equals 0
     * @return String It returns the subset that equals 0 of the arrA
    */
    public String combinationUtil(int arrA[], int currSum, int start, List<Integer> combinationList) {
        numberAssignment+=4; // Variable Assignment arrA, currSum, start and combinationList

        numberComparisons++;//Comparisons of if
        if (currSum == 0 && combinationList.size() > 0) {
            numberAssignment++; // Variable Assignment return
            return combinationList.toString();
        }

        String result = ""; 
        numberAssignment+=2; //Variable Assignment  result and i
        for (int i = start; i < arrA.length; i++) {
            numberComparisons+=2;// Comparison of for and if
            if (currSum + arrA[i]> 0){//array is sorted, no need to check further
                break; 
            }
            combinationList.add(arrA[i]);
            result = combinationUtil(arrA, currSum + arrA[i], i + 1, combinationList);
            numberAssignment+=2; // Variable Assignment result and add
            
            numberComparisons++;// Comparison if
            if(!result.equals("")){
                numberAssignment++; // Variable Assignment return
                return result;
            }
            numberAssignment++; // Variable Assignment remove
            combinationList.remove(combinationList.size() - 1);
        }

        numberAssignment++; // Variable Assignment return
        return result;
    }

    public int getNumberAssignment(){
        return numberAssignment;
    }   

    public int getNumberComparisons(){
        return numberComparisons;
    }
    
}