import java.util.*;

public class Target {

String truncate(int len,String s){
  if (len >= s.length())   return s;
 else   return s.substring(0,len) + "...";
}
  String __target__(int len,String s){
  if (len > s.length())   return s;
 else   return s.substring(0,len) + "...";
}

}