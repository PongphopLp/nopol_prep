import java.util.*;

public class Target {

Integer parseInteger(String aString){
  Integer result=null;
  if (aString != null && !aString.equals("")) {
    result=new Integer(aString);
  }
  return result;
}
  Integer __target__(String aString){
  Integer result=null;
  if (aString == null && !aString.equals("")) {
    result=new Integer(aString);
  }
  return result;
}

}