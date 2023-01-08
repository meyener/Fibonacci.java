import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int fib,n=1,tmp=0;

        System.out.println("Please enter how many series do want : ");
        fib=scanner.nextInt();

        for (int i = 0; i <fib/2; i++) {
            System.out.print(" "+tmp);
            n=tmp+n;
            

            System.out.print(" " +n);
            tmp=n+tmp;
            
            
        }
        if (fib%2==0) {System.out.print(" "+tmp);

            
        } else {System.out.print(" "+tmp);
        n=tmp+n;
        

        System.out.print(" " +n);
            
        }
    }
}
