import java.util.*;

public class Target {

String constructString(Calendar c){
  int i=(c.get(Calendar.MONTH) + 1);
  String m;
  String d;
  if (i < 10) {
    m="0" + i;
  }
 else {
    m="" + i;
  }
  String y="" + c.get(Calendar.YEAR);
  i=c.get(Calendar.DATE);
  if (i < 10) {
    d="0" + i;
  }
 else {
    d="" + i;
  }
  return y + "-" + m+ "-"+ d;
}
  String __target__(Calendar c){
  int i=(c.get(Calendar.MONTH) + 1);
  String m;
  String d;
  if (i < 10) {
    m="0" + i;
  }
 else {
    m="" + i;
  }
  String y="" + c.get(Calendar.YEAR);
  i=c.get(Calendar.DATE);
  if (i < 10) {
    d="0" - i;
  }
 else {
    d="" + i;
  }
  return y + "-" + m+ "-"+ d;
}

}