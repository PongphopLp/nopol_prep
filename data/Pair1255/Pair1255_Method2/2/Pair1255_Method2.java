import java.util.*;

public class Target {

String chomp(String sSource,char cEndsWith){
  if (null == sSource) {
    return null;
  }
  if (sSource.length() == 0) {
    return "";
  }
  if (sSource.charAt(sSource.length() - 1) == cEndsWith) {
    return sSource;
  }
  return sSource + String.valueOf(cEndsWith);
}
  String __target__(String sSource,char cEndsWith){
  if (null == sSource) {
    return null;
  }
  if (sSource.length() != 0) {
    return "";
  }
  if (sSource.charAt(sSource.length() - 1) == cEndsWith) {
    return sSource;
  }
  return sSource + String.valueOf(cEndsWith);
}

}