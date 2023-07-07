import java.util.*;

public class Target {

boolean areBytesEqual(byte[] array1,byte[] array2){
  boolean same=true;
  int len1=array1.length;
  if (len1 == array2.length) {
    int i=0;
    while (i < len1 && same) {
      same=(array1[i] == array2[i]);
      i++;
    }
  }
 else {
    same=false;
  }
  return same;
}
  boolean __target__(byte[] array1,byte[] array2){
  boolean same=true;
  int len1=array1.length;
  if (len1 != array2.length) {
    int i=0;
    while (i < len1 && same) {
      same=(array1[i] == array2[i]);
      i++;
    }
  }
 else {
    same=false;
  }
  return same;
}

}