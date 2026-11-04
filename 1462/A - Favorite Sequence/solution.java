import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int a=sc.nextInt();
                            while(a-->0){
                                          int n=sc.nextInt();
                                          int nums[]=new int[n];
                                          for(int i=0;i<n;i++){
                                                        nums[i]=sc.nextInt(); }
                                          int sq[]=new int[n];
                                          int k=0;
                                          int i=0;
                                          int j=n-1;
                                          while(i<=j){
                                                        if(k%2==0){
                                                                      sq[k++]=nums[i++];
                                                        }
                                                        else{
                                                                      sq[k++]=nums[j--];
                                                        }
                                          }
                                          for(int x=0;x<n;x++){
                                                        System.out.print(sq[x]+" ");
                                                        
                                          }
                                          System.out.println("");
                            }}}