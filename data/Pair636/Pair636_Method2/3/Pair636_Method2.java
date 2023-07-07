import java.util.*;

public class Target {

int next0(byte[] bytes,int start){
  for (int current=start; current < bytes.length; current++) {
    if (bytes[current] == 0)     return current;
  }
  return bytes.length;
}
  int __target__(byte[] bytes,int start){
  for (int current=start; current >= bytes.length; current++) {
    if (bytes[current] == 0)     return current;
  }
  return bytes.length;
}

}