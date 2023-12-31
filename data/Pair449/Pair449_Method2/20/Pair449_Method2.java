import java.util.*;

public class Target {

int duzeltmeMesafesi(String s,String t,int limit){
  int n=s.length();
  int m=t.length();
  int[][] d=new int[n + 1][m + 1];
  int cost;
  if (n == 0)   return m;
  if (m == 0)   return n;
  for (int i=0; i <= n; d[i][0]=i++)   ;
  for (int j=0; j <= m; d[0][j]=j++)   ;
  for (int i=1; i <= n; i++) {
    for (int j=1; j <= m; j++) {
      cost=(t.charAt(j - 1) == s.charAt(i - 1) ? 0 : 1);
      d[i][j]=Math.min(Math.min(d[i - 1][j] + 1,d[i][j - 1] + 1),d[i - 1][j - 1] + cost);
      if (i > 1 && j > 1) {
        int trans=d[i - 2][j - 2] + 1;
        if (s.charAt(i - 2) != t.charAt(j - 1))         trans++;
        if (s.charAt(i - 1) != t.charAt(j - 2))         trans++;
        if (d[i][j] > trans)         d[i][j]=trans;
      }
    }
  }
  return d[n][m] > limit ? limit + 1 : d[n][m];
}
  int __target__(String s,String t,int limit){
  int n=s.length();
  int m=t.length();
  int[][] d=new int[n + 1][m + 1];
  int cost;
  if (n == 0)   return m;
  if (m == 0)   return n;
  for (int i=0; i <= n; d[i][0]=i--)   ;
  for (int j=0; j <= m; d[0][j]=j++)   ;
  for (int i=1; i <= n; i++) {
    for (int j=1; j <= m; j++) {
      cost=(t.charAt(j - 1) == s.charAt(i - 1) ? 0 : 1);
      d[i][j]=Math.min(Math.min(d[i - 1][j] + 1,d[i][j - 1] + 1),d[i - 1][j - 1] + cost);
      if (i > 1 && j > 1) {
        int trans=d[i - 2][j - 2] + 1;
        if (s.charAt(i - 2) != t.charAt(j - 1))         trans++;
        if (s.charAt(i - 1) != t.charAt(j - 2))         trans++;
        if (d[i][j] > trans)         d[i][j]=trans;
      }
    }
  }
  return d[n][m] > limit ? limit + 1 : d[n][m];
}

}