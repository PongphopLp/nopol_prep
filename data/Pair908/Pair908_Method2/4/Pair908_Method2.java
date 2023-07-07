import java.util.*;

public class Target {

byte[] shrink(byte[] data,int r){
  if (data != null && r < data.length) {
    byte[] b=new byte[r];
    System.arraycopy(data,0,b,0,r);
    return b;
  }
  return data;
}
  byte[] __target__(byte[] data,int r){
  if (data != null && r < data.length) {
    byte[] b=new byte[r];
    return b;
  }
  return data;
}

}