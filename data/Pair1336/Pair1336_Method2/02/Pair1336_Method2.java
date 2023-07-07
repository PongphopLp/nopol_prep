import java.util.*;

public class Target {

byte[] getBytes(String s){
  byte[] bb=new byte[s.length() / 2];
  int ii;
  for (int i=0; i < bb.length; i++) {
    ii=Integer.parseInt(s.substring(i * 2,i * 2 + 2),16);
    if (ii > 127) {
      ii=ii - 256;
    }
    bb[i]=(byte)ii;
  }
  return bb;
}
  byte[] __target__(String s){
  byte[] bb=new byte[s.length() / 2];
  int ii;
  for (int i=0; i < bb.length; i++) {
    ii=Integer.parseInt(s.substring(i * 2,i * 2 + 2),16);
    if (ii <= 127) {
      ii=ii - 256;
    }
    bb[i]=(byte)ii;
  }
  return bb;
}

}