//-----------------------------------------------------
// Title: Sorting Algortihm class
// Author: Meltem AKKOCA
// ID: 
// Section: 1
// Assignment: 2
// Description: This class tests and measure the given sorts' time
//-----------------------------------------------------

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class SorrtingAlgorithmTester {


    public static int[]ascendingOrderArray (int arr[]){
        //--------------------------------------------------------
        // Summary: Makes the array an ascending array.
        // Postcondition: Ascending array is returned.
        //--------------------------------------------------------

        for(int i=0; i<arr.length; i++) {
            arr[i]=i;
        }
        return arr;

    }

    public static int[]descendingOrderArray (int arr[]){
        //--------------------------------------------------------
        // Summary: Makes the array a descending array.
        // Postcondition: Descending array is returned.
        //--------------------------------------------------------

        for(int i=arr.length-1; i>=0; i--) {
            arr[i]=i;
        }
        return arr;

    }

    public static int[]randomArray (int arr[]) {
        //--------------------------------------------------------
        // Summary: Creates a random array.
        // Postcondition: put to array the random values.
        //--------------------------------------------------------

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt() * 100000;

        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] arraySizeOf100= new int[100];
        int[] ascendingArrayOf100=ascendingOrderArray(arraySizeOf100);
        int[] descendingArrayOf100=descendingOrderArray(arraySizeOf100);
        int[] randomArrayOf100 = randomArray(arraySizeOf100);


        int[] arraySizeOf10000= new int[10000];
        int[] ascendingArrayOf10000=ascendingOrderArray(arraySizeOf10000);
        int[] descendingArrayOf10000=descendingOrderArray(arraySizeOf10000);
        int[] randomArrayOf10000 = randomArray(arraySizeOf10000);

        int[] arraySizeOf100000= new int[100000];
        int[] ascendingArrayOf100000=ascendingOrderArray(arraySizeOf100000);
        int[] descendingArrayOf100000=descendingOrderArray(arraySizeOf100000);
        int[] randomArrayOf100000 = randomArray(arraySizeOf100000);

        //----------------------------------------------------------------------------------------------

        //                                           Sort 1


        //100 size
        Long startingTimeOfSort1ForAscending1 = System.currentTimeMillis();
        int[]sorting = SortingAlgorithms.sort1(ascendingArrayOf100, 3159828600L);
        Long endingTimeOfSort1ForAscending1 = System.currentTimeMillis();
        Long sort1PassedTimeForAscending1  = endingTimeOfSort1ForAscending1 - startingTimeOfSort1ForAscending1;
        System.out.println("Sort 1 in an array of size 100 in ascending order: "+sort1PassedTimeForAscending1);


        Long startingTimeOfSort1ForDescending1 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort1(descendingArrayOf100, 3159828600L);
        Long endingTimeOfSort1ForDescending1 = System.currentTimeMillis();
        Long sort1PassedTimeForDescending1 = endingTimeOfSort1ForDescending1 - startingTimeOfSort1ForDescending1;
        System.out.println("Sort 1 in an array of size 100 in descending order: "+sort1PassedTimeForDescending1);


        Long startingTimeOfSort1ForRandom1 = System.currentTimeMillis();
         sorting = SortingAlgorithms.sort1(randomArrayOf100, 3159828600L);
        Long endingTimeOfSort1ForRandom1 = System.currentTimeMillis();
        Long sort1PassedTimeForRandom1 = endingTimeOfSort1ForRandom1 - startingTimeOfSort1ForRandom1;
        System.out.println("Sort 1 in an array of size 100 in random order: "+ sort1PassedTimeForRandom1);
        System.out.println();


        //10000 size
        Long startingTimeOfSort1ForAscending2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort1(ascendingArrayOf10000, 3159828600L);
        Long endingTimeOfSort1ForAscending2 = System.currentTimeMillis();
        Long sort1PassedTimeForAscending2  = endingTimeOfSort1ForAscending2 - startingTimeOfSort1ForAscending2;
        System.out.println("Sort 1 in an array of size 10000 in ascending order: "+sort1PassedTimeForAscending2);


        Long startingTimeOfSort1ForDescending2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort1(descendingArrayOf10000, 3159828600L);
        Long endingTimeOfSort1ForDescending2 = System.currentTimeMillis();
        Long sort1PassedTimeForDescending2 = endingTimeOfSort1ForDescending2 - startingTimeOfSort1ForDescending2;
        System.out.println("Sort 1 in an array of size 10000 in descending order: "+sort1PassedTimeForDescending2);


        Long startingTimeOfSort1ForRandom2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort1(randomArrayOf10000, 3159828600L);
        Long endingTimeOfSort1ForRandom2 = System.currentTimeMillis();
        Long sort1PassedTimeForRandom2 = endingTimeOfSort1ForRandom2 - startingTimeOfSort1ForRandom2;
        System.out.println("Sort 1 in an array of size 10000 in random order: "+ sort1PassedTimeForRandom2);
        System.out.println();

        //100000 size
        Long startingTimeOfSort1ForAscending3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort1(ascendingArrayOf100000, 3159828600L);
        Long endingTimeOfSort1ForAscending3 = System.currentTimeMillis();
        Long sort1PassedTimeForAscending3  = endingTimeOfSort1ForAscending3 - startingTimeOfSort1ForAscending3;
        System.out.println("Sort 1 in an array of size 100000 in ascending order: "+sort1PassedTimeForAscending3);


        Long startingTimeOfSort1ForDescending3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort1(descendingArrayOf100000, 3159828600L);
        Long endingTimeOfSort1ForDescending3 = System.currentTimeMillis();
        Long sort1PassedTimeForDescending3 = endingTimeOfSort1ForDescending3 - startingTimeOfSort1ForDescending3;
        System.out.println("Sort 1 in an array of size 100000 in descending order: "+sort1PassedTimeForDescending3);


        Long startingTimeOfSort1ForRandom3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort1(randomArrayOf100000, 3159828600L);
        Long endingTimeOfSort1ForRandom3 = System.currentTimeMillis();
        Long sort1PassedTimeForRandom3 = endingTimeOfSort1ForRandom3 - startingTimeOfSort1ForRandom3;
        System.out.println("Sort 1 in an array of size 100000 in random order: "+ sort1PassedTimeForRandom3);
        System.out.println();



        //----------------------------------------------------------------------------------------------

        //                                           Sort 2


        //100 size
        Long startingTimeOfSort2ForAscending1 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort2(ascendingArrayOf100, 3159828600L);
        Long endingTimeOfSort2ForAscending1 = System.currentTimeMillis();
        Long sort2PassedTimeForAscending1  = endingTimeOfSort2ForAscending1 - startingTimeOfSort2ForAscending1;
        System.out.println("Sort 2 in an array of size 100 in ascending order: "+sort2PassedTimeForAscending1);


        Long startingTimeOfSort2ForDescending1 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort2(descendingArrayOf100, 3159828600L);
        Long endingTimeOfSort2ForDescending1 = System.currentTimeMillis();
        Long sort2PassedTimeForDescending1 = endingTimeOfSort2ForDescending1 - startingTimeOfSort2ForDescending1;
        System.out.println("Sort 2 in an array of size 100 in descending order: "+sort2PassedTimeForDescending1);


        Long startingTimeOfSort2ForRandom1 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort2(randomArrayOf100, 3159828600L);
        Long endingTimeOfSort2ForRandom1 = System.currentTimeMillis();
        Long sort2PassedTimeForRandom1 = endingTimeOfSort2ForRandom1 - startingTimeOfSort2ForRandom1;
        System.out.println("Sort 2 in an array of size 100 in random order: "+ sort2PassedTimeForRandom1);
        System.out.println();


        //10000 size
        Long startingTimeOfSort2ForAscending2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort2(ascendingArrayOf10000, 3159828600L);
        Long endingTimeOfSort2ForAscending2 = System.currentTimeMillis();
        Long sort2PassedTimeForAscending2  = endingTimeOfSort2ForAscending2 - startingTimeOfSort2ForAscending2;
        System.out.println("Sort 2 in an array of size 10000 in ascending order: "+sort2PassedTimeForAscending2);


        Long startingTimeOfSort2ForDescending2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort2(descendingArrayOf10000, 3159828600L);
        Long endingTimeOfSort2ForDescending2 = System.currentTimeMillis();
        Long sort2PassedTimeForDescending2 = endingTimeOfSort2ForDescending2 - startingTimeOfSort2ForDescending2;
        System.out.println("Sort 2 in an array of size 10000 in descending order: "+sort2PassedTimeForDescending2);


        Long startingTimeOfSort2ForRandom2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort2(randomArrayOf10000, 3159828600L);
        Long endingTimeOfSort2ForRandom2 = System.currentTimeMillis();
        Long sort2PassedTimeForRandom2 = endingTimeOfSort2ForRandom2 - startingTimeOfSort2ForRandom2;
        System.out.println("Sort 2 in an array of size 10000 in random order: "+ sort2PassedTimeForRandom2);
        System.out.println();

        //100000 size
        Long startingTimeOfSort2ForAscending3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort2(ascendingArrayOf100000, 3159828600L);
        Long endingTimeOfSort2ForAscending3 = System.currentTimeMillis();
        Long sort2PassedTimeForAscending3  = endingTimeOfSort2ForAscending3 - startingTimeOfSort2ForAscending3;
        System.out.println("Sort 2 in an array of size 100000 in ascending order: "+sort2PassedTimeForAscending3);


        Long startingTimeOfSort2ForDescending3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort2(descendingArrayOf100000, 3159828600L);
        Long endingTimeOfSort2ForDescending3 = System.currentTimeMillis();
        Long sort2PassedTimeForDescending3 = endingTimeOfSort2ForDescending3 - startingTimeOfSort2ForDescending3;
        System.out.println("Sort 2 in an array of size 100000 in descending order: "+sort2PassedTimeForDescending3);


        Long startingTimeOfSort2ForRandom3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort2(randomArrayOf100000, 3159828600L);
        Long endingTimeOfSort2ForRandom3 = System.currentTimeMillis();
        Long sort2PassedTimeForRandom3 = endingTimeOfSort2ForRandom3 - startingTimeOfSort2ForRandom3;
        System.out.println("Sort 2 in an array of size 100000 in random order: "+ sort2PassedTimeForRandom3);
        System.out.println();

        //----------------------------------------------------------------------------------------------

        //                                           Sort 3

        //100 size
        Long startingTimeOfSort3ForAscending1 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort3(ascendingArrayOf100, 3159828600L);
        Long endingTimeOfSort3ForAscending1 = System.currentTimeMillis();
        Long sort3PassedTimeForAscending1  = endingTimeOfSort3ForAscending1 - startingTimeOfSort3ForAscending1;
        System.out.println("Sort 3 in an array of size 100 in ascending order: "+sort3PassedTimeForAscending1);


        Long startingTimeOfSort3ForDescending1 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort3(descendingArrayOf100, 3159828600L);
        Long endingTimeOfSort3ForDescending1 = System.currentTimeMillis();
        Long sort3PassedTimeForDescending1 = endingTimeOfSort3ForDescending1 - startingTimeOfSort3ForDescending1;
        System.out.println("Sort 3 in an array of size 100 in descending order: "+sort3PassedTimeForDescending1);


        Long startingTimeOfSort3ForRandom1 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort3(randomArrayOf100, 3159828600L);
        Long endingTimeOfSort3ForRandom1 = System.currentTimeMillis();
        Long sort3PassedTimeForRandom1 = endingTimeOfSort3ForRandom1 - startingTimeOfSort3ForRandom1;
        System.out.println("Sort 3 in an array of size 100 in random order: "+ sort3PassedTimeForRandom1);
        System.out.println();


        //10000 size
        Long startingTimeOfSort3ForAscending2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort3(ascendingArrayOf10000, 3159828600L);
        Long endingTimeOfSort3ForAscending2 = System.currentTimeMillis();
        Long sort3PassedTimeForAscending2  = endingTimeOfSort3ForAscending2 - startingTimeOfSort3ForAscending2;
        System.out.println("Sort 3 in an array of size 10000 in ascending order: "+sort3PassedTimeForAscending2);


        Long startingTimeOfSort3ForDescending2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort3(descendingArrayOf10000, 3159828600L);
        Long endingTimeOfSort3ForDescending2 = System.currentTimeMillis();
        Long sort3PassedTimeForDescending2 = endingTimeOfSort3ForDescending2 - startingTimeOfSort3ForDescending2;
        System.out.println("Sort 3 in an array of size 10000 in descending order: "+sort3PassedTimeForDescending2);


        Long startingTimeOfSort3ForRandom2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort3(randomArrayOf10000, 3159828600L);
        Long endingTimeOfSort3ForRandom2 = System.currentTimeMillis();
        Long sort3PassedTimeForRandom2 = endingTimeOfSort3ForRandom2 - startingTimeOfSort3ForRandom2;
        System.out.println("Sort 3 in an array of size 10000 in random order: "+ sort3PassedTimeForRandom2);
        System.out.println();

        //100000 size
        Long startingTimeOfSort3ForAscending3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort3(ascendingArrayOf100000, 3159828600L);
        Long endingTimeOfSort3ForAscending3 = System.currentTimeMillis();
        Long sort3PassedTimeForAscending3  = endingTimeOfSort3ForAscending3 - startingTimeOfSort3ForAscending3;
        System.out.println("Sort 3 in an array of size 100000 in ascending order: "+sort3PassedTimeForAscending3);


        Long startingTimeOfSort3ForDescending3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort3(descendingArrayOf100000, 3159828600L);
        Long endingTimeOfSort3ForDescending3 = System.currentTimeMillis();
        Long sort3PassedTimeForDescending3 = endingTimeOfSort3ForDescending3 - startingTimeOfSort3ForDescending3;
        System.out.println("Sort 3 in an array of size 100000 in descending order: "+sort3PassedTimeForDescending3);


        Long startingTimeOfSort3ForRandom3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort3(randomArrayOf100000, 3159828600L);
        Long endingTimeOfSort3ForRandom3 = System.currentTimeMillis();
        Long sort3PassedTimeForRandom3 = endingTimeOfSort3ForRandom3 - startingTimeOfSort3ForRandom3;
        System.out.println("Sort 3 in an array of size 100000 in random order: "+ sort3PassedTimeForRandom3);
        System.out.println();
        //----------------------------------------------------------------------------------------------

        //                                           Sort 4

        //100 size
        Long startingTimeOfSort4ForAscending1 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort4(ascendingArrayOf100, 3159828600L);
        Long endingTimeOfSort4ForAscending1 = System.currentTimeMillis();
        Long sort4PassedTimeForAscending1  = endingTimeOfSort4ForAscending1 - startingTimeOfSort4ForAscending1;
        System.out.println("Sort 4 in an array of size 100 in ascending order: "+sort4PassedTimeForAscending1);


        Long startingTimeOfSort4ForDescending1 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort4(descendingArrayOf100, 3159828600L);
        Long endingTimeOfSort4ForDescending1 = System.currentTimeMillis();
        Long sort4PassedTimeForDescending1 = endingTimeOfSort4ForDescending1 - startingTimeOfSort4ForDescending1;
        System.out.println("Sort 4 in an array of size 100 in descending order: "+sort4PassedTimeForDescending1);


        Long startingTimeOfSort4ForRandom1 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort4(randomArrayOf100, 3159828600L);
        Long endingTimeOfSort4ForRandom1 = System.currentTimeMillis();
        Long sort4PassedTimeForRandom1 = endingTimeOfSort4ForRandom1 - startingTimeOfSort4ForRandom1;
        System.out.println("Sort 4 in an array of size 100 in random order: "+ sort4PassedTimeForRandom1);
        System.out.println();


        //10000 size
        Long startingTimeOfSort4ForAscending2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort4(ascendingArrayOf10000, 3159828600L);
        Long endingTimeOfSort4ForAscending2 = System.currentTimeMillis();
        Long sort4PassedTimeForAscending2  = endingTimeOfSort4ForAscending2 - startingTimeOfSort4ForAscending2;
        System.out.println("Sort 4 in an array of size 10000 in ascending order: "+sort4PassedTimeForAscending2);


        Long startingTimeOfSort4ForDescending2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort4(descendingArrayOf10000, 3159828600L);
        Long endingTimeOfSort4ForDescending2 = System.currentTimeMillis();
        Long sort4PassedTimeForDescending2 = endingTimeOfSort4ForDescending2 - startingTimeOfSort4ForDescending2;
        System.out.println("Sort 4 in an array of size 10000 in descending order: "+sort4PassedTimeForDescending2);


        Long startingTimeOfSort4ForRandom2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort4(randomArrayOf10000, 3159828600L);
        Long endingTimeOfSort4ForRandom2 = System.currentTimeMillis();
        Long sort4PassedTimeForRandom2 = endingTimeOfSort4ForRandom2 - startingTimeOfSort4ForRandom2;
        System.out.println("Sort 4 in an array of size 10000 in random order: "+ sort4PassedTimeForRandom2);
        System.out.println();

        //100000 size
        Long startingTimeOfSort4ForAscending3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort4(ascendingArrayOf100000, 3159828600L);
        Long endingTimeOfSort4ForAscending3 = System.currentTimeMillis();
        Long sort4PassedTimeForAscending3  = endingTimeOfSort4ForAscending3 - startingTimeOfSort4ForAscending3;
        System.out.println("Sort 4 in an array of size 100000 in ascending order: "+sort4PassedTimeForAscending3);


        Long startingTimeOfSort4ForDescending3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort4(descendingArrayOf100000, 3159828600L);
        Long endingTimeOfSort4ForDescending3 = System.currentTimeMillis();
        Long sort4PassedTimeForDescending3 = endingTimeOfSort4ForDescending3 - startingTimeOfSort4ForDescending3;
        System.out.println("Sort 4 in an array of size 100000 in descending order: "+sort4PassedTimeForDescending3);


        Long startingTimeOfSort4ForRandom3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort4(randomArrayOf100000, 3159828600L);
        Long endingTimeOfSort4ForRandom3 = System.currentTimeMillis();
        Long sort4PassedTimeForRandom3 = endingTimeOfSort4ForRandom3 - startingTimeOfSort4ForRandom3;
        System.out.println("Sort 4 in an array of size 100000 in random order: "+ sort4PassedTimeForRandom3);
        System.out.println();
        //----------------------------------------------------------------------------------------------

        //                                           Sort 5

        //100 size
        Long startingTimeOfSort5ForAscending1 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort5(ascendingArrayOf100, 3159828600L);
        Long endingTimeOfSort5ForAscending1 = System.currentTimeMillis();
        Long sort5PassedTimeForAscending1  = endingTimeOfSort5ForAscending1 - startingTimeOfSort5ForAscending1;
        System.out.println("Sort 5 in an array of size 100 in ascending order: "+sort5PassedTimeForAscending1);


        Long startingTimeOfSort5ForDescending1 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort5(descendingArrayOf100, 3159828600L);
        Long endingTimeOfSort5ForDescending1 = System.currentTimeMillis();
        Long sort5PassedTimeForDescending1 = endingTimeOfSort5ForDescending1 - startingTimeOfSort5ForDescending1;
        System.out.println("Sort 5 in an array of size 100 in descending order: "+sort5PassedTimeForDescending1);


        Long startingTimeOfSort5ForRandom1 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort5(randomArrayOf100, 3159828600L);
        Long endingTimeOfSort5ForRandom1 = System.currentTimeMillis();
        Long sort5PassedTimeForRandom1 = endingTimeOfSort5ForRandom1 - startingTimeOfSort5ForRandom1;
        System.out.println("Sort 5 in an array of size 100 in random order: "+ sort5PassedTimeForRandom1);
        System.out.println();


        //10000 size
        Long startingTimeOfSort5ForAscending2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort5(ascendingArrayOf10000, 3159828600L);
        Long endingTimeOfSort5ForAscending2 = System.currentTimeMillis();
        Long sort5PassedTimeForAscending2  = endingTimeOfSort5ForAscending2 - startingTimeOfSort5ForAscending2;
        System.out.println("Sort 5 in an array of size 10000 in ascending order: "+sort5PassedTimeForAscending2);


        Long startingTimeOfSort5ForDescending2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort5(descendingArrayOf10000, 3159828600L);
        Long endingTimeOfSort5ForDescending2 = System.currentTimeMillis();
        Long sort5PassedTimeForDescending2 = endingTimeOfSort5ForDescending2 - startingTimeOfSort5ForDescending2;
        System.out.println("Sort 5 in an array of size 10000 in descending order: "+sort5PassedTimeForDescending2);


        Long startingTimeOfSort5ForRandom2 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort5(randomArrayOf10000, 3159828600L);
        Long endingTimeOfSort5ForRandom2 = System.currentTimeMillis();
        Long sort5PassedTimeForRandom2 = endingTimeOfSort5ForRandom2 - startingTimeOfSort5ForRandom2;
        System.out.println("Sort 5 in an array of size 10000 in random order: "+ sort5PassedTimeForRandom2);
        System.out.println();

        //100000 size
        Long startingTimeOfSort5ForAscending3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort5(ascendingArrayOf100000, 3159828600L);
        Long endingTimeOfSort5ForAscending3 = System.currentTimeMillis();
        Long sort5PassedTimeForAscending3  = endingTimeOfSort5ForAscending3 - startingTimeOfSort5ForAscending3;
        System.out.println("Sort 5 in an array of size 100000 in ascending order: "+sort5PassedTimeForAscending3);


        Long startingTimeOfSort5ForDescending3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort5(descendingArrayOf100000, 3159828600L);
        Long endingTimeOfSort5ForDescending3 = System.currentTimeMillis();
        Long sort5PassedTimeForDescending3 = endingTimeOfSort5ForDescending3 - startingTimeOfSort5ForDescending3;
        System.out.println("Sort 5 in an array of size 100000 in descending order: "+sort5PassedTimeForDescending3);


        Long startingTimeOfSort5ForRandom3 = System.currentTimeMillis();
        sorting = SortingAlgorithms.sort5(randomArrayOf100000, 3159828600L);
        Long endingTimeOfSort5ForRandom3 = System.currentTimeMillis();
        Long sort5PassedTimeForRandom3 = endingTimeOfSort5ForRandom3 - startingTimeOfSort5ForRandom3;
        System.out.println("Sort 5 in an array of size 100000 in random order: "+ sort5PassedTimeForRandom3);
        System.out.println();



        //---------------------------------------------------------------------------------------------------------

    }
}