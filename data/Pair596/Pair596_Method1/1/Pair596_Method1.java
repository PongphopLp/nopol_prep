import java.util.*;

public class Target {

boolean isValidName(String name,String firstName){
  if ((name == null) || (firstName == null)) {
    return false;
  }
  if (name.trim().equals("") && firstName.trim().equals("")) {
    return false;
  }
  return true;
}
  boolean __target__(String name,String firstName){
  if ((name != null) || (firstName == null)) {
    return false;
  }
  if (name.trim().equals("") && firstName.trim().equals("")) {
    return false;
  }
  return true;
}

}