package mycompany.my;

import java.util.Scanner;

public class рорр {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; ++i) {
            array[i] = in.nextInt();
        }
        for(int i = 0; i < array.length -1;i+=n){
            int temp = array[i];
            array[i] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
        for (int j : array) System.out.print(j + " ");
    }
}
