import java.util.*;

public class Finder {
    public int findKth(int[] a, int n, int K) {
        quitsort(a,0,n-1);
        return a[n-K];
    }

    private void quitsort(int[] a, int left,int right) {
        if(left>=right){
            return;
        }
        int t=pri(a,left,right);
        quitsort(a,left,t-1);
        quitsort(a,t+1,right);
    }

    private int pri(int[] a, int left, int right) {
        int i=left;
        int j=right;
        int pri=a[left];
        while(i<j){
            while(i<j&&a[j]>=pri){
                j--;
            }
            while(i<j&&a[i]<=pri){
                i++;
            }
            swap(a,i,j);
        }
        swap(a,i,left);
        return i;
    }

    private void swap(int[] a, int i, int j) {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    public static void main(String[] args) {
        Finder b=new Finder();
        int []a={1,2,3,7,9};
        System.out.println(b.findKth(a,5,1));
    }
}