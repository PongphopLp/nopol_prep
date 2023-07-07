import java.util.*;

public class Target {

int strlen(byte[] data,int offset){
  int i=offset;
  while (data[i++] != 0) {
  }
  return i - offset - 1;
}
  int __target__(byte[] data,int offset){
  int i=offset;
  while (data[i--] != 0) {
  }
  return i - offset - 1;
}

}