import java.util.*;

public class Target {

int indexOf(byte[] tok,byte[] sub,int p){
  final int sl=sub.length;
  if (sl == 0)   return 0;
  final int tl=tok.length - sl;
  if (p > tl)   return -1;
  for (int t=p; t <= tl; t++) {
    int s=0;
    while (sub[s] == tok[t + s])     if (++s == sl)     return t;
  }
  return -1;
}
  int __target__(byte[] tok,byte[] sub,int p){
  final int sl=sub.length;
  if (sl == 0)   return 0;
  final int tl=tok.length - sl;
  if (p <= tl)   return -1;
  for (int t=p; t <= tl; t++) {
    int s=0;
    while (sub[s] == tok[t + s])     if (++s == sl)     return t;
  }
  return -1;
}

}