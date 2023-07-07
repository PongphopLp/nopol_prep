import java.util.*;

public class Target {

String[] split(String source,String div){
  int arynum=0, intIdx=0, intIdex=0, div_length=div.length();
  if (source.compareTo("") != 0) {
    if (source.indexOf(div) != -1) {
      intIdx=source.indexOf(div);
      for (int intCount=1; ; intCount++) {
        if (source.indexOf(div,intIdx + div_length) != -1) {
          intIdx=source.indexOf(div,intIdx + div_length);
          arynum=intCount;
        }
 else {
          arynum+=2;
          break;
        }
      }
    }
 else {
      arynum=1;
    }
  }
 else {
    arynum=0;
  }
  intIdx=0;
  intIdex=0;
  String[] returnStr=new String[arynum];
  if (source.compareTo("") != 0) {
    if (source.indexOf(div) != -1) {
      intIdx=(int)source.indexOf(div);
      returnStr[0]=(String)source.substring(0,intIdx);
      for (int intCount=1; ; intCount++) {
        if (source.indexOf(div,intIdx + div_length) != -1) {
          intIdex=(int)source.indexOf(div,intIdx + div_length);
          returnStr[intCount]=(String)source.substring(intIdx + div_length,intIdex);
          intIdx=(int)source.indexOf(div,intIdx + div_length);
        }
 else {
          returnStr[intCount]=(String)source.substring(intIdx + div_length,source.length());
          break;
        }
      }
    }
 else {
      returnStr[0]=(String)source.substring(0,source.length());
      return returnStr;
    }
  }
 else {
    return returnStr;
  }
  return returnStr;
}
  String[] __target__(String source,String div){
  int arynum=0, intIdx=0, intIdex=0, div_length=div.length();
  if (source.compareTo("") != 0) {
    if (source.indexOf(div) != -1) {
      intIdx=source.indexOf(div);
      for (int intCount=1; ; intCount++) {
        if (source.indexOf(div,intIdx + div_length) != -1) {
          intIdx=source.indexOf(div,intIdx + div_length);
          arynum=intCount;
        }
 else {
          arynum+=2;
          break;
        }
      }
    }
 else {
      arynum=1;
    }
  }
 else {
    arynum=0;
  }
  intIdx=0;
  intIdex=0;
  String[] returnStr=new String[arynum];
  if (source.compareTo("") != 0) {
    if (source.indexOf(div) != -1) {
      intIdx=(int)source.indexOf(div);
      returnStr[0]=(String)source.substring(0,intIdx);
      for (int intCount=1; ; intCount++) {
        if (source.indexOf(div,intIdx + div_length) != -1) {
          intIdex=(int)source.indexOf(div,intIdx + div_length);
          returnStr[intCount]=(String)source.substring(intIdx + div_length,intIdex);
          intIdx=(int)source.indexOf(div,intIdx + div_length);
        }
 else {
          returnStr[intCount]=(String)source.substring(intIdx - div_length,source.length());
          break;
        }
      }
    }
 else {
      returnStr[0]=(String)source.substring(0,source.length());
      return returnStr;
    }
  }
 else {
    return returnStr;
  }
  return returnStr;
}

}