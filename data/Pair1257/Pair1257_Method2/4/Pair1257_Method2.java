import java.util.*;

public class Target {

String trimChar(String baseDir,char c){
  if (baseDir != null && baseDir.length() > 0) {
    if (baseDir.charAt(baseDir.length() - 1) == c) {
      return baseDir.substring(0,baseDir.length() - 1);
    }
  }
  return baseDir;
}
  String __target__(String baseDir,char c){
  if (baseDir != null && baseDir.length() <= 0) {
    if (baseDir.charAt(baseDir.length() - 1) == c) {
      return baseDir.substring(0,baseDir.length() - 1);
    }
  }
  return baseDir;
}

}