import java.util.*;

public class Target {

String toString(byte[] ucsbytes){
  char[] c=new char[ucsbytes.length / 2];
  for (int i=0; i < ucsbytes.length; i+=2) {
    c[i / 2]=(char)((ucsbytes[i] << 8) + (ucsbytes[i + 1] & 0xFF));
  }
  return new String(c);
}
  String __target__(byte[] ucsbytes){
  char[] c=new char[ucsbytes.length / 2];
  for (int i=0; i < ucsbytes.length; i+=2) {
    c[i * 2]=(char)((ucsbytes[i] << 8) + (ucsbytes[i + 1] & 0xFF));
  }
  return new String(c);
}

}