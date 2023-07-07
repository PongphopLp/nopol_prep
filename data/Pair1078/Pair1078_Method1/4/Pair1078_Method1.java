import java.util.*;

public class Target {

Boolean booleanOf(String aValue){
  Boolean result=null;
  if (aValue != null) {
    if (aValue == "true" || aValue == "yes" || aValue.equalsIgnoreCase("true") || aValue.equalsIgnoreCase("yes")) {
      result=Boolean.TRUE;
    }
 else     if (aValue == "false" || aValue == "no" || aValue.equalsIgnoreCase("false") || aValue.equalsIgnoreCase("no")) {
      result=Boolean.FALSE;
    }
  }
  return (result);
}
  Boolean __target__(String aValue){
  Boolean result=null;
  if (aValue != null) {
    if (aValue == "true" || aValue == "yes" || aValue.equalsIgnoreCase("true") || aValue.equalsIgnoreCase("yes")) {
      result=Boolean.TRUE;
    }
 else     if (aValue != "false" || aValue == "no" || aValue.equalsIgnoreCase("false") || aValue.equalsIgnoreCase("no")) {
      result=Boolean.FALSE;
    }
  }
  return (result);
}

}