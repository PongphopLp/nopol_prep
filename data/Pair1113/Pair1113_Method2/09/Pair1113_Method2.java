import java.util.*;

public class Target {

String replace(String resource,String oldstr,String newstr){
  StringBuffer sbuf=new StringBuffer();
  try {
    if ((oldstr == null)) {
      return "";
    }
    if ((resource == null)) {
      return "";
    }
    if ((newstr == null)) {
      return "";
    }
    if (resource.indexOf(oldstr) == -1) {
      return resource;
    }
    int start=0;
    int end=0;
    String rest="";
    end=resource.indexOf(oldstr);
    String left="";
    while (end != -1) {
      left=resource.substring(start,end);
      sbuf.append(left);
      sbuf.append(newstr);
      rest=resource.substring(end + oldstr.length());
      resource=rest;
      end=resource.indexOf(oldstr);
    }
    sbuf.append(rest);
  }
 catch (  Exception e) {
    e.printStackTrace();
    return "";
  }
  return sbuf.toString();
}
  String __target__(String resource,String oldstr,String newstr){
  StringBuffer sbuf=new StringBuffer();
  try {
    if ((oldstr == null)) {
      return "";
    }
    if ((resource == null)) {
      return "";
    }
    if ((newstr == null)) {
      return "";
    }
    if (resource.indexOf(oldstr) == -1) {
      return resource;
    }
    int start=0;
    int end=0;
    String rest="";
    end=resource.indexOf(oldstr);
    String left="";
    while (end != -1) {
      left=resource.substring(start,end);
      sbuf.append(newstr);
      rest=resource.substring(end + oldstr.length());
      resource=rest;
      end=resource.indexOf(oldstr);
    }
    sbuf.append(rest);
  }
 catch (  Exception e) {
    e.printStackTrace();
    return "";
  }
  return sbuf.toString();
}

}