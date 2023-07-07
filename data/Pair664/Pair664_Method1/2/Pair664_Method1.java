import java.util.*;

public class Target {

int binomial(int n,int m){
  int[] b=new int[n + 1];
  b[0]=1;
  for (int i=1; i <= n; i++) {
    b[i]=1;
    for (int j=i - 1; j > 0; --j) {
      b[j]+=b[j - 1];
    }
  }
  return b[m];
}
  int __target__(int n,int m){
  int[] b=new int[n + 1];
  b[0]=1;
  for (int i=1; i <= n; i++) {
    b[i]=1;
    for (int j=i - 1; j >= 0; --j) {
      b[j]+=b[j - 1];
    }
  }
  return b[m];
}

}