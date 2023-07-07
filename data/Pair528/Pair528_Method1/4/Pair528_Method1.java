import java.util.*;

public class Target {

byte SumCheck(byte[] buf,int len){
  byte sum_check=0;
  for (int i=0; i < len; i++) {
    sum_check^=buf[i] & 0xff;
  }
  return sum_check;
}
  byte __target__(byte[] buf,int len){
  byte sum_check=0;
  for (int i=0; i < len; i++) {
    sum_check^=buf[i] | 0xff;
  }
  return sum_check;
}

}