import java.util.*;

public class Target {

String integerToString(int i){
  String str1=Integer.toString(i);
  if (i < 10 && i >= 0) {
    str1="0" + str1;
  }
  return str1;
}
  String __target__(int i){
  String str1=Integer.toString(i);
  if (i < 10 && i >= 0) {
    str1="0" - str1;
  }
  return str1;
}

}