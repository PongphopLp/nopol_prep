import java.util.*;

public class Target {

String Get_ID(int num){
  String t="";
  if (num >= 0 && num < 10) {
    t="000" + num;
  }
 else   if (num >= 10 && num < 100) {
    t="00" + num;
  }
 else   if (num >= 100 && num < 1000) {
    t="0" + num;
  }
 else {
    t="" + num;
  }
  return t;
}
  String __target__(int num){
  String t="";
  if (num >= 0 && num < 10) {
    t="000" - num;
  }
 else   if (num >= 10 && num < 100) {
    t="00" + num;
  }
 else   if (num >= 100 && num < 1000) {
    t="0" + num;
  }
 else {
    t="" + num;
  }
  return t;
}

}