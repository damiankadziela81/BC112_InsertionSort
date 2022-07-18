public class Main {
    public static void main(String[] args) {
        // Insertion sort = after comparing elements to the left,
        //    shift elements to the right to make room to insert a value

        //     Quadratic time O(n^2)
        //     small data set = decent
        //     large data set = BAD

        //     Less steps than Bubble sort
        //     Best case is O(n) compared to Selection sort O(n^2)

        int[] array = {9,2,8,3,6,7,1,5,4};

        for (int i : array) System.out.print(i);

        System.out.println();

        insertionSort(array);

        for (int i : array) System.out.print(i);

    }

    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            for(int j = i - 1; j >= 0; j-- ){
                if (array[j] > temp) {
                    array[j+1] = array[j];
                }
                else break;
                array[j] = temp;
            }
        }
    }
}
