import java.util.*;

public class Target {

boolean compareBytes(byte[] buffer,int offset,String str){
  for (int i=0; i < str.length(); i++) {
    if (((byte)(str.charAt(i))) != buffer[i + offset]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] buffer,int offset,String str){
  for (int i=0; i <= str.length(); i++) {
    if (((byte)(str.charAt(i))) != buffer[i + offset]) {
      return false;
    }
  }
  return true;
}

}