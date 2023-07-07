import java.util.*;

public class Target {

String makeFourDigits(int i){
  if (i < 10) {
    return "000" + i;
  }
 else   if (i < 100) {
    return "00" + i;
  }
 else   if (i < 1000) {
    return "0" + i;
  }
 else {
    return "" + i;
  }
}
  String __target__(int i){
  if (i < 10) {
    return "000" + i;
  }
 else   if (i >= 100) {
    return "00" + i;
  }
 else   if (i < 1000) {
    return "0" + i;
  }
 else {
    return "" + i;
  }
}

}