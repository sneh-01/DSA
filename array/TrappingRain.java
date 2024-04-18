public class TrappingRain {

    public static int areaTrap(int arr[]) {
        int n = arr.length;

        // left max boundry
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }

        // right max boundry
        int rightmax[] = new int[n];
        rightmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }

        int tw = 0;
        // loop
        for (int i = 0; i < n; i++) {

            // water level = min(max left , max right)
            int wl = Math.min(leftmax[i], rightmax[i]);

            // trapped water = wl - hight[i]
            tw += wl - arr[i];

        }

        return tw;

    }

    public static void main(String[] args) {

        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(areaTrap(arr));

    }
}
