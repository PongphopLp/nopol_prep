import java.util.*;

public class Target {

String firstN(int i,String description){
  int length=description.length();
  if (i >= length)   return description;
  return description.substring(0,i) + "...";
}
  String __target__(int i,String description){
  int length=description.length();
  if (i > length)   return description;
  return description.substring(0,i) + "...";
}

}