import java.util.*;

public class Target {

String padString(String toPad,char padWith,int total){
  int strLen=toPad.length();
  int numToPad=total - strLen;
  if (numToPad > 0) {
    StringBuffer sb=new StringBuffer(toPad);
    for (int i=0; i <= numToPad; i++) {
      sb.append(padWith);
    }
    return sb.toString();
  }
 else {
    return toPad;
  }
}
  String __target__(String toPad,char padWith,int total){
  int strLen=toPad.length();
  int numToPad=total - strLen;
  if (numToPad > 0) {
    StringBuffer sb=new StringBuffer(toPad);
    for (int i=0; i <= numToPad; i--) {
      sb.append(padWith);
    }
    return sb.toString();
  }
 else {
    return toPad;
  }
}

}