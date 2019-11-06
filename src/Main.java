import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        String []c=a.split("");
        String []e=b.split("");
        String []d=new String[a.length()+b.length()];

        int t=c.length;
        int num=0;

        List<String>list=new LinkedList<>();
        for (int i = 0; i <c.length ; i++) {//将C中的字符串换成字符链表
               list.add(c[i]);
        }
        for (int i = 0; i <=c.length ; i++) {
            int s = 0;
            for (int j = i; j < b.length() + i; j++) {
                 list.add(j, e[s]);
                 s++;
            }
            for (int j = 0; j <d.length ; j++) {
                d[j]=list.get(j);
                System.out.print(d[j]);
            }
            System.out.println();
            if(jarge(d)) {
                num++;
            }
            for (int j = i+b.length()-1; j >=i ;j--) {
                list.remove(j);
            }
        }
        System.out.println(num);
        }

    private static boolean jarge(String[] d) {
        int begin=0;
        int end=d.length-1;
        while(begin<=end){

            if(!d[begin].equals(d[end])){
                return false;
            }
            begin++;
            end--;
        }
        return true;
        }
    }

