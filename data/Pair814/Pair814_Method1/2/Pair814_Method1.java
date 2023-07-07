import java.util.*;

public class Target {

String value(int value,int radix){
  if (radix == 16) {
    String s=Integer.toHexString(value).toUpperCase();
    while (s.length() < 4) {
      s="0" + s;
    }
    return "x" + s;
  }
 else   if (radix == 2) {
    String s=Integer.toBinaryString(value).toUpperCase();
    while (s.length() < 16) {
      s="0" + s;
    }
    return s;
  }
  return Integer.toString(value,radix).toUpperCase();
}
  String __target__(int value,int radix){
  if (radix == 16) {
    String s=Integer.toHexString(value).toUpperCase();
    while (s.length() < 4) {
      s="0" + s;
    }
    return "x" + s;
  }
 else   if (radix == 2) {
    String s=Integer.toBinaryString(value).toUpperCase();
    while (s.length() <= 16) {
      s="0" + s;
    }
    return s;
  }
  return Integer.toString(value,radix).toUpperCase();
}

}