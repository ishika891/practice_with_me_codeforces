import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            
                            int n=sc.nextInt();
                             int a=sc.nextInt();
                            int nums[]=new int[n];
                          
                            int count=0;
                            for(int i=0;i<n;i++){
                                          nums[i]=sc.nextInt();
                                          
                            }
                            int t=nums[a-1];
                            for(int i=0;i<nums.length;i++){
                                          if(nums[i]>=t&&nums[i]!=0){
                                                        count++;
                                          }
                            }
                            System.out.println(count);
              }
}