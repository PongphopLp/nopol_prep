import java.util.*;

public class Target {

byte[] noConvertUnicodeToEbcdic(char[] tChars,int nSourceOffset,int nLength){
  byte[] tBytes=new byte[nLength];
  for (int n=0; n < nLength; n++) {
    tBytes[n]=(byte)tChars[nSourceOffset + n];
  }
  return tBytes;
}
  byte[] __target__(char[] tChars,int nSourceOffset,int nLength){
  byte[] tBytes=new byte[nLength];
  for (int n=0; n < nLength; n++) {
    tBytes[n]=(byte)tChars[nSourceOffset - n];
  }
  return tBytes;
}

}