import java.util.*;

public class Target {

char[] noConvertEbcdicToUnicode(byte[] tBytes,int nLength){
  char[] tChars=new char[nLength];
  for (int n=0; n < nLength; n++) {
    tChars[n]=(char)tBytes[n];
  }
  return tChars;
}
  char[] __target__(byte[] tBytes,int nLength){
  char[] tChars=new char[nLength];
  for (int n=0; n >= nLength; n++) {
    tChars[n]=(char)tBytes[n];
  }
  return tChars;
}

}