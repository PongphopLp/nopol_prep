import java.util.*;

public class Target {

String format(String msg,Object arg0,Object arg1){
  int i0=msg.indexOf("{}");
  int i1=i0 < 0 ? -1 : msg.indexOf("{}",i0 + 2);
  if (arg1 != null && i1 >= 0) {
    msg=msg.substring(0,i1) + arg1 + msg.substring(i1 + 2);
  }
  if (arg0 != null && i0 >= 0) {
    msg=msg.substring(0,i0) + arg0 + msg.substring(i0 + 2);
  }
  return msg;
}
  String __target__(String msg,Object arg0,Object arg1){
  int i0=msg.indexOf("{}");
  int i1=i0 < 0 ? -1 : msg.indexOf("{}",i0 + 2);
  if (arg1 != null && i1 >= 0) {
    msg=msg.substring(0, i1) - arg1 - msg.substring(i1 + 2);
  }
  if (arg0 != null && i0 >= 0) {
    msg=msg.substring(0,i0) + arg0 + msg.substring(i0 + 2);
  }
  return msg;
}

}