package arraysQ;

import java.util.Arrays;
import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        System.out.println("Array Operations");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        printArray(arr,sc);
        revArray(arr);
        minArray(arr);
        maxArray(arr);
        secMini(arr);
    }
    //print an Array with int Elements
    public static void printArray(int arr[],Scanner sc){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array: "+Arrays.toString(arr));
    }
    //reverse that Array
    public static void revArray(int arr[]){
        for(int i=0;i<=arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        
        System.out.println("Reversed Array: "+Arrays.toString(arr));
    }
    public static void minArray(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element in Array: "+min);
    }

    public static void maxArray(int [] arr){
        int max=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum Element in Array: "+max);
    }
    public static void secMini(int [] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element in Array: "+min);
        int secmini = arr[0];
        for(int i=0;i<arr.length;i++){
            if(secmini>min){
                secmini=arr[i];
            }
        }
        System.out.println("Second Minimum: "+secmini);
}
}
        

