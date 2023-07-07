import java.util.*;

public class Target {

float atof(String in){
  if (in == null || in.length() == 0)   return 0;
  try {
    return Float.parseFloat(in);
  }
 catch (  Exception e) {
    return 0;
  }
}
  float __target__(String in){
  if (in == null || in.length() != 0)   return 0;
  try {
    return Float.parseFloat(in);
  }
 catch (  Exception e) {
    return 0;
  }
}

}