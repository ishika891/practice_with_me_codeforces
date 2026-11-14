import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                           String s=sc.next();
                         int a=0;
                         int b=0;
                         for(int i=0;i<s.length();i++){
                                      char ch=s.charAt(i);
                                      if(ch>='a'&&ch<='z'){
                                                    a++;
                                      }
                                      else{b++;}
                         }
                         if(a>=b){
                                       System.out.println(s.toLowerCase());
                         }
                         else{
                                       System.out.println(s.toUpperCase());
                         }
                           
              }
}