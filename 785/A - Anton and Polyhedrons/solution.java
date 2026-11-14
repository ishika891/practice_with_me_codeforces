import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int n=sc.nextInt();
                          String nums[]=new String[n];
                          int sum=0;
                          for(int i=0;i<n;i++){
                                        nums[i]=sc.next();
                                        if(nums[i].equals("Tetrahedron")){
                                                      sum+=4;
                                        }
                                        else if(nums[i].equals("Octahedron")){
                                                      sum+=8;
                                        }
                                         else if(nums[i].equals("Icosahedron")){
                                                      sum+=20;
                                        } else if(nums[i].equals("Dodecahedron")){
                                                      sum+=12;
                                        }
                                         else if(nums[i].equals("Cube")){
                                                      sum+=6;
                                        }
                                         
                          }
                          System.out.println(sum);
                           
              }
}