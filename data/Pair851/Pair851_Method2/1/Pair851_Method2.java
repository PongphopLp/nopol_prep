import java.util.*;

public class Target {

Double makeDouble(String token){
  if (token != null && !"".equals(token.trim())) {
    return Double.valueOf(token);
  }
 else {
    return null;
  }
}
  Double __target__(String token){
  if (token == null && !"".equals(token.trim())) {
    return Double.valueOf(token);
  }
 else {
    return null;
  }
}

}