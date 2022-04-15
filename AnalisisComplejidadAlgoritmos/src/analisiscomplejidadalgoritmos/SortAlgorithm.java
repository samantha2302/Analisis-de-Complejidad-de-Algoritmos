
package analisiscomplejidadalgoritmos;

import java.util.Arrays;


public class SortAlgorithm {
    
    public static int  a = 0;//QuickSort Assignments Variable 
    public static int c = 0; //QuickSort Comparisons Variable
    /**
     * Sorts a given array
     * @param vector Array that will get sort
     * @param izq Delimits the zone of the vector
     * @param der Delimits the zone of the vector
     * @return int[] It returns the vector sorted
    */
    public static int[] QuickSort(int[] vector, int izq, int der){
    //V is vector
    //Izq and Der delimits v zone
    //where the partition is done
        int i, j; //i(j) goes from the left(right) of the vector
        int aux, piv; //Assumes that v has int
        
        piv = vector[(izq + der) / 2]; //Selection of the pivot(central element)
        i = izq;
        j = der;
        
        a+=3; // variables assigments 
        //Partition ends when i>j
        while (i <= j)
        {
            c++;//comparisson while 
            //Looks 1 elemnt that shouldn't be at the left of the pivot
            while (vector[i] < piv)
            {
                c++;//comparisson while 
                i++;
                a++;//variable i assignment
            }
            c++; //false while comparisson
            //Looks 1 elemnt that shouldn't be at the right of the pivot
            while (vector[j] > piv)
            {
                c++;//comparisson while
                j--;
                a++;//variable j assignment
                
            }
            c++;//false while comparisson

            //Switch misplaced elements
            c++; //Comparison if
            if (i < j)
            {
                aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux; 
                i++;
                j--;
                a += 5;//Variable aux, vector[i], vector[j], i, j assigments
            }
            else if (i == j){
                i++;
                j--;
                a+=2; //assigments i, j
            }
            c++; //Comparison else if
        }
        c++; //false while comparison
        //Right and left subvectors partition
        //Only if there's more than one element

        c+=2; //Comparison both ifs
        a++; //assignment return

        if (izq < j)
            return QuickSort(vector, izq, j);
        
        if (i < der)
            return QuickSort(vector, i, der);
            
    System.out.println(Arrays.toString(vector)); //eliminar
    return vector;
    }
        
    public static int getA() {
        //Assignments
        return a;
    }

    public static int getC() {
        //Comparisons
        return c;
    }        

}
