import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int a=sc.nextInt();
                            while(a-->0){
                                          int n=sc.nextInt();
                                          int nums[]=new int[n];
                                          for(int i=0;i<n;i++){
                                                        nums[i]=sc.nextInt();
                                          }
                                          Arrays.sort(nums);
                                          int l=0;
                                          int r=n-1;
                                          int sum=0;
                                          while(l<=r){
                                                        sum+=nums[r]-nums[l];
                                                        l++;
                                                        r--;
                                          }
                                          System.out.println(sum);
                                          
                            }
              }
}