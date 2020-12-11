import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {1, 7, 5, 6, 2, 9, 8, -1};
        int[] arr2 = {4, 6, 43, 11, -10, 99, 81, 0};
        int[] arr3 = new int[16];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr3));


        int [] array = Arrays.copyOfRange(arr1, 0, arr1.length);
        System.out.println(Arrays.toString(array));

        merge(arr1, arr2, arr3);

}

    public static void merge (int []arr1, int []arr2, int []arr3) {
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
    }
}
