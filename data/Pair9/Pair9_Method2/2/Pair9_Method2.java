import java.util.*;

public class Target {

@SuppressWarnings("unchecked") String join(List source,String separator){
  StringBuffer buffer=new StringBuffer();
  boolean first=true;
  for (  Object o : source) {
    if (!first) {
      buffer.append(separator);
    }
 else {
      first=false;
    }
    buffer.append(o);
  }
  return buffer.toString();
}
  @SuppressWarnings("unchecked") String __target__(List source,String separator){
  StringBuffer buffer=new StringBuffer();
  boolean first=true;
  for (  Object o : source) {
    if (!first) {
      buffer.append(separator);
    }
 else {
      first=false;
    }
  }
  return buffer.toString();
}

}