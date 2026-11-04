import java.util.*;
public class Main{ 
              public static void main(String[] args){ 
                            Scanner sc = new Scanner(System.in); 
                            int n=sc.nextInt();
                            int nums[]=new int[n];
                            for(int i=0;i<n;i++){
                                          nums[i]=sc.nextInt(); }
                                          int sum1=0;
                                          int sum2=0;
                                          int i=0;
                                          int j=n-1;
                                          int x=0;
                                          while(i<=j){
                                                        if(x%2==0){
                                                                      if(nums[i]>nums[j]){
                                                                                    sum1+=nums[i];
                                                                                    i++; }
                                                                      else{
                                                                                    sum1+=nums[j];
                                                                                    j--; } }
                                                        else{ if(nums[i]>nums[j]){
                                                                      sum2+=nums[i];
                                                                      i++; }
                                                              else{ 
                                                                      sum2+=nums[j];
                                                                      j--; } }
                                                        x++; }
                            System.out.print(sum1+" "+sum2); }}