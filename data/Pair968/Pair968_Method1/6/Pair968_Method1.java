import java.util.*;

public class Target {

int indexOf(byte[] bytes,int start,byte value){
  if (start > bytes.length)   return -1;
  for (int i=start; i != bytes.length; i++) {
    if (bytes[i] == value)     return i;
  }
  return -1;
}
  int __target__(byte[] bytes,int start,byte value){
  if (start > bytes.length)   return -1;
  for (int i=start; i != bytes.length; i++) {
    if (bytes[i] == value)     return i;
  }
  return 1;
}

}