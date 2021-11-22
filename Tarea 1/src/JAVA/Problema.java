package JAVA;

import java.io.*;
import java.util.Scanner;

public class Problema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        /* Assuming first element is smallest */

        int min = arr[0];
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                pos = i;
            }
        }

        System.out.println("The smallest elements is : " + min);
        // Since index starts from 0, print position as pos+1
        System.out.println("Position of smallest element is : " + (pos + 1));
    }
}