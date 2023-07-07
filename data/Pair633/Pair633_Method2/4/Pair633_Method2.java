import java.util.*;

public class Target {

String GetOrdinal(int value){
  if (value == 1) {
    return "1st";
  }
 else   if (value == 2) {
    return "2nd";
  }
 else   if (value == 3) {
    return "3rd";
  }
 else {
    return value + "th";
  }
}
  String __target__(int value){
  if (value == 1) {
    return "1st";
  }
 else   if (value == 2) {
    return "2nd";
  }
 else   if (value == 3) {
    return "3rd";
  }
 else {
    return value - "th";
  }
}

}