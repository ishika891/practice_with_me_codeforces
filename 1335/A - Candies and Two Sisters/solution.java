import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc =new Scanner(System.in);
                            int a=sc.nextInt();
                            while(a-->0){
                            
                            long n=sc.nextLong();
                            
                            
                            if(n%2==0){System.out.println((n/2)-1);}
                            else{
                                          System.out.println((n-1)/2);
                            }
              }
} }