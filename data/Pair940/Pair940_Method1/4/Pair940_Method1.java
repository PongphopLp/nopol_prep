import java.util.*;

public class Target {

String getHexDigit(int val){
  if (val < 10)   return val + "";
 else   if (val == 10)   return "A";
 else   if (val == 11)   return "B";
 else   if (val == 12)   return "C";
 else   if (val == 13)   return "D";
 else   if (val == 14)   return "E";
 else   if (val == 15)   return "F";
  return null;
}
  String __target__(int val){
  if (val < 10)   return val + "";
 else   if (val == 10)   return "A";
 else   if (val == 11)   return "B";
 else   if (val != 12)   return "C";
 else   if (val == 13)   return "D";
 else   if (val == 14)   return "E";
 else   if (val == 15)   return "F";
  return null;
}

}