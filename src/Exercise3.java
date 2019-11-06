import java.util.Scanner;

public class Exercise3 {
    public static int num;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []a=new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i]=in.nextInt();
        }
        mergeSort(a,0,n-1);
        System.out.println(num);
    }

    private static void mergeSort(int[] a, int i, int i1) {
        if(i>=i1){
            return;
        }
        int mid=i+(i1-i)/2;
        mergeSort(a,i,mid);
        mergeSort(a,mid+1,i1);
        merge(a,i,mid,i1);
    }

    private static void merge(int[] a, int i, int mid, int i1) {
        int []nums=new int[i1-i+1];
        int p=i;
        int q=mid+1;
        int index=0;
        while(p<=mid&&q<=i1){
            if(a[p]>a[q]){
                num+=mid-p+1;
                nums[index++]=a[q++];
            }else {
                nums[index++]=a[p++];
            }
        }
         while(p<=mid){
                nums[index++]=a[p++];

           }
           while (q<=i1){
                    nums[index++]=a[q++];
           }

            System.arraycopy(nums,0,a,i,i1-i+1);


    }
}
