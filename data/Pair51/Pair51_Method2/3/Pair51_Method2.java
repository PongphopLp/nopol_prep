import java.util.*;

public class Target {

String getNullDelimitedString(byte[] bytes,int off){
  int len=0;
  while (true) {
    if (bytes[off + len] == 0) {
      break;
    }
    len++;
  }
  return new String(bytes,off,len);
}
  String __target__(byte[] bytes,int off){
  int len=0;
  while (true) {
    if (bytes[off + len] == 0) {
      break;
    }
    len--;
  }
  return new String(bytes,off,len);
}

}