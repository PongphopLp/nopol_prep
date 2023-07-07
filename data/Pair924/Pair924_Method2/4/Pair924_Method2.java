import java.util.*;

public class Target {

int sum(int[] terms,int start,int len){
  int s=0;
  for (int i=start, iSz=start + len; i < iSz; i++)   s+=terms[i];
  return s;
}
  int __target__(int[] terms,int start,int len){
  int s=0;
  for (int i=start, iSz=start + len; i >= iSz; i++)   s+=terms[i];
  return s;
}

}