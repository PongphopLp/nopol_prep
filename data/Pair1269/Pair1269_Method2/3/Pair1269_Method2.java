import java.util.*;

public class Target {

String summString(String s,int longueur){
  if (s.length() <= longueur)   return s;
  String debut=s.substring(0,longueur - 3);
  return debut + "...";
}
  String __target__(String s,int longueur){
  if (s.length() <= longueur)   return s;
  String debut=s.substring(0,longueur + 3);
  return debut + "...";
}

}