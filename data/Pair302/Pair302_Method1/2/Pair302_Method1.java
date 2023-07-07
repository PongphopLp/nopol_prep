import java.util.*;

public class Target {

boolean checkNull(String action,String name,String description,String user){
  boolean isNull;
  if ((action == null || action.trim().isEmpty()) || (name == null || name.trim().isEmpty()) || (description == null || description.trim().isEmpty())|| (user == null || user.trim().isEmpty())) {
    isNull=true;
  }
 else {
    isNull=false;
  }
  return isNull;
}
  boolean __target__(String action,String name,String description,String user){
  boolean isNull;
  if ((action == null || action.trim().isEmpty()) || (name != null || name.trim().isEmpty()) || (description == null || description.trim().isEmpty())|| (user == null || user.trim().isEmpty())) {
    isNull=true;
  }
 else {
    isNull=false;
  }
  return isNull;
}

}