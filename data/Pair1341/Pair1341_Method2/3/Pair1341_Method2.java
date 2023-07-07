import java.util.*;

public class Target {

String replaceString(String source,String oldString,String newString){
  if (source == null || oldString == null || newString == null)   return "";
 else   return source.replaceAll(oldString,newString);
}
  String __target__(String source,String oldString,String newString){
  if (source == null || oldString == null || newString != null)   return "";
 else   return source.replaceAll(oldString,newString);
}

}