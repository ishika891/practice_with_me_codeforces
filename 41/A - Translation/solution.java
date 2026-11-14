import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            
                           String s=sc.next();
                           String t=sc.next();
                         StringBuilder sb =new StringBuilder();
                         
                         for(int i=s.length()-1;i>=0;i--){
                                      char ch=s.charAt(i);
                                     sb.append(ch);
                         }
                         String st=sb.toString();
                         if(st.equals(t)){
                                       System.out.println("YES");
                         }
                         
                         else{
                                       System.out.println("NO");
                         }
                           
              }
}