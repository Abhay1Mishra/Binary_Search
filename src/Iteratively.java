public class Iteratively {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 4, 5, 6, 79};
        int n = a.length;
        int key = 6;
        System.out.println(binary(a, key, 0, n - 1));
    }

    private static int binary(int[] a, int key, int s, int e) {

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (key == a[mid]) {
                return mid;
            }
            if (key > a[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}