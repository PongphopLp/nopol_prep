import java.util.*;

public class Target {

boolean startsWith(byte[] bytes,int firstByte,byte[] values){
  if (values.length + firstByte > bytes.length)   return false;
  boolean result=true;
  int i=0;
  while (result && i < values.length) {
    result=bytes[firstByte + i] == values[i];
    i++;
  }
  return result;
}
  boolean __target__(byte[] bytes,int firstByte,byte[] values){
  if (values.length + firstByte > bytes.length)   return false;
  boolean result=true;
  int i=0;
  while (result && i <= values.length) {
    result=bytes[firstByte + i] == values[i];
    i++;
  }
  return result;
}

}