import java.util.*;

public class Target {

Integer getInteger(String response){
  if (response == null) {
    return null;
  }
  try {
    Integer parsed=Integer.parseInt(response);
    return parsed;
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Integer __target__(String response){
  if (response != null) {
    return null;
  }
  try {
    Integer parsed=Integer.parseInt(response);
    return parsed;
  }
 catch (  NumberFormatException e) {
    return null;
  }
}

}