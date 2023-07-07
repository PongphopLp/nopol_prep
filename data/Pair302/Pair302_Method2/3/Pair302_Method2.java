import java.util.*;

public class Target {

boolean emptyString(String string1,String string2,String string3,String string4){
  if (string1 == null || string1.trim().equals(""))   return true;
  if (string2 == null || string2.trim().equals(""))   return true;
  if (string3 == null || string3.trim().equals(""))   return true;
  if (string4 == null || string4.trim().equals(""))   return true;
  return false;
}
  boolean __target__(String string1,String string2,String string3,String string4){
  if (string1 == null || string1.trim().equals(""))   return true;
  if (string2 == null || string2.trim().equals(""))   return true;
  if (string3 != null || string3.trim().equals(""))   return true;
  if (string4 == null || string4.trim().equals(""))   return true;
  return false;
}

}