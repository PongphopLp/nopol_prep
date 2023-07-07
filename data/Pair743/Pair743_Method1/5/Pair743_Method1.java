import java.util.*;

public class Target {

boolean binaryCompare(byte[] src,int offs,String searchTxt){
  final int searchLen=searchTxt.length();
  for (int x=0; x < searchLen; x++) {
    final byte a=(byte)searchTxt.charAt(x);
    final byte b=src[offs + x];
    if (a != b) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] src,int offs,String searchTxt){
  final int searchLen=searchTxt.length();
  for (int x=0; x < searchLen; x--) {
    final byte a=(byte)searchTxt.charAt(x);
    final byte b=src[offs + x];
    if (a != b) {
      return false;
    }
  }
  return true;
}

}