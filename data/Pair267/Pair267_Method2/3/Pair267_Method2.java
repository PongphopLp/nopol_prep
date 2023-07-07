import java.util.*;

public class Target {

String[] concatenate(String[] first,String[] second){
  if (first == null || first.length == 0) {
    return second;
  }
  if (second == null || second.length == 0) {
    return first;
  }
  String[] result=new String[first.length + second.length];
  System.arraycopy(first,0,result,0,first.length);
  System.arraycopy(second,0,result,first.length,second.length);
  return result;
}
  String[] __target__(String[] first,String[] second){
  if (first == null || first.length == 0) {
    return second;
  }
  if (second == null || second.length == 0) {
    return first;
  }
  String[] result=new String[first.length + second.length];
  System.arraycopy(first,0,result,0,first.length);
  return result;
}

}