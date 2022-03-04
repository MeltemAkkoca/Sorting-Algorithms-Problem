//-----------------------------------------------------
// Title: Sorting class
// Author: Meltem AKKOCA
// ID: 
// Section: 1
// Assignment: 2
// Description: This class sorts the given input
//-----------------------------------------------------

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Sorting {

    /* Function to sort int array using Insertion Sort */
    /* in descending order, and start sorting the array FROM-RIGHT-TO-LEFT.*/
    /*STEP 2 */
    void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = n - 2; i >= 0; i--) {
            int key = arr[i];
            int j = i + 1;

            while (j < n && arr[j] > key) {
                arr[j - 1] = arr[j];
                j = j + 1;
            }
            arr[j - 1] = key;
        }
    }

    /* Function to sort double array using Insertion Sort */
    //STEP 3
    void insertionSort(double arr[]) {
        int n = arr.length;

        for (int i = n - 2; i >= 0; i--) {
            double key = arr[i];
            int j = i + 1;

            while (j < n && arr[j] > key) {
                arr[j - 1] = arr[j];
                j = j + 1;
            }
            arr[j - 1] = key;
        }
    }

    /* Function to sort int array using Bubble Sort in descending order. */
    //STEP 4
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\user\\Desktop\\input.txt");

        BufferedReader input = new BufferedReader(new FileReader(file));

        int N = Integer.parseInt(input.readLine());

        Integer[] a = new Integer[N];

        for (int i = 0; i < N; i++)
            a[i] = Integer.parseInt(input.readLine());

        Random random = new Random();

        int intArray[]= new int[7];
        double doubleArray[] = new double[7];

        for (int i = 0; i < 7; i++) {
            doubleArray[i]=random.nextDouble();
        }
        for (int i = 0; i < 7; i++) {
            intArray[i]=random.nextInt();
        }
                                                            //STEP 6 //
        Comparable personArray[] = { new Person("ege", "ak", 12324L), new Person("mel", "ak", 34983L),
                new Person("mary", "carl", 58934L), new Person("osman", "ak", 40045L),new Person("Jake", "Per", 93938L),new Person("Rossie", "Smith", 938202L),
                new Person("Emilie", "Clark", 93824L),new Person("Angelina", "Jolie", 14141L),new Person("mithat", "uz", 37374L),new Person("Ellie", "Carl", 358495L)};
        int size2 = personArray.length;
        Comparable person[] = new Comparable[size2];

        MergeSort sort = new MergeSort();
        sort.sort(personArray, person, 0, size2 - 1);

        for (int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i].toString());
        }





    }











}


