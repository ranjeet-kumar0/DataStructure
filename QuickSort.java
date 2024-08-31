package DataStructure;

import java.util.Scanner;

/**
 * QuickSort
 */
public class QuickSort {

    void input(int arr[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Element in Array : ");

        for (int i = 0; i < arr.length; i++) {
               arr[i] = sc.nextInt(); 
        }
    }

    void display(int arr[]){
        System.out.println("Sorted Array is :");
        for (int n : arr) {
            System.out.println(" "+ n);

        }
    }

    
    public static void main(String[] args) {
        
    }
}