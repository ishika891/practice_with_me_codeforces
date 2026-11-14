import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int n=sc.nextInt();
                            sc.nextLine();
                           String s=sc.next();
                         int a=0;
                         int b=0;
                         for(int i=0;i<s.length();i++){
                                      char ch=s.charAt(i);
                                      if(ch=='A'){
                                                    a++;
                                      }
                                      else{b++;}
                         }
                         if(a>b){
                                       System.out.println("Anton");
                         }
                         else if(a==b){
                                       System.out.println("Friendship");
                         }
                         else{
                                       System.out.println("Danik");
                         }
                           
              }
}