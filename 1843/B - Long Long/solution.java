import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int a=sc.nextInt();
                            while(a-->0){
                                          int n=sc.nextInt();
                                         int nums[]=new int[n];
                                         long sum=0;
                                         for(int i=0;i<n;i++){
                                                       nums[i]=sc.nextInt();
                                                       if(nums[i]<0){
                                                                     sum-=nums[i];
                                                       }
                                                       else{
                                                                     sum+=nums[i];
                                                       }
                                         }
                                         
                                         int count=0;
                                         int i=0;
                                         
                                         while(i<n){
                                                      if(nums[i]<0){count++;
                                                            int j=i+1;
                                                       
                                                            while(j<n&&nums[j]<=0){
                                                                     j++;
                                                       }
                                                                       i=j+1;}
                                                      else{ i++;}
                                                      
                                                       
                                         }
                                         System.out.println(sum+" "+count);
                            }
              }
}