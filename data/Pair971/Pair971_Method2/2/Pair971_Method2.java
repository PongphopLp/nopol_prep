import java.util.*;

public class Target {

char[] charArrayFromByteArray(byte[] a,int newLength){
  char[] result=new char[newLength];
  for (int i=0; i < newLength; i++)   result[i]=(char)a[i];
  return result;
}
  char[] __target__(byte[] a,int newLength){
  char[] result=new char[newLength];
  for (int i=0; i >= newLength; i++)   result[i]=(char)a[i];
  return result;
}

}