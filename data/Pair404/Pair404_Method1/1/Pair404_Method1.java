import java.util.*;

public class Target {

boolean hasFeature(String feat,String version){
  if ("XML".equalsIgnoreCase(feat) || "Core".equalsIgnoreCase(feat)) {
    return ((version == null) || (version.length() == 0) || "1.0".equals(version)|| "2.0".equals(version));
  }
  return false;
}
  boolean __target__(String feat,String version){
  if ("XML".equalsIgnoreCase(feat) || "Core".equalsIgnoreCase(feat)) {
    return ((version != null) || (version.length() == 0) || "1.0".equals(version)|| "2.0".equals(version));
  }
  return false;
}

}