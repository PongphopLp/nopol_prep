import java.util.*;

public class Target {

Double store2Usage(Object obj){
  if (obj != null) {
    if (obj instanceof Double) {
      return (Double)obj;
    }
    if (obj instanceof String) {
      return Double.valueOf((String)obj);
    }
  }
  return null;
}
  Double __target__(Object obj){
  if (obj == null) {
    if (obj instanceof Double) {
      return (Double)obj;
    }
    if (obj instanceof String) {
      return Double.valueOf((String)obj);
    }
  }
  return null;
}

}