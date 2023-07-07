import java.util.*;

public class Target {

int convert(long input){
  int result;
  if (input > Integer.MAX_VALUE) {
    result=Integer.MAX_VALUE;
  }
 else   if (input < Integer.MIN_VALUE) {
    result=Integer.MIN_VALUE;
  }
 else {
    result=(int)input;
  }
  return result;
}
  int __target__(long input){
  int result;
  if (input <= Integer.MAX_VALUE) {
    result=Integer.MAX_VALUE;
  }
 else   if (input < Integer.MIN_VALUE) {
    result=Integer.MIN_VALUE;
  }
 else {
    result=(int)input;
  }
  return result;
}

}