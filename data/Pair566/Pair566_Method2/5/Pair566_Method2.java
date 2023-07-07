import java.util.*;

public class Target {

long readLong(byte[] b,int start){
  long l=0;
  for (int i=0; i < 8; i++) {
    l<<=8;
    l|=b[start + i] & 0xff;
  }
  return l;
}
  long __target__(byte[] b,int start){
  long l=0;
  for (int i=0; i < 8; i++) {
    l<<=8;
    l|=b[start - i] & 0xff;
  }
  return l;
}

}