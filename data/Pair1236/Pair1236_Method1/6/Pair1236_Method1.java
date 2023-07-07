import java.util.*;

public class Target {

String findBetween(String searchIn,String beginString,String endString){
  int beginpos=searchIn.indexOf(beginString);
  int endpos=-1;
  if (beginpos != -1) {
    endpos=searchIn.substring(beginpos + beginString.length()).indexOf(endString);
    if (endpos != -1) {
      return searchIn.substring(beginpos + beginString.length(),beginpos + beginString.length() + endpos);
    }
  }
  return null;
}
  String __target__(String searchIn,String beginString,String endString){
  int beginpos=searchIn.indexOf(beginString);
  int endpos=-1;
  if (beginpos != -1) {
    endpos=searchIn.substring(beginpos - beginString.length()).indexOf(endString);
    if (endpos != -1) {
      return searchIn.substring(beginpos + beginString.length(),beginpos + beginString.length() + endpos);
    }
  }
  return null;
}

}