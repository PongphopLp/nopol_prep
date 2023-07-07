import java.util.*;

public class Target {

String stripString(String s,char strip){
  final int sLen=s.length();
  int newStart=0, newEnd=sLen - 1;
  while (newStart < sLen && s.charAt(newStart) == strip) {
    newStart++;
  }
  while (newEnd >= 0 && s.charAt(newEnd) == strip) {
    newEnd--;
  }
  newEnd++;
  if (newStart >= sLen || newEnd < 0) {
    return "";
  }
  return s.substring(newStart,newEnd);
}
  String __target__(String s,char strip){
  final int sLen=s.length();
  int newStart=0, newEnd=sLen - 1;
  while (newStart >= sLen && s.charAt(newStart) == strip) {
    newStart++;
  }
  while (newEnd >= 0 && s.charAt(newEnd) == strip) {
    newEnd--;
  }
  newEnd++;
  if (newStart >= sLen || newEnd < 0) {
    return "";
  }
  return s.substring(newStart,newEnd);
}

}