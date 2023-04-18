public class Recursively {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 4, 5, 6, 79};
        int n = a.length;
        int key = 6;
        System.out.println(binary_Recursively(a, key, 0, n - 1));
    }

    private static int binary_Recursively(int[] a, int key, int s, int e) {

        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;

        if (key == a[mid]) {
            return mid;
        }
        if (key > a[mid]) {
            return binary_Recursively(a, key, mid + 1, e);
        } else
            return binary_Recursively(a, key, s, mid - 1);
    }

}
