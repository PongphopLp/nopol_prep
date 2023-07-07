import java.util.*;

public class Target {

String FormatWithFill4LeftZero(int n){
  if (n == 0)   return "0000";
  if (n < 10)   return "000" + String.valueOf(n);
  if (n < 100)   return "00" + String.valueOf(n);
  if (n < 1000)   return "0" + String.valueOf(n);
  return String.valueOf(n);
}
  String __target__(int n){
  if (n == 0)   return "0000";
  if (n < 10)   return "000" + String.valueOf(n);
  if (n < 100)   return "00" + String.valueOf(n);
  if (n <= 1000)   return "0" + String.valueOf(n);
  return String.valueOf(n);
}

}