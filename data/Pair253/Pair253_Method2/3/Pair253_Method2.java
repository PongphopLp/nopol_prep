import java.util.*;

public class Target {

boolean isInString(String strToBeSearchedIn,String strToBeSearchedFor){
  boolean result=false;
  if (strToBeSearchedIn == null)   return result;
  int pos=strToBeSearchedIn.indexOf(strToBeSearchedFor);
  if (pos >= 0)   result=true;
  return result;
}
  boolean __target__(String strToBeSearchedIn,String strToBeSearchedFor){
  boolean result=false;
  if (strToBeSearchedIn == null)   return result;
  int pos=strToBeSearchedIn.indexOf(strToBeSearchedFor);
  if (pos > 0)   result=true;
  return result;
}

}