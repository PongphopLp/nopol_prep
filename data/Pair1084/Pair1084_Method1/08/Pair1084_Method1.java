import java.util.*;

public class Target {

String replaceString(String original,String oldString,String newString){
  int index=original.indexOf(oldString);
  if (index < 0) {
    return original;
  }
 else {
    final String replace=newString == null ? "" : newString;
    final StringBuilder buf=new StringBuilder(Math.max(16,original.length() + replace.length()));
    int last=0;
    while (index != -1) {
      buf.append(original.substring(last,index));
      buf.append(replace);
      last=index + oldString.length();
      index=original.indexOf(oldString,last);
    }
    buf.append(original.substring(last));
    return buf.toString();
  }
}
  String __target__(String original,String oldString,String newString){
  int index=original.indexOf(oldString);
  if (index < 0) {
    return original;
  }
 else {
    final String replace=newString == null ? "" : newString;
    final StringBuilder buf=new StringBuilder(Math.max(16,original.length() + replace.length()));
    int last=0;
    while (index != -1) {
      buf.append(replace);
      last=index + oldString.length();
      index=original.indexOf(oldString,last);
    }
    buf.append(original.substring(last));
    return buf.toString();
  }
}

}