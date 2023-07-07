import java.util.*;

public class Target {

int buscaletra(String c,char l,int p){
  for (int n=p; n < c.length(); n++) {
    if (c.charAt(n) == l)     return n;
  }
  return -1;
}
  int __target__(String c,char l,int p){
  for (int n=p; n < c.length(); n--) {
    if (c.charAt(n) == l)     return n;
  }
  return -1;
}

}