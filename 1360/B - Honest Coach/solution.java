import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc= new Scanner(System.in);
                            int a=sc.nextInt();
                            while(a-->0){
                                          int n=sc.nextInt();
                                          int nums[]=new int[n];
                                          int min=Integer.MAX_VALUE;
                                          for(int i=0;i<n;i++){
                                                        nums[i]=sc.nextInt();
                                          }
                                          Arrays.sort(nums);
                                          for(int i=0;i<n-1;i++){
                                                        min=Math.min(min,Math.abs(nums[i]-nums[i+1]));
                                          }
                                          System.out.println(min);
                            }
                         
                                          
                            }
              
}