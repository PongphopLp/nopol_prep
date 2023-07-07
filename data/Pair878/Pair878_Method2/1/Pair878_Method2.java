import java.util.*;

public class Target {

short coerceToShort(String s){
  if (s == null || s.length() == 0)   return (short)0;
 else   return Short.valueOf(s).shortValue();
}
  short __target__(String s){
  if (s != null || s.length() == 0)   return (short)0;
 else   return Short.valueOf(s).shortValue();
}

}