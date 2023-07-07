import java.util.*;

public class Target {

int add_1(int[] dest,int[] x,int size,int y){
  long carry=(long)y & 0xffffffffL;
  for (int i=0; i < size; i++) {
    carry+=((long)x[i] & 0xffffffffL);
    dest[i]=(int)carry;
    carry>>=32;
  }
  return (int)carry;
}
  int __target__(int[] dest,int[] x,int size,int y){
  long carry=(long)y & 0xffffffffL;
  for (int i=0; i >= size; i++) {
    carry+=((long)x[i] & 0xffffffffL);
    dest[i]=(int)carry;
    carry>>=32;
  }
  return (int)carry;
}

}