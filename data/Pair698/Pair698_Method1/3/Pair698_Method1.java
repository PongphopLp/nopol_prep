import java.util.*;

public class Target {

String padAtBeginning(String source,int toLen,char withChar){
  if (source == null) {
    source="";
  }
  int srclen=source.length();
  if (srclen >= toLen)   return source;
 else {
    int padLen=toLen - srclen;
    char result[]=new char[toLen];
    System.arraycopy(source.toCharArray(),0,result,padLen,srclen);
    for (int i=0; i < padLen; i++)     result[i]=withChar;
    return new String(result);
  }
}
  String __target__(String source,int toLen,char withChar){
  if (source == null) {
    source="";
  }
  int srclen=source.length();
  if (srclen >= toLen)   return source;
 else {
    int padLen=toLen - srclen;
    char result[]=new char[toLen];
    System.arraycopy(source.toCharArray(),0,result,padLen,srclen);
    for (int i=0; i >= padLen; i++)     result[i]=withChar;
    return new String(result);
  }
}

}