import java.util.Arrays;
import java.util.Random;

public class Q04_CreateMethodWithArray {
    public static void main(String[] args) {

        //    ||This Part Should be in Main Method||
        //
        //     -Create an array of size 5, assign some random values from 0 to 10
        //     -(use random class and for loop to assign values)
        //
        //
        //    ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
        //
        //     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
        //     -2-Create a method that prints the sum of an array
        //     -3-Create a method that prints the max element of an array
        //
        //    P.S: Return type should be void because we are not returning anything just printing

        Random rnd=new Random();
        int [] arr=new int[5];
        int sayac=0;

        while(arr.length>sayac){

            arr[sayac]= rnd.nextInt(11);

            sayac++;
        }



        printArray(arr);
        sumArray(arr);
        MaxElementArray(arr);

    }

    private static void MaxElementArray(int[] arr) {

        int maxElement=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++){if(arr[i]>maxElement){maxElement=arr[i];}}
        System.out.println("maxElement = " + maxElement);}

    private static void sumArray(int[] arr) {
        int sonuc=0;

        for (int i = 0; i < arr.length ; i++)
        {sonuc+=arr[i];}

        System.out.println("SumArray = " + sonuc);}

    private static void printArray(int[] arr) {
        System.out.print("Elements: "); for (int i = 0; i < arr.length ; i++) {;System.out.print(arr[i]+" ");}
        System.out.println();}
}
