public class Sorted_And_Rotated_Array {
    public static void main(String[] args) {
        int[] a = new int[]{10,12,14,17,1, 3, 4, 5, 6, 9};
        int n = a.length;
        int key = 6;
        System.out.println(binary(a,key,0,n-1));
    }

    private static int binary(int[] a, int key, int s, int e) {
        if(s>=e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if (key==a[mid]){
            return mid;
        }
        if(key<=a[mid]){

            if(key<a[mid] && key>=a[s]){
               return binary(a,key,s,mid-1);
            }else
                return binary(a,key,mid+1,e);
        }
        else
            if(key>a[mid] && key<=a[e]){
                return binary(a,key,mid+1,e);
            }
            else
                return binary(a,key,s,mid-1);


    }
}
