import java.util.*;

public class Target {

String cutString(int length,String content){
  if (content.length() > length)   return content.substring(0,length);
  return content;
}
  String __target__(int length,String content){
  if (content.length() <= length)   return content.substring(0,length);
  return content;
}

}