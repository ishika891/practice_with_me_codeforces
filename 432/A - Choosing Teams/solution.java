import java.util.*;
public class Main{
              public static void main(String [] args){
                            Scanner sc = new Scanner(System.in);
                            int n=sc.nextInt();
                            int s=sc.nextInt();
                            int nums[]=new int[n];
                            for(int i=0;i<n;i++){
                                          int l=sc.nextInt();
                                          int sl=5-l;
                                          if(sl>=s){
                                                        nums[i]=sl;
                                          }
                                          else{
                                                        nums[i]=0;
                                          }
                                          
                            }
                            int t_count=0;
                            int count=0;
                            for(int i=0;i<n;i++){
                                          if(nums[i]>0){
                                                        count++;
                                          
                                          if(count%3==0){
                                                        t_count++;
                                                        count=0;
                                          }}
                            }
                            System.out.println(t_count);
                            
                            
              }
}