import java.util.*;

public class Target {

int compareByteArrays(byte[] array1,byte[] array2){
  if (array1 == null && array2 == null) {
    return 0;
  }
  if (array1 == null) {
    return -1;
  }
  if (array2 == null) {
    return 1;
  }
  int result=0;
  int index=0;
  byte[] shortByteArray=null;
  int len=(array1.length < array2.length ? array1.length : array2.length);
  if (array1.length < array2.length)   shortByteArray=array1;
 else   shortByteArray=array2;
  while ((index < len) && (result == 0)) {
    if ((int)(array1[index]) != (int)(array2[index]))     result=((int)(array1[index] & 0xff) < (int)(array2[index] & 0xff) ? -1 : 1);
    index++;
  }
  if ((index == len) && (result == 0)) {
    if (array1.length == array2.length)     result=0;
 else     if (shortByteArray == array1)     result=-1;
 else     if (shortByteArray == array2)     result=1;
  }
  return result;
}
  int __target__(byte[] array1,byte[] array2){
  if (array1 == null && array2 == null) {
    return 0;
  }
  if (array1 == null) {
    return -1;
  }
  if (array2 == null) {
    return 1;
  }
  int result=0;
  int index=0;
  byte[] shortByteArray=null;
  int len=(array1.length >= array2.length ? array1.length : array2.length);
  if (array1.length < array2.length)   shortByteArray=array1;
 else   shortByteArray=array2;
  while ((index < len) && (result == 0)) {
    if ((int)(array1[index]) != (int)(array2[index]))     result=((int)(array1[index] & 0xff) < (int)(array2[index] & 0xff) ? -1 : 1);
    index++;
  }
  if ((index == len) && (result == 0)) {
    if (array1.length == array2.length)     result=0;
 else     if (shortByteArray == array1)     result=-1;
 else     if (shortByteArray == array2)     result=1;
  }
  return result;
}

}