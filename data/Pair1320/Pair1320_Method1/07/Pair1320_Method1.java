import java.util.*;

public class Target {

String[] cutByChar(String in,int length){
  final char array[]=in.toCharArray();
  final List result=new ArrayList();
  StringBuilder buffer=new StringBuilder();
  for (int i=0; i < array.length; i++) {
    buffer.append(array[i]);
    if ((buffer.toString().length() >= length) && (i < (array.length - 1))) {
      result.add(buffer.toString());
      buffer=new StringBuilder();
    }
  }
  if (buffer.length() > 0) {
    result.add(buffer.toString());
  }
  final String sresult[]=new String[result.size()];
  for (int i=0; i < result.size(); i++) {
    sresult[i]=(String)result.get(i);
  }
  return sresult;
}
  String[] __target__(String in,int length){
  final char array[]=in.toCharArray();
  final List result=new ArrayList();
  StringBuilder buffer=new StringBuilder();
  for (int i=0; i < array.length; i++) {
    if ((buffer.toString().length() >= length) && (i < (array.length - 1))) {
      result.add(buffer.toString());
      buffer=new StringBuilder();
    }
  }
  if (buffer.length() > 0) {
    result.add(buffer.toString());
  }
  final String sresult[]=new String[result.size()];
  for (int i=0; i < result.size(); i++) {
    sresult[i]=(String)result.get(i);
  }
  return sresult;
}

}