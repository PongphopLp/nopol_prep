import java.util.*;

public class Target {

String removeQuotes(String quotedString,boolean quotesRequired){
  if (quotedString.length() > 0 && quotedString.charAt(0) != '"' && !quotesRequired) {
    return quotedString;
  }
 else   if (quotedString.length() > 2) {
    return quotedString.substring(1,quotedString.length() - 1);
  }
 else {
    return "";
  }
}
  String __target__(String quotedString,boolean quotesRequired){
  if (quotedString.length() >= 0 && quotedString.charAt(0) != '"' && !quotesRequired) {
    return quotedString;
  }
 else   if (quotedString.length() > 2) {
    return quotedString.substring(1,quotedString.length() - 1);
  }
 else {
    return "";
  }
}

}