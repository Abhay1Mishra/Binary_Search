public class Books_Allocation {
    public static void main(String[] args) {
         int[] a= new int[]{10,10,20,30};
         int n = a.length;
         int key = 2;
         int max = a[0];
         int sum = 0;
         for (int i = 0;i<n;i++){
             if (a[i]>max) {
                 max = a[i];
             }
             sum+=a[i];

         }
        System.out.println(allocation(a,key,max,sum));
    }

    private static int allocation(int[] a, int key, int min, int max) {
        int res =0;
        while (min<=max) {
            int mid = (max + min) / 2;
            if(isFeasible(a,key,mid)){
                res =mid;
                max =mid-1;
            }
            else
                min =mid+1;

        }
        return res;
    }

    private static boolean isFeasible(int[] a, int key, int res) {
        int student =1;
        int sum =0;
        for (int i =0;i<a.length;i++){
            if(sum +a[i] >res){
                student++;
                sum =a[i];
            }
            else
                sum+=a[i];

        }
        return student<=key;

    }
}
