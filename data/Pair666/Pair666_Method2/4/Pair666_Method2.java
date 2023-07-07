import java.util.*;

public class Target {

int getInt(byte[] bytes,int offset){
  int result=0;
  for (int shift=0; shift < 32; shift+=8) {
    result|=(((int)bytes[offset++]) & 0xff) << shift;
  }
  return result;
}
  int __target__(byte[] bytes,int offset){
  int result=0;
  for (int shift=0; shift < 32; shift+=8) {
    result|=(((int) bytes[offset++]) | 0xff) << shift;
  }
  return result;
}

}