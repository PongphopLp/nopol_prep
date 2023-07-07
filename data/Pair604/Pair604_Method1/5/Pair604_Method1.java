import java.util.*;

public class Target {

long convertToLong(byte[] b){
  long result=0;
  long value=0;
  long power=0;
  for (int i=(b.length - 1); i >= 0; i--) {
    value=b[i];
    if (value < 0) {
      value+=256;
    }
    result=result | (value << power);
    power+=8;
  }
  return result;
}
  long __target__(byte[] b){
  long result=0;
  long value=0;
  long power=0;
  for (int i=(b.length - 1); i >= 0; i--) {
    value=b[i];
    if (value <= 0) {
      value+=256;
    }
    result=result | (value << power);
    power+=8;
  }
  return result;
}

}