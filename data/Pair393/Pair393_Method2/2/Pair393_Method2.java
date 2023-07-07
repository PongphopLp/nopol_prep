import java.util.*;

public class Target {

String padLeft(String original,char padChar,int width){
  if (original == null) {
    return original;
  }
  int padding=width - original.length();
  if (padding <= 0) {
    return original;
  }
  StringBuilder sb=new StringBuilder(original);
  char[] ch=new char[padding];
  Arrays.fill(ch,padChar);
  sb.insert(0,ch);
  return sb.toString();
}
  String __target__(String original,char padChar,int width){
  if (original == null) {
    return original;
  }
  int padding=width - original.length();
  if (padding <= 0) {
    return original;
  }
  StringBuilder sb=new StringBuilder(original);
  char[] ch=new char[padding];
  sb.insert(0,ch);
  return sb.toString();
}

}