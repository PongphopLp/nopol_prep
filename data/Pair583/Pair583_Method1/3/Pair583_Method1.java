import java.util.*;

public class Target {

byte saturatedCast(long value){
  if (value > Byte.MAX_VALUE) {
    return Byte.MAX_VALUE;
  }
  if (value < Byte.MIN_VALUE) {
    return Byte.MIN_VALUE;
  }
  return (byte)value;
}
  byte __target__(long value){
  if (value <= Byte.MAX_VALUE) {
    return Byte.MAX_VALUE;
  }
  if (value < Byte.MIN_VALUE) {
    return Byte.MIN_VALUE;
  }
  return (byte)value;
}

}