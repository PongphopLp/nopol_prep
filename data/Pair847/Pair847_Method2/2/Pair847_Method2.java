import java.util.*;

public class Target {

Double validateDouble(String param){
  if (param == null || param.length() == 0)   return null;
  try {
    return Double.parseDouble(param.replace(',','.'));
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Double __target__(String param){
  if (param == null || param.length() != 0)   return null;
  try {
    return Double.parseDouble(param.replace(',','.'));
  }
 catch (  NumberFormatException e) {
    return null;
  }
}

}