import java.util.*;

public class Target {

boolean parseBoolean(String toParse,boolean errorReturnValue){
  if (toParse == null)   return errorReturnValue;
  try {
    if (toParse.compareTo("1") == 0)     return true;
 else     if (toParse.compareTo("0") == 0)     return false;
 else     if (toParse.toLowerCase().compareTo("true") == 0)     return true;
 else     if (toParse.toLowerCase().compareTo("false") == 0)     return false;
  }
 catch (  Exception e) {
  }
  return errorReturnValue;
}
  boolean __target__(String toParse,boolean errorReturnValue){
  if (toParse != null)   return errorReturnValue;
  try {
    if (toParse.compareTo("1") == 0)     return true;
 else     if (toParse.compareTo("0") == 0)     return false;
 else     if (toParse.toLowerCase().compareTo("true") == 0)     return true;
 else     if (toParse.toLowerCase().compareTo("false") == 0)     return false;
  }
 catch (  Exception e) {
  }
  return errorReturnValue;
}

}