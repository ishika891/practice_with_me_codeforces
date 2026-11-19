import java.util.*;
public class Main{
              public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            int n=sc.nextInt();
                            int h[]=new int [n];
                            int g[]=new int[n];
                            for(int i=0;i<n;i++){
                                          h[i]=sc.nextInt();
                                          g[i]=sc.nextInt();
                            }
                           HashMap<Integer,Integer> h1=new HashMap<>();
                            HashMap<Integer,Integer> g1=new HashMap<>();
                           
                            for(int i=0;i<n;i++){
                                          if(h1.containsKey(h[i])){
                                                        h1.put(h[i],h1.get(h[i])+1);
                                          }
                                          else{
                                                        h1.put(h[i],1);
                                          }
                                          
                            }
                             for(int i=0;i<n;i++){
                                          if(g1.containsKey(g[i])){
                                                        g1.put(g[i],g1.get(g[i])+1);
                                          }
                                          else{
                                                        g1.put(g[i],1);
                                          }
                                          
                            }
                            int count=0;
                            for(int x:h1.keySet()){
                                          count+=h1.getOrDefault(x,0)*g1.getOrDefault(x,0);
                            }
                            System.out.println(count);
                           
              }
}