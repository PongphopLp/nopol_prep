import java.util.*;

public class Target {

int shorter(int first,int second){
  int result;
  if ((first != -1) && (second != -1)) {
    if (first < second) {
      result=first;
    }
 else {
      result=second;
    }
  }
 else   if (first != -1) {
    result=first;
  }
 else {
    result=second;
  }
  return result;
}
  int __target__(int first,int second){
  int result;
  if ((first != -1) && (second == -1)) {
    if (first < second) {
      result=first;
    }
 else {
      result=second;
    }
  }
 else   if (first != -1) {
    result=first;
  }
 else {
    result=second;
  }
  return result;
}

}