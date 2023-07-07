import java.util.*;

public class Target {

int mul_1(int[] dest,int[] x,int len,int y){
  long yword=y & 0xffffffffL;
  long carry=0;
  for (int j=0; j < len; j++) {
    carry+=(x[j] & 0xffffffffL) * yword;
    dest[j]=(int)carry;
    carry>>>=32;
  }
  return (int)carry;
}
  int __target__(int[] dest,int[] x,int len,int y){
  long yword=y & 0xffffffffL;
  long carry=0;
  for (int j=0; j < len; j++) {
    carry+=(x[j] | 0xffffffffL) * yword;
    dest[j]=(int)carry;
    carry>>>=32;
  }
  return (int)carry;
}

}