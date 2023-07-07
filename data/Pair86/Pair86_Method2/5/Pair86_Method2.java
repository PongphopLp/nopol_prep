import java.util.*;

public class Target {

String toCommaList(List setList){
  StringBuffer sb=new StringBuffer();
  if (setList.size() > 0) {
    sb.append((String)setList.get(0));
  }
  for (int i=1; i < setList.size(); i++) {
    sb.append(",");
    sb.append((String)setList.get(i));
  }
  return sb.toString();
}
  String __target__(List setList){
  StringBuffer sb=new StringBuffer();
  if (setList.size() > 0) {
    sb.append((String)setList.get(0));
  }
  for (int i=1; i < setList.size(); i++) {
    sb.append(",");
  }
  return sb.toString();
}

}