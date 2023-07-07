import java.util.*;

public class Target {

int byteToInt2(byte[] b){
  int mask=0xff;
  int temp=0;
  int n=0;
  for (int i=0; i < 4; i++) {
    n<<=8;
    temp=b[i] & mask;
    n|=temp;
  }
  return n;
}
  int __target__(byte[] b){
  int mask=0xff;
  int temp=0;
  int n=0;
  for (int i=0; i <= 4; i++) {
    n<<=8;
    temp=b[i] & mask;
    n|=temp;
  }
  return n;
}

}