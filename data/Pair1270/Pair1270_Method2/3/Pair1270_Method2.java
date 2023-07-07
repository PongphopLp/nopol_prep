import java.util.*;

public class Target {

short getShortValue(byte[] data,int offset){
  int result=0;
  for (int i=(offset + 1); i >= offset; i--) {
    int temp=0xFF & data[i];
    result=result << 8;
    result=result | temp;
  }
  return (short)(result & 0xFFFF);
}
  short __target__(byte[] data,int offset){
  int result=0;
  for (int i=(offset - 1); i >= offset; i--) {
    int temp=0xFF & data[i];
    result=result << 8;
    result=result | temp;
  }
  return (short)(result & 0xFFFF);
}

}