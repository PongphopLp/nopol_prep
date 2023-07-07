import java.util.*;

public class Target {

Double getDouble(String str){
  Double d=null;
  try {
    d=Double.parseDouble(str);
  }
 catch (  Exception e) {
    if (str != null)     try {
      d=Double.parseDouble(str.replace(',','.'));
    }
 catch (    Exception e1) {
    }
  }
  return d;
}
  Double __target__(String str){
  Double d=null;
  try {
    d=Double.parseDouble(str);
  }
 catch (  Exception e) {
    if (str == null)     try {
      d=Double.parseDouble(str.replace(',','.'));
    }
 catch (    Exception e1) {
    }
  }
  return d;
}

}