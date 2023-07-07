import java.util.*;

public class Target {

int sum(int[] terms,int start,int len){
  int s=0;
  final int iSz=start + len;
  for (int i=start; i < iSz; i++) {
    s+=terms[i];
  }
  return s;
}
  int __target__(int[] terms,int start,int len){
  int s=0;
  final int iSz=start + len;
  for (int i=start; i >= iSz; i++) {
    s+=terms[i];
  }
  return s;
}

}