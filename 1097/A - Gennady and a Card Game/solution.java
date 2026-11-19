import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            String ch=sc.next();
                            String nums[]=new String[5];
                            int flag=0;
                            for(int i=0;i<5;i++){
                                          nums[i]=sc.next();
                                          if(nums[i].charAt(0)==ch.charAt(0)||nums[i].charAt(1)==ch.charAt(1)){
                                                        flag=1;
                                          }
                            }
                            if(flag==0){
                                          System.out.println("NO");
                            }
                            else{
                                          System.out.println("YES");
                            }
                            
                            
              }
}