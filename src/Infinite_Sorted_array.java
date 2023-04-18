public class Infinite_Sorted_array {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 4, 5, 6,8,9,12,15,20,22,44,55,66,77,88,79};
        int key = 4;

        System.out.println(Infinite(a,key,0,1));
    }

    private static int Infinite(int[] a, int key, int s, int e) {
        while (key > a[e]) {
            s = e;
            e = 2 * e;
        }
        return binary_Recursively(a, key, s, e);
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
        }
        else
            return binary_Recursively(a, key, s, mid - 1);
    }

}

