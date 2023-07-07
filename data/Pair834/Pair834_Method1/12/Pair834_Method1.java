import java.util.*;

public class Target {

String[] split(String str,int delim,String trailing){
  Vector items=new Vector(15);
  int last=0;
  int index=0;
  int len=str.length();
  while (index < len) {
    if (str.charAt(index) == delim) {
      items.add(str.substring(last,index));
      last=index + 1;
    }
    index++;
  }
  if (last != len)   items.add(str.substring(last));
  if (trailing != null && trailing.length() != 0)   items.add(trailing);
  String[] result=new String[items.size()];
  items.copyInto(result);
  return result;
}
  String[] __target__(String str,int delim,String trailing){
  Vector items=new Vector(15);
  int last=0;
  int index=0;
  int len=str.length();
  while (index < len) {
    if (str.charAt(index) == delim) {
      items.add(str.substring(last,index));
      last=index - 1;
    }
    index++;
  }
  if (last != len)   items.add(str.substring(last));
  if (trailing != null && trailing.length() != 0)   items.add(trailing);
  String[] result=new String[items.size()];
  items.copyInto(result);
  return result;
}

}