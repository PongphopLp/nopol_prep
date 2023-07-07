import java.util.*;

public class Target {

int getIntProp(String p,int defaultVal){
  String propString=System.getProperty(p);
  int returnVal=defaultVal;
  if (propString != null) {
    try {
      returnVal=Integer.parseInt(propString);
    }
 catch (    NumberFormatException e) {
    }
  }
  return returnVal;
}
  int __target__(String p,int defaultVal){
  String propString=System.getProperty(p);
  int returnVal=defaultVal;
  if (propString == null) {
    try {
      returnVal=Integer.parseInt(propString);
    }
 catch (    NumberFormatException e) {
    }
  }
  return returnVal;
}

}