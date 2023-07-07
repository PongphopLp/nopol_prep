import java.util.*;

public class Target {

boolean inRange(String range,Integer val){
  String boundries[]=range.split("-");
  if (val < new Integer(boundries[0]) || val > new Integer(boundries[1]))   return false;
 else   return true;
}
  boolean __target__(String range,Integer val){
  String boundries[]=range.split("-");
  if (val < new Integer(boundries[0]) || val >= new Integer(boundries[1]))   return false;
 else   return true;
}

}