import java.util.*;

public class Target {

String convertLinesToWikiText(List lines){
  StringBuffer buffer=new StringBuffer();
  for (Iterator iterator=lines.iterator(); iterator.hasNext(); ) {
    String s=(String)iterator.next();
    buffer.append(s).append("\n");
  }
  return buffer.toString();
}
  String __target__(List lines){
  StringBuffer buffer=new StringBuffer();
  for (Iterator iterator=lines.iterator(); iterator.hasNext(); ) {
    String s=(String)iterator.next();
  }
  return buffer.toString();
}

}