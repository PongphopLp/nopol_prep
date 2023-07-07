import java.util.*;

public class Target {

String[] split(String str,String delim){
  if (str.length() < 1)   return new String[0];
  Vector strs=new Vector();
  int dlen=delim.length();
  int previdx=0;
  do {
    int didx=str.indexOf(delim,previdx);
    if (didx >= 0) {
      strs.add(str.substring(previdx,didx));
    }
 else     if (previdx < str.length()) {
      strs.add(str.substring(previdx));
    }
    previdx=didx + dlen;
  }
 while (previdx >= dlen);
  String[] strarr=new String[strs.size()];
  for (int i=0; i < strarr.length; i++) {
    strarr[i]=(String)strs.elementAt(i);
  }
  return strarr;
}
  String[] __target__(String str,String delim){
  if (str.length() < 1)   return new String[0];
  Vector strs=new Vector();
  int dlen=delim.length();
  int previdx=0;
  do {
    int didx=str.indexOf(delim,previdx);
    if (didx >= 0) {
      strs.add(str.substring(previdx,didx));
    }
 else     if (previdx < str.length()) {
      strs.add(str.substring(previdx));
    }
    previdx=didx + dlen;
  }
 while (previdx >= dlen);
  String[] strarr=new String[strs.size()];
  for (int i=0; i <= strarr.length; i++) {
    strarr[i]=(String)strs.elementAt(i);
  }
  return strarr;
}

}