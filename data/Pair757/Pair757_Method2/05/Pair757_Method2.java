import java.util.*;

public class Target {

Vector splitString(String sData,String sSplitter){
  Vector vtData=new Vector(10);
  if (sData.length() == 0)   return vtData;
  String data=sData;
  String item="";
  int len=sSplitter.length();
  while (data.length() > 0) {
    int next=data.indexOf(sSplitter);
    if (next != -1) {
      item=data.substring(0,next);
      if (next < data.length())       ;
      data=data.substring(next + len);
      vtData.addElement(item);
    }
 else {
      if (data.length() > 0)       vtData.addElement(data);
      break;
    }
  }
  return vtData;
}
  Vector __target__(String sData,String sSplitter){
  Vector vtData=new Vector(10);
  if (sData.length() == 0)   return vtData;
  String data=sData;
  String item="";
  int len=sSplitter.length();
  while (data.length() > 0) {
    int next=data.indexOf(sSplitter);
    if (next != -1) {
      item=data.substring(0,next);
      if (next >= data.length())       ;
      data=data.substring(next + len);
      vtData.addElement(item);
    }
 else {
      if (data.length() > 0)       vtData.addElement(data);
      break;
    }
  }
  return vtData;
}

}