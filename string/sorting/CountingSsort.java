public class CountingSsort {

    public static void CountingS(int arr[]) {
        // for finding a rang
        int Largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            Largest = Math.max(Largest, arr[i]);
        }

        // counting the freq
        int count[] = new int[Largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 5, 4, 6, 7, 3, 2, 4, 5, 8 };
        CountingS(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
