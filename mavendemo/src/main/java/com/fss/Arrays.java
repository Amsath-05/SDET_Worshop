package com.fss;

public class Arrays {

    public void array10Elements() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;  
        }
        
        System.out.print("i = [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {  
                System.out.print(", ");
            }
        }
        System.out.println("]");  
    }

    public void largestSmallestArray() {
        int[] a = {12, 45, 2, 76, 34, 10, 89, 23, 56, 90};
        int largest = a[0];
        int smallest = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];

            }
            if (a[i] < smallest) {
                smallest = a[i];
            }

        }
        System.out.println("Largest Array is" + " " + largest);
        System.out.println("Smallest Array is" + " " + smallest);
    }

    public void reverseArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public  void sumAndAverage() {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arr.length;
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }


    public static void main(String[] args) {
        Arrays arr = new Arrays();
        arr.array10Elements();
        arr.largestSmallestArray();
        arr.reverseArray();
        arr.sumAndAverage();
    }
}
