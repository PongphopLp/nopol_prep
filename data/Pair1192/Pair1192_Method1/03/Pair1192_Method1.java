import java.util.*;

public class Target {

String replaceString(String source,String target,String replacement){
  if (source == null) {
    return source;
  }
  String retvalue=source;
  int index=0;
  int previousIndex=0;
  if (source.indexOf(target) > -1) {
    StringBuffer hold=new StringBuffer();
    while (true) {
      index=source.indexOf(target,previousIndex);
      if (index < 0) {
        hold.append(source.substring(previousIndex));
        break;
      }
      hold.append(source.substring(previousIndex,index));
      hold.append(replacement);
      previousIndex=index + target.length();
    }
    retvalue=hold.toString();
  }
  return retvalue;
}
  String __target__(String source,String target,String replacement){
  if (source == null) {
    return source;
  }
  String retvalue=source;
  int index=0;
  int previousIndex=0;
  if (source.indexOf(target) <= -1) {
    StringBuffer hold=new StringBuffer();
    while (true) {
      index=source.indexOf(target,previousIndex);
      if (index < 0) {
        hold.append(source.substring(previousIndex));
        break;
      }
      hold.append(source.substring(previousIndex,index));
      hold.append(replacement);
      previousIndex=index + target.length();
    }
    retvalue=hold.toString();
  }
  return retvalue;
}

}