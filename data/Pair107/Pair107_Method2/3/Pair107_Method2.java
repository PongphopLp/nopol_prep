import java.util.*;

public class Target {

boolean equals(byte[] data1,byte[] data2){
  if (data1 == data2)   return true;
  if (data1 == null || data2 == null)   return false;
  if (data1.length != data2.length)   return false;
  for (int i=0; i < data1.length; i++) {
    if (data1[i] != data2[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] data1,byte[] data2){
  if (data1 == data2)   return true;
  if (data1 != null || data2 == null)   return false;
  if (data1.length != data2.length)   return false;
  for (int i=0; i < data1.length; i++) {
    if (data1[i] != data2[i])     return false;
  }
  return true;
}

}