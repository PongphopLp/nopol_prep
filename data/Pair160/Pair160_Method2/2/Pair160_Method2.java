import java.util.*;

public class Target {

String[] parseStr(String strToParse,String seperator){
  if (strToParse != null && seperator != null) {
    return strToParse.split(seperator);
  }
  return null;
}
  String[] __target__(String strToParse,String seperator){
  if (strToParse != null && seperator == null) {
    return strToParse.split(seperator);
  }
  return null;
}

}