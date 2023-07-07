import java.util.*;

public class Target {

int avg(int[] n){
  int sum=0;
  for (int k=0; k < n.length; k++) {
    sum+=n[k];
  }
  return sum / n.length;
}
  int __target__(int[] n){
  int sum=0;
  for (int k=0; k <= n.length; k++) {
    sum+=n[k];
  }
  return sum / n.length;
}

}