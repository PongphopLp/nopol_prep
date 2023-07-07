import java.util.*;

public class Target {

int[] splitArray(int[] in,int a,int b){
  int i=0;
  int x=a;
  int[] tmp=new int[b - a + 1];
  for (x=a; x <= b; x++, i++) {
    tmp[i]=in[x];
  }
  return tmp;
}
  int[] __target__(int[] in,int a,int b){
  int i=0;
  int x=a;
  int[] tmp=new int[b - a + 1];
  for (x=a; x > b; x++, i++) {
    tmp[i]=in[x];
  }
  return tmp;
}

}