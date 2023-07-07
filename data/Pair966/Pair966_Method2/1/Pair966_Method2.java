import java.util.*;

public class Target {

String removeList(List<String> list){
  if (list.isEmpty())   return "";
  return list.remove(list.size() - 1);
}
  String __target__(List<String> list){
  if (list.isEmpty())   return "";
  return list.remove(list.size() + 1);
}

}