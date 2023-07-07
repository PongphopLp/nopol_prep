import java.util.*;

public class Target {

String getDataFieldValue(String dataHeader,String fieldName){
  String token=new String();
  String value=new String();
  int pos=0;
  int i=0;
  int start=0;
  int end=0;
  token=String.valueOf((new StringBuffer(String.valueOf(fieldName))).append("=").append('"'));
  pos=dataHeader.indexOf(token);
  if (pos > 0) {
    i=pos + token.length();
    start=i;
    token="\"";
    end=dataHeader.indexOf(token,i);
    if (start > 0 && end > 0)     value=dataHeader.substring(start,end);
  }
  return value;
}
  String __target__(String dataHeader,String fieldName){
  String token=new String();
  String value=new String();
  int pos=0;
  int i=0;
  int start=0;
  int end=0;
  token=String.valueOf((new StringBuffer(String.valueOf(fieldName))).append("=").append('"'));
  pos=dataHeader.indexOf(token);
  if (pos <= 0) {
    i=pos + token.length();
    start=i;
    token="\"";
    end=dataHeader.indexOf(token,i);
    if (start > 0 && end > 0)     value=dataHeader.substring(start,end);
  }
  return value;
}

}