import java.util.Scanner;

    class Main1{

        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int []a=new int[10];
            int t=1;
            int p=0;
            for (int i = 0; i <a.length ; i++) {
                if(t==0) break;
                p++;
                a[i]=in.nextInt();
                t=a[i];
            }
            for (int i=0;i<p;i++) {
                if(a[i]==0){
                    break;
                }
                int drank=0;
                int x=0;
                int y=a[i];
                while(y>2){
                    t=y;
                    drank=t/3;
                    y=t%3+drank;
                    x+=drank;
                }
                if(y==2){
                    x++;
                }
                System.out.println(x);
            }

        }
    }

