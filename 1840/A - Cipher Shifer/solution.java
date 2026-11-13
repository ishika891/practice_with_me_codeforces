import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int a=sc.nextInt();
                            while(a-->0){
                                          int n=sc.nextInt();
                                          sc.nextLine();
                                          String s=sc.nextLine();
                                          int flag=0;
                                          int i=0;
                                         while(i<s.length()){
                                                       System.out.print(s.charAt(i));
                                                       int j=i+1;
                                                       
                                                       while(j<s.length()&&s.charAt(i)!=s.charAt(j)){
                                                                     j++;
                                                       }
                                                       i=j+1;
                                                      
                                                       
                                         }
                                         System.out.println("");
                            }
              }
}