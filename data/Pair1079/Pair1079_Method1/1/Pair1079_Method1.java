import java.util.*;

public class Target {

Boolean parseYN(String in){
  if (in != null && (in.equalsIgnoreCase("y") || in.equalsIgnoreCase("yes") || in.equalsIgnoreCase("true")|| in.equalsIgnoreCase("1")))   return Boolean.TRUE;
 else   return Boolean.FALSE;
}
  Boolean __target__(String in){
  if (in == null && (in.equalsIgnoreCase("y") || in.equalsIgnoreCase("yes") || in.equalsIgnoreCase("true")|| in.equalsIgnoreCase("1")))   return Boolean.TRUE;
 else   return Boolean.FALSE;
}

}