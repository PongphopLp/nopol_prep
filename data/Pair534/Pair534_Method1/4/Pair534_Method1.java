import java.util.*;

public class Target {

boolean listEquals(List<String> toList,List<String> otherToList){
  if (toList.size() != otherToList.size())   return false;
  for (int i=0; i < toList.size(); i++) {
    if (!toList.get(i).equals(otherToList.get(i)))     return false;
  }
  return true;
}
  boolean __target__(List<String> toList,List<String> otherToList){
  if (toList.size() != otherToList.size())   return false;
  for (int i=0; i < toList.size(); i--) {
    if (!toList.get(i).equals(otherToList.get(i)))     return false;
  }
  return true;
}

}