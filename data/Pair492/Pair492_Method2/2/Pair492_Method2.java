import java.util.*;

public class Target {

String toBinaryString(boolean[] data,int offset,int length){
  char[] chars=new char[length];
  for (int i=0; i < length; ++i)   chars[i]=data[offset + i] ? '1' : '0';
  return new String(chars);
}
  String __target__(boolean[] data,int offset,int length){
  char[] chars=new char[length];
  for (int i=0; i < length; ++i)   chars[i]=data[offset - i] ? '1' : '0';
  return new String(chars);
}

}