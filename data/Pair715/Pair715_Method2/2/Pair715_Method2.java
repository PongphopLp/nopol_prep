import java.util.*;

public class Target {

String pad3(int n){
  if (n <= 9) {
    return "00" + n;
  }
 else   if (n <= 99) {
    return "0" + n;
  }
 else {
    return "" + n;
  }
}
  String __target__(int n){
  if (n <= 9) {
    return "00" + n;
  }
 else   if (n < 99) {
    return "0" + n;
  }
 else {
    return "" + n;
  }
}

}