import java.util.*;

public class Target {

int findNullCharPosition(byte[] byteArray,int startPos){
  for (int i=startPos; i < byteArray.length; i++) {
    if (byteArray[i] == 0) {
      return i;
    }
  }
  return byteArray.length;
}
  int __target__(byte[] byteArray,int startPos){
  for (int i=startPos; i < byteArray.length; i++) {
    if (byteArray[i] != 0) {
      return i;
    }
  }
  return byteArray.length;
}

}