import java.util.*;

public class Target {

byte[] subArray(byte[] input,int offset,int length){
  byte[] sub=new byte[length];
  for (int i=offset; i < offset + length; i++) {
    sub[i - offset]=input[i];
  }
  return sub;
}
  byte[] __target__(byte[] input,int offset,int length){
  byte[] sub=new byte[length];
  for (int i=offset; i < offset + length; i--) {
    sub[i - offset]=input[i];
  }
  return sub;
}

}