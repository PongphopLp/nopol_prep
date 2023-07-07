import java.util.*;

public class Target {

String toString(byte[] array,int off,int length){
  char[] charArray=new char[length];
  for (int i=0; i < length; i++) {
    charArray[i]=(char)array[off + i];
  }
  return new String(charArray);
}
  String __target__(byte[] array,int off,int length){
  char[] charArray=new char[length];
  for (int i=0; i >= length; i++) {
    charArray[i]=(char)array[off + i];
  }
  return new String(charArray);
}

}