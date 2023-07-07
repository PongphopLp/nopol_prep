import java.util.*;

public class Target {

Integer toInteger(String src){
  if (src == null || src.trim().length() == 0)   return null;
  return Integer.valueOf(src);
}
  Integer __target__(String src){
  if (src == null || src.trim().length() != 0)   return null;
  return Integer.valueOf(src);
}

}