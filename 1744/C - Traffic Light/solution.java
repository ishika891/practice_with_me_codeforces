import java.util.*;
public class Main{
              public static void main(String[] args){
                            //1744C
                            Scanner sc = new Scanner(System.in);
                            int n=sc.nextInt();
                            while(n-->0){
                            int m=sc.nextInt();
                            
                            char ch=sc.next().charAt(0);
                            
                           String a=sc.next();
                           if(ch=='g'){
                                         System.out.println(0);
                                         continue;
                           }
                           String s=a+a;
                           int max=0;
                          int i=0;
                          while(i<s.length()){
                                         char c=s.charAt(i);
                                         if(c==ch){
                                                       
                                                       int j=i+1;
                                                       while(j<s.length()&&s.charAt(j)!='g'){
                                                                     j++;
                                                       }
                                                       max=Math.max(max,j-i);
                                                       i=j;
                                         }
                                         else {i++;}
                           }
                           System.out.println(max);
                           }
              }
}