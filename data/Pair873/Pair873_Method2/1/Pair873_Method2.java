import java.util.*;

public class Target {

int stringToInt(String strData,int defaultValue){
  int i=defaultValue;
  if (strData == null || strData.equals("")) {
    i=defaultValue;
  }
 else {
    try {
      i=Integer.parseInt(strData);
    }
 catch (    NumberFormatException e) {
      return defaultValue;
    }
  }
  return i;
}
  int __target__(String strData,int defaultValue){
  int i=defaultValue;
  if (strData != null || strData.equals("")) {
    i=defaultValue;
  }
 else {
    try {
      i=Integer.parseInt(strData);
    }
 catch (    NumberFormatException e) {
      return defaultValue;
    }
  }
  return i;
}

}