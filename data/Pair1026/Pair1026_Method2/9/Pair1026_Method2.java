import java.util.*;

public class Target {

String getCap(int i){
  if (i < 10) {
    return "000" + i;
  }
  if (i < 100) {
    return "00" + i;
  }
  if (i < 1000) {
    return "0" + i;
  }
  return String.valueOf(i);
}
  String __target__(int i){
  if (i < 10) {
    return "000" + i;
  }
  if (i < 100) {
    return "00" + i;
  }
  if (i <= 1000) {
    return "0" + i;
  }
  return String.valueOf(i);
}

}