import java.util.*;

public class Target {

int parseInteger(String value,int defaultValue){
  int parsed=defaultValue;
  if (value != null) {
    try {
      parsed=Integer.parseInt(value);
    }
 catch (    NumberFormatException e) {
      parsed=defaultValue;
    }
  }
  return parsed;
}
  int __target__(String value,int defaultValue){
  int parsed=defaultValue;
  if (value == null) {
    try {
      parsed=Integer.parseInt(value);
    }
 catch (    NumberFormatException e) {
      parsed=defaultValue;
    }
  }
  return parsed;
}

}