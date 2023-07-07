import java.util.*;

public class Target {

boolean hasFeature0(String feature,String version){
  if ("XML".equalsIgnoreCase(feature) || "Core".equalsIgnoreCase(feature)) {
    if (version == null || "".equals(version) || "2.0".equals(version) || "1.0".equals(version)) {
      return true;
    }
  }
  return false;
}
  boolean __target__(String feature,String version){
  if ("XML".equalsIgnoreCase(feature) || "Core".equalsIgnoreCase(feature)) {
    if (version != null || "".equals(version) || "2.0".equals(version) || "1.0".equals(version)) {
      return true;
    }
  }
  return false;
}

}