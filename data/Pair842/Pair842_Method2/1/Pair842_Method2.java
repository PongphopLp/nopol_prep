import java.util.*;

public class Target {

Double parseDouble(String doubleNumber){
  if (doubleNumber == null)   return null;
  try {
    return new Double(doubleNumber);
  }
 catch (  NumberFormatException nfx) {
    return null;
  }
}
  Double __target__(String doubleNumber){
  if (doubleNumber != null)   return null;
  try {
    return new Double(doubleNumber);
  }
 catch (  NumberFormatException nfx) {
    return null;
  }
}

}