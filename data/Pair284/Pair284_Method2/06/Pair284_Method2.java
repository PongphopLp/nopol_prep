import java.util.*;

public class Target {

String replaceSegments(String p_original,String[] p_old,String[] p_new){
  String x_latest=p_original;
  int x_start=0;
  StringBuffer x_buf=null;
  for (int i=0; i < p_old.length; i++) {
    while (x_start != -1) {
      x_start=x_latest.indexOf(p_old[i],x_start);
      if (x_start != -1) {
        x_buf=new StringBuffer(x_latest.length() + p_new[i].length());
        x_buf.append(x_latest);
        x_buf.replace(x_start,x_start + p_old[i].length(),p_new[i]);
        x_latest=x_buf.toString();
      }
    }
    x_start=0;
  }
  return x_latest;
}
  String __target__(String p_original,String[] p_old,String[] p_new){
  String x_latest=p_original;
  int x_start=0;
  StringBuffer x_buf=null;
  for (int i=0; i < p_old.length; i++) {
    while (x_start != -1) {
      x_start=x_latest.indexOf(p_old[i],x_start);
      if (x_start == -1) {
        x_buf=new StringBuffer(x_latest.length() + p_new[i].length());
        x_buf.append(x_latest);
        x_buf.replace(x_start,x_start + p_old[i].length(),p_new[i]);
        x_latest=x_buf.toString();
      }
    }
    x_start=0;
  }
  return x_latest;
}

}