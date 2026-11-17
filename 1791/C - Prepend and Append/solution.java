import java.util.*;
public class Main{
              public static void main(String [] args){
                            Scanner sc = new Scanner(System.in);
                           int a=sc.nextInt();
                           while(a-->0){
                                         int n=sc.nextInt();
                                         sc.nextLine();
                                         String s=sc.next();
                                         int count=0;
                                         for(int i=0;i<n/2;i++){
                                                       if((s.charAt(i)=='0'&&s.charAt(n-i-1)=='1')||(s.charAt(i)=='1'&&s.charAt(n-i-1)=='0')){
                                                                     count++;
                                                       }
                                                       else{
                                                                     break;
                                                       }
                                         }
                                         System.out.println(n-count*2);
                           }
 
              }
}