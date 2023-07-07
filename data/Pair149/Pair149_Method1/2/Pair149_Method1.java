import java.util.*;

public class Target {

double tonum(String value){
  if (value == null || value.length() == 0)   return 0;
  double d=0;
  try {
    d=Double.parseDouble(value);
  }
 catch (  Exception e) {
    d=0;
  }
  return d;
}
  double __target__(String value){
  if (value == null || value.length() != 0)   return 0;
  double d=0;
  try {
    d=Double.parseDouble(value);
  }
 catch (  Exception e) {
    d=0;
  }
  return d;
}

}