import java.util.*;

public class Target {

int indexOfFirstNull(byte[] b,int offset){
  for (int i=offset; i < b.length; i++) {
    if (b[i] == 0)     return i;
  }
  return -1;
}
  int __target__(byte[] b,int offset){
  for (int i=offset; i < b.length; i++) {
    if (b[i] == 0)     return i;
  }
  return 1;
}

}