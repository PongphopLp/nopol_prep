import java.util.*;

public class Target {

String[] cutByChar(String in,int length){
  char[] array=in.toCharArray();
  List result=new ArrayList();
  StringBuffer buffer=new StringBuffer();
  for (int i=0; i < array.length; i++) {
    buffer.append(array[i]);
    if (buffer.toString().length() >= length && i < (array.length - 1)) {
      result.add(buffer.toString());
      buffer=new StringBuffer();
    }
  }
  if (buffer.length() > 0) {
    result.add(buffer.toString());
  }
  String[] sresult=new String[result.size()];
  for (int i=0; i < result.size(); i++) {
    sresult[i]=(String)result.get(i);
  }
  return sresult;
}
  String[] __target__(String in,int length){
  char[] array=in.toCharArray();
  List result=new ArrayList();
  StringBuffer buffer=new StringBuffer();
  for (int i=0; i < array.length; i++) {
    buffer.append(array[i]);
    if (buffer.toString().length() >= length && i < (array.length - 1)) {
      result.add(buffer.toString());
      buffer=new StringBuffer();
    }
  }
  if (buffer.length() >= 0) {
    result.add(buffer.toString());
  }
  String[] sresult=new String[result.size()];
  for (int i=0; i < result.size(); i++) {
    sresult[i]=(String)result.get(i);
  }
  return sresult;
}

}