import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc =new Scanner(System.in);
                            int a=sc.nextInt();
                            while(a-->0){
                            
                            int n=sc.nextInt();
                            int t=n;
                            int y=n;
                            int count=0;
                           while(y!=0){
                                         int r=y%10;
                                         if(r!=0){
                                                       count++;
                                         }
                                         y/=10;
                           }
                            int x=1;
                            System.out.println(count);
                            while(t!=0){
                                          int rem=t%10;
                                         if(rem*x!=0){ System.out.print(rem*x+" ");}
                                          x*=10;
                                          t/=10;
                            }
                            System.out.println("");
                            
                           
                            
              }
} }