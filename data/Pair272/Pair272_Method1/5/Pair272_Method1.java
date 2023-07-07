import java.util.*;

public class Target {

double winklerImprovement(String s1,String s2,double commonality){
  int i;
  int n=Math.min(s1.length(),s2.length());
  for (i=0; i < n; i++)   if (s1.charAt(i) != s2.charAt(i))   break;
  return Math.min(4,i) * 0.1 * (1 - commonality);
}
  double __target__(String s1,String s2,double commonality){
  int i;
  int n=Math.min(s1.length(),s2.length());
  for (i=0; i <= n; i++)   if (s1.charAt(i) != s2.charAt(i))   break;
  return Math.min(4,i) * 0.1 * (1 - commonality);
}

}