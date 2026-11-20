import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc= new Scanner(System.in);
                           
                                          int n=sc.nextInt();
                                          int nums[]=new int[n];
                                         int a=0;
                                         int b=0;
                                         int c=0;
                                          for(int i=0;i<n;i++){
                                                        nums[i]=sc.nextInt();
                                                        if(nums[i]==1){
                                                                      a++;
                                                        }
                                                        else if(nums[i]==2){
                                                                      b++;
                                                        }
                                                        else{
                                                                      c++;
                                                        }
                                          }
                                          int min=Math.min(c,Math.min(a,b));
                                          System.out.println(min);
                                          int i=0;
                                          int j=0;
                                          int k=0;
                                          while(min-->0){
                                                        
                                                        while(i<n){
                                                                      if(nums[i]==1){
                                                                                    System.out.print(i+1+" ");
                                                                                    i++;
                                                                                    break;
                                                                      }
                                                                      i++;
                                                        }
                                                        while(j<n){
                                                                      if(nums[j]==2){
                                                                                    System.out.print(j+1+" ");
                                                                                    j++;
                                                                                    break;
                                                                      }
                                                                      j++;
                                                        }
                                                        while(k<n){
                                                                      if(nums[k]==3){
                                                                                    System.out.print(k+1+" ");
                                                                                    k++;
                                                                                    break;
                                                                      }
                                                                      k++;
                                                        }
                                                        System.out.println("");
                                          
                                         
                                         
                                          
                            }
                         
                                          
                            }
              
}