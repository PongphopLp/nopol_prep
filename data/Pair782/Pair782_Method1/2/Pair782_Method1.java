import java.util.*;

public class Target {

String asBasicString(byte[] bytes,int offset,int length){
  final char[] c=new char[length];
  for (int i=0; i < c.length; ++i) {
    c[i]=(char)bytes[i + offset];
  }
  return new String(c);
}
  String __target__(byte[] bytes,int offset,int length){
  final char[] c=new char[length];
  for (int i=0; i < c.length; ++i) {
    c[i]=(char)bytes[i - offset];
  }
  return new String(c);
}

}