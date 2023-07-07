import java.util.*;

public class Target {

String extendToFourDigits(int number){
  String str=Integer.toString(number);
  if (number >= 0 && number < 1000) {
    str='0' + str;
    if (number < 100) {
      str='0' + str;
    }
    if (number < 10) {
      str='0' + str;
    }
  }
  return str;
}
  String __target__(int number){
  String str=Integer.toString(number);
  if (number >= 0 && number >= 1000) {
    str='0' + str;
    if (number < 100) {
      str='0' + str;
    }
    if (number < 10) {
      str='0' + str;
    }
  }
  return str;
}

}