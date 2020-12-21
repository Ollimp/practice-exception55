package org.itstep.task04;

public class Main {
    public static void main(String[] args) {
        try{
            binarySearch(new int[]{1, 2, 3, 6, 5}, 2,0, 4);
        } catch (ArrayUnsortedException e){
            System.out.println(e.getMessage());
        }
    }

    public static int binarySearch(int[] array, int key, int low, int high) throws ArrayUnsortedException {
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i+1]){
                throw new ArrayUnsortedException("Array is unsorted!");
            }
        }
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] < key) {
                low = mid + 1;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else if (array[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
