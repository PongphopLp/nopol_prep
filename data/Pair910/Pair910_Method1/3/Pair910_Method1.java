import java.util.*;

public class Target {

byte[] copyBytes(byte[] arr,int length){
  byte[] newArr=null;
  if (arr.length == length) {
    newArr=arr;
  }
 else {
    newArr=new byte[length];
    for (int i=0; i < length; i++) {
      newArr[i]=(byte)arr[i];
    }
  }
  return newArr;
}
  byte[] __target__(byte[] arr,int length){
  byte[] newArr=null;
  if (arr.length != length) {
    newArr=arr;
  }
 else {
    newArr=new byte[length];
    for (int i=0; i < length; i++) {
      newArr[i]=(byte)arr[i];
    }
  }
  return newArr;
}

}