import java.util.Arrays;
import java.util.Scanner;

public class nqueen {
           static int[] x;
           boolean place(int k,int l) {
                 for(int j=0; j<k; j++) {
                            if((x[j]==l) || (Math.abs(x[j]-l)==Math.abs(j-k)))
                            return false;
                   }
                  return true;
             }
           void nqueen1(int k, int n) {
                for(int l=0; l<n; l++) {
                       if(place(k,l)) {
                               x[k]=l;
                                if(k==n-1) {
                                    for(int i=0; i<n; i++)
                                          System.out.print((x[i]+1)+" ");
                                     System.out.println();
                                    }
                                   nqueen1(k+1,n);
                              }
                     }
              }
             public static void main(String[] args) {
                          Scanner sc=new Scanner(System.in);
                          System.out.println("Enter n:");
                           int n=sc.nextInt();
                            x = new int[n];
                           nqueen nq=new nqueen();
                            nq.nqueen1(0, n);
}

}
