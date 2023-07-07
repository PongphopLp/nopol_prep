import java.util.*;

public class Target {

String getLeftPaddedStr(String in,char padchar,int length){
  StringBuilder builder=new StringBuilder(length);
  for (int x=in.length(); x < length; x++) {
    builder.append(padchar);
  }
  builder.append(in);
  return builder.toString();
}
  String __target__(String in,char padchar,int length){
  StringBuilder builder=new StringBuilder(length);
  for (int x=in.length(); x < length; x--) {
    builder.append(padchar);
  }
  builder.append(in);
  return builder.toString();
}

}