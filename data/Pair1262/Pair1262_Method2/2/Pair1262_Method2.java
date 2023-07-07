import java.util.*;

public class Target {

boolean isNotZero(byte[] sector,int offset,int len){
  int i;
  for (i=offset; i < offset + len; i++) {
    if ((sector)[i] != 0)     return true;
  }
  return false;
}
  boolean __target__(byte[] sector,int offset,int len){
  int i;
  for (i=offset; i < offset + len; i++) {
    if ((sector)[i] == 0)     return true;
  }
  return false;
}

}