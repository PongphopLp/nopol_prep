import java.util.*;

public class Target {

String searchAndReplace(String orig,String lookFor,String replaceWith){
  int idx=orig.indexOf(lookFor);
  if (idx < 0) {
    return (orig);
  }
  int prev=0;
  StringBuffer rtn=new StringBuffer();
  while (idx >= 0) {
    rtn.append(orig.substring(prev,idx));
    rtn.append(replaceWith);
    prev=idx + lookFor.length();
    idx=orig.indexOf(lookFor,prev);
  }
  rtn.append(orig.substring(prev,orig.length()));
  return (rtn.toString());
}
  String __target__(String orig,String lookFor,String replaceWith){
  int idx=orig.indexOf(lookFor);
  if (idx < 0) {
    return (orig);
  }
  int prev=0;
  StringBuffer rtn=new StringBuffer();
  while (idx < 0) {
    rtn.append(orig.substring(prev,idx));
    rtn.append(replaceWith);
    prev=idx + lookFor.length();
    idx=orig.indexOf(lookFor,prev);
  }
  rtn.append(orig.substring(prev,orig.length()));
  return (rtn.toString());
}

}