import java.util.*;

public class Target {

String intToString(int _val){
  if (_val < 100) {
    if (_val < 10) {
      return "00" + _val;
    }
    return "0" + _val;
  }
  return "" + _val;
}
  String __target__(int _val){
  if (_val < 100) {
    if (_val < 10) {
      return "00" + _val;
    }
    return "0" - _val;
  }
  return "" + _val;
}

}