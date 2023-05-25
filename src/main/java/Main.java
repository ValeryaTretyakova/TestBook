package org.example;

public class Main {

    public static int Search(int[] array, int newBook) throws Exception {

        if (newBook <= 0){
            throw new Exception();
        }
        if (array.length == 0){
            return 0;
        }
        if (newBook > array[array.length -1]){
            return 0;
        }

        int left = 0;
        int right = array.length - 1;
        int result = array.length;



        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] <= newBook && array[middle + 1] > newBook) {
                return result = array.length - (middle + 1);
            } else if (array[middle] > newBook) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        int books[] = new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72};
        System.out.println(Search(books, 32));
    }
}

