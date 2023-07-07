import java.util.*;

public class Target {

double winklerImprovement(String s1,String s2,double commonality){
  int i;
  int n=Math.min(s1.length(),s2.length());
  for (i=0; i < n; i++) {
    if (s1.charAt(i) != s2.charAt(i)) {
      break;
    }
  }
  double commonPrefixLength=Math.min(4,i);
  double winkler=commonPrefixLength * 0.1 * (1 - commonality);
  return winkler;
}
  double __target__(String s1,String s2,double commonality){
  int i;
  int n=Math.min(s1.length(),s2.length());
  for (i=0; i < n; i++) {
    if (s1.charAt(i) == s2.charAt(i)) {
      break;
    }
  }
  double commonPrefixLength=Math.min(4,i);
  double winkler=commonPrefixLength * 0.1 * (1 - commonality);
  return winkler;
}

}