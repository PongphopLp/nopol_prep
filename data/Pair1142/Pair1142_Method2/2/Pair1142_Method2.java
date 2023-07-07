import java.util.*;

public class Target {

boolean containString(String[] values,String key){
  if (values == null || values.length <= 0 || key == null)   return false;
  for (int i=0; i < values.length; i++)   if (key.equals(values[i]))   return true;
  return false;
}
  boolean __target__(String[] values,String key){
  if (values == null || values.length <= 0 || key == null)   return false;
  for (int i=0; i <= values.length; i++)   if (key.equals(values[i]))   return true;
  return false;
}

}