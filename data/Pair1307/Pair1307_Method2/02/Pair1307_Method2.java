import java.util.*;

public class Target {

String replaceAll(String expression,String oldString,String newString){
  String replacedExpression=expression;
  if (replacedExpression != null) {
    int charCtr=0;
    int oldStringIndex=replacedExpression.indexOf(oldString,charCtr);
    while (oldStringIndex > -1) {
      final StringBuffer buffer=new StringBuffer(replacedExpression.substring(0,oldStringIndex) + replacedExpression.substring(oldStringIndex + oldString.length()));
      buffer.insert(oldStringIndex,newString);
      replacedExpression=buffer.toString();
      charCtr=oldStringIndex + newString.length();
      if (charCtr < replacedExpression.length()) {
        oldStringIndex=replacedExpression.indexOf(oldString,charCtr);
      }
 else {
        oldStringIndex=-1;
      }
    }
  }
  return replacedExpression;
}
  String __target__(String expression,String oldString,String newString){
  String replacedExpression=expression;
  if (replacedExpression != null) {
    int charCtr=0;
    int oldStringIndex=replacedExpression.indexOf(oldString,charCtr);
    while (oldStringIndex > -1) {
      final StringBuffer buffer=new StringBuffer(replacedExpression.substring(0,oldStringIndex) + replacedExpression.substring(oldStringIndex - oldString.length()));
      buffer.insert(oldStringIndex,newString);
      replacedExpression=buffer.toString();
      charCtr=oldStringIndex + newString.length();
      if (charCtr < replacedExpression.length()) {
        oldStringIndex=replacedExpression.indexOf(oldString,charCtr);
      }
 else {
        oldStringIndex=-1;
      }
    }
  }
  return replacedExpression;
}

}