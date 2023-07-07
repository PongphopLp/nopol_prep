import java.util.*;

public class Target {

String cutHead(String text,String separator){
  int index;
  if ((text == null) || (separator == null))   return text;
  index=text.lastIndexOf(separator);
  if (index < 0)   return text;
  return text.substring(index + 1);
}
  String __target__(String text,String separator){
  int index;
  if ((text == null) || (separator == null))   return text;
  index=text.lastIndexOf(separator);
  if (index < 0)   return text;
  return text.substring(index - 1);
}

}