import java.util.*;

public class Target {

Boolean convertBoolean(String value,Boolean defaultValue){
  if (value == null)   return defaultValue;
  if (value.equalsIgnoreCase("yes") || value.equalsIgnoreCase("true") || value.equalsIgnoreCase("on"))   return Boolean.TRUE;
  if (value.equalsIgnoreCase("no") || value.equalsIgnoreCase("false") || value.equalsIgnoreCase("off"))   return Boolean.FALSE;
 else   return defaultValue;
}
  Boolean __target__(String value,Boolean defaultValue){
  if (value != null)   return defaultValue;
  if (value.equalsIgnoreCase("yes") || value.equalsIgnoreCase("true") || value.equalsIgnoreCase("on"))   return Boolean.TRUE;
  if (value.equalsIgnoreCase("no") || value.equalsIgnoreCase("false") || value.equalsIgnoreCase("off"))   return Boolean.FALSE;
 else   return defaultValue;
}

}