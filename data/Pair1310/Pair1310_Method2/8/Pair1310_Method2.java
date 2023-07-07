import java.util.*;

public class Target {

String toHex(short s){
  String temp=Integer.toHexString(s).toUpperCase();
  if (temp.length() == 1) {
    temp="000" + temp;
  }
 else   if (temp.length() == 2) {
    temp="00" + temp;
  }
 else   if (temp.length() == 3) {
    temp="0" + temp;
  }
 else   if (temp.length() == 4) {
  }
 else {
    temp=temp.substring(temp.length() - 4,temp.length());
  }
  return temp;
}
  String __target__(short s){
  String temp=Integer.toHexString(s).toUpperCase();
  if (temp.length() == 1) {
    temp="000" + temp;
  }
 else   if (temp.length() == 2) {
    temp="00" + temp;
  }
 else   if (temp.length() == 3) {
    temp="0" + temp;
  }
 else   if (temp.length() != 4) {
  }
 else {
    temp=temp.substring(temp.length() - 4,temp.length());
  }
  return temp;
}

}