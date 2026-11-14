import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                           String s=sc.next();
                           int a=0;
                           int b=0;
                           int c=0;
                           int n=s.length()/2;
                           for(int i=0;i<s.length();i++){
                                         char ch=s.charAt(i);
                                         if(ch=='1'){a++;}
                                         else if(ch=='2'){b++;}
                                         else if (ch=='3'){c++;}
                           }
                           while(a!=0){
                                         System.out.print(1);
                                                                              if(n-->0){
                                                       System.out.print("+");
                                         }
                                         a--;
                           }
                           while(b!=0){
                                         System.out.print(2);
                                         
                                         if(n-->0){
                                                       System.out.print("+");
                                         }
                                         b--;
                           }
                           while(c!=0){
                                         System.out.print(3);
                                         
                                         if(n-->0){
                                                       System.out.print("+");
                                         }
                                         c--;
                           }
              }
}