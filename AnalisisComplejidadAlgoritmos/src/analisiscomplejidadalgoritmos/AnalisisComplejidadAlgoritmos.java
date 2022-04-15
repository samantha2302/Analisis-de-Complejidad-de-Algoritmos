 // Fecha inicio 3/23/2022 8:10:00pm
// Integrantes: Samantha Acuña Montero, Raquel Arguedas Sánchez, María Fernanda Sanabria Solano
// Fecha final: 

package analisiscomplejidadalgoritmos;

import java.util.Random;

public class AnalisisComplejidadAlgoritmos {
    
    static int [] vector;
    static int [] randomLength = {3,4,5,6,7,10,11,12,13,14,15,20,30};
    static int [][] burned = 
    {
        {-5,9,5},
        {2,-2,3,-5},
        {1,9,-8,-1,3},
        {20,-10,-15,35,8,-10},
        {3,-6,1,2,10,-5,30},
        {12,30,15,-4,-31,20,7,-9,1,-30},
        {15,-12,13,8,-5,4,21,31,-15,14,-3},
        {8,34,9,-20,7,9,40,-43,31,27,12,-14},
        {16,2,3,20,-13,7,-4,-5,8,19,-50,21,-9},
        {5,-4,-1,8,9,10,-7,5,2,30,-15,-8,16,-3},
        {20,10,-10,3,9,-34,6,-2,8,-45,50,4,-24,-56,-24},
        {64,84,100,5,90,-5,-6,-10,-4,3,7,4,-30,-15,8,45,25,9,1,13},
        {1,2,3,5,90,-5,-6,-10,-4,20,9,4,-30,-15,8,45,25,48,11,13,17,36,22,21,66,64,84,100,-64,7}
        
    };
    
    public static void main(String[] args) {
        BruteForceAlgorithm b = new BruteForceAlgorithm();
        DynamicProgrammingAlgorithm d = new DynamicProgrammingAlgorithm();
        
        for (int i=0; i<burned.length; i++){
            
            System.out.println("\n" + burned[i].length);
            System.out.println("BruteForceAlgorithm");
            b.findSets(burned[i]);
            System.out.println("Assigments: " + b.getNumberAssignment() + 
                               ", Comparissons: " + b.getNumberComparisons());
            
        }
        System.out.println("________________________________________________________________________________________");
        for (int i=0; i<burned.length; i++){
            
            System.out.println("\n" + burned[i].length);
            System.out.println("\nDynamicProgrammingAlgorithm");
            d.findSets(burned[i]);
            System.out.println("Assigments: " + d.getNumberAssignment() + 
                               ", Comparissons: " + d.getNumberComparisons());
        }
            
        System.out.println("\n____________________Final____________________");
        
        //int n = 5;
        //vector = new int [n];
        //fillRandomArray(n);
        //System.out.println("\n\n========================Fuerza Bruta========================\n");
        //b.findSets(vector);
        //System.out.println("Assignments: "+b.getNumberAssignment()+"\tComparisons: "+b.getNumberComparisons());
        //System.out.println("\n\n========================Programacion Dinamica========================\n");
        //d.findSets(vector);
        //System.out.println("Assignments: "+d.getNumberAssignment()+"\tComparisons: "+d.getNumberComparisons());
        
        // int [] arrA = { -5, -3, -2, 5, 8} ;
          
//        fillRandomArray(5);
        
    }

    /**
     * Fills the static variable vector with random numbers
     * @param n length of the array to fill
    */
    public static void fillRandomArray(int n)
    {
        Random random=new Random();
        for (int i = 0; i < n; i++)
            vector[i] = (int) (random.nextInt(100)-50);
        
    }

    

}