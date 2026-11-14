import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int n=sc.nextInt();
                            String s=sc.next();
                            s=s.toLowerCase();
                            int nums[]=new int[26];
                            for(int i=0;i<n;i++){
                                          nums[s.charAt(i)-'a']++;
                            }
                            int flag=0;
                            for(int i=0;i<nums.length;i++){
                                          if(nums[i]==0){
                                                        flag=1;
                                                        break;
                                          }
                            }
                          
                         if(flag==0){
                                       System.out.println("YES");
                         }
                         
                         else{
                                       System.out.println("NO");
                         }
                           
              }
}