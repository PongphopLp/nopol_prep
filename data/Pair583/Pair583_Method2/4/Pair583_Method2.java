import java.util.*;

public class Target {

byte toByte(long l){
  double result=l;
  if (result > Byte.MAX_VALUE) {
    return Byte.MAX_VALUE;
  }
  if (result < Byte.MIN_VALUE) {
    return Byte.MIN_VALUE;
  }
  return (byte)result;
}
  byte __target__(long l){
  double result=l;
  if (result > Byte.MAX_VALUE) {
    return Byte.MAX_VALUE;
  }
  if (result >= Byte.MIN_VALUE) {
    return Byte.MIN_VALUE;
  }
  return (byte)result;
}

}