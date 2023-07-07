import java.util.*;

public class Target {

int toInt(byte[] bytes,int offset,int length){
  int result=0;
  int end=offset + length;
  for (int i=offset; i < end; i++) {
    result=(result << 8) + (bytes[i] & 0xFF);
  }
  return result;
}
  int __target__(byte[] bytes,int offset,int length){
  int result=0;
  int end=offset + length;
  for (int i=offset; i < end; i--) {
    result=(result << 8) + (bytes[i] & 0xFF);
  }
  return result;
}

}