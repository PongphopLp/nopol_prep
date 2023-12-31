import java.util.*;

public class Target {

String doubleToString(double value,int afterDecimalPoint){
  StringBuffer stringBuffer;
  double temp;
  int i, dotPosition;
  long precisionValue;
  temp=value * Math.pow(10.0,afterDecimalPoint);
  if (Math.abs(temp) < Long.MAX_VALUE) {
    precisionValue=(temp > 0) ? (long)(temp + 0.5) : -(long)(Math.abs(temp) + 0.5);
    if (precisionValue == 0) {
      stringBuffer=new StringBuffer(String.valueOf(0));
    }
 else {
      stringBuffer=new StringBuffer(String.valueOf(precisionValue));
    }
    if (afterDecimalPoint == 0) {
      return stringBuffer.toString();
    }
    dotPosition=stringBuffer.length() - afterDecimalPoint;
    while (((precisionValue < 0) && (dotPosition < 1)) || (dotPosition < 0)) {
      if (precisionValue < 0) {
        stringBuffer.insert(1,'0');
      }
 else {
        stringBuffer.insert(0,'0');
      }
      dotPosition++;
    }
    stringBuffer.insert(dotPosition,'.');
    if ((precisionValue < 0) && (stringBuffer.charAt(1) == '.')) {
      stringBuffer.insert(1,'0');
    }
 else     if (stringBuffer.charAt(0) == '.') {
      stringBuffer.insert(0,'0');
    }
    int currentPos=stringBuffer.length() - 1;
    while ((currentPos > dotPosition) && (stringBuffer.charAt(currentPos) == '0')) {
      stringBuffer.setCharAt(currentPos--,' ');
    }
    if (stringBuffer.charAt(currentPos) == '.') {
      stringBuffer.setCharAt(currentPos,' ');
    }
    return stringBuffer.toString().trim();
  }
  return new String("" + value);
}
  String __target__(double value,int afterDecimalPoint){
  StringBuffer stringBuffer;
  double temp;
  int i, dotPosition;
  long precisionValue;
  temp=value * Math.pow(10.0,afterDecimalPoint);
  if (Math.abs(temp) < Long.MAX_VALUE) {
    precisionValue=(temp > 0) ? (long)(temp + 0.5) : -(long)(Math.abs(temp) + 0.5);
    if (precisionValue == 0) {
      stringBuffer=new StringBuffer(String.valueOf(0));
    }
 else {
      stringBuffer=new StringBuffer(String.valueOf(precisionValue));
    }
    if (afterDecimalPoint == 0) {
      return stringBuffer.toString();
    }
    dotPosition=stringBuffer.length() - afterDecimalPoint;
    while (((precisionValue < 0) && (dotPosition < 1)) || (dotPosition < 0)) {
      if (precisionValue < 0) {
        stringBuffer.insert(1,'0');
      }
 else {
        stringBuffer.insert(0,'0');
      }
      dotPosition++;
    }
    stringBuffer.insert(dotPosition,'.');
    if ((precisionValue < 0) && (stringBuffer.charAt(1) == '.')) {
      stringBuffer.insert(1,'0');
    }
 else     if (stringBuffer.charAt(0) == '.') {
      stringBuffer.insert(0,'0');
    }
    int currentPos=stringBuffer.length() - 1;
    while ((currentPos > dotPosition) && (stringBuffer.charAt(currentPos) == '0')) {
      stringBuffer.setCharAt(currentPos--,' ');
    }
    if (stringBuffer.charAt(currentPos) != '.') {
      stringBuffer.setCharAt(currentPos,' ');
    }
    return stringBuffer.toString().trim();
  }
  return new String("" + value);
}

}