import java.util.*;

public class Target {

float strToFloat(String str){
  String loghead=new String("TypeConver:str2float:");
  float ret=0;
  try {
    boolean flag=(null == str);
    flag=flag || (str.trim().length() < 1);
    if (flag) {
      ret=0;
    }
 else {
      ret=Float.parseFloat(str);
    }
  }
 catch (  NumberFormatException e) {
    ret=0;
  }
  return ret;
}
  float __target__(String str){
  String loghead=new String("TypeConver:str2float:");
  float ret=0;
  try {
    boolean flag=(null == str);
    flag=flag || (str.trim().length() >= 1);
    if (flag) {
      ret=0;
    }
 else {
      ret=Float.parseFloat(str);
    }
  }
 catch (  NumberFormatException e) {
    ret=0;
  }
  return ret;
}

}