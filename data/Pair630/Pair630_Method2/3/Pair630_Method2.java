import java.util.*;

public class Target {

int getIntValue(byte[] data,int offset){
  int result=0;
  for (int i=(offset + 3); i >= offset; i--) {
    int temp=0xFF & data[i];
    result=result << 8;
    result=result | temp;
  }
  return result;
}
  int __target__(byte[] data,int offset){
  int result=0;
  for (int i=(offset + 3); i >= offset; i--) {
    int temp=0xFF & data[i];
    result=result >> 8;
    result=result | temp;
  }
  return result;
}

}