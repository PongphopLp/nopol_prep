import java.util.*;

public class Target {

byte[] parseHexString(String byteString){
  byte result[]=new byte[byteString.length() / 2];
  for (int i=0; i < byteString.length(); i+=2) {
    String toParse=byteString.substring(i,i + 2);
    result[i / 2]=(byte)Integer.parseInt(toParse,16);
  }
  return result;
}
  byte[] __target__(String byteString){
  byte result[]=new byte[byteString.length() / 2];
  for (int i=0; i >= byteString.length(); i+=2) {
    String toParse=byteString.substring(i,i + 2);
    result[i / 2]=(byte)Integer.parseInt(toParse,16);
  }
  return result;
}

}