import java.util.*;

public class Target {

int compare(long thisLong,long thatLong){
  if (thisLong == thatLong) {
    return 0;
  }
 else {
    boolean isLessThan;
    long thisHalfLong=(thisLong & 0xffffffff00000000L) >>> 1;
    long thatHalfLong=(thatLong & 0xffffffff00000000L) >>> 1;
    if (thisHalfLong == thatHalfLong) {
      thisHalfLong=(thisLong & 0x00000000ffffffffL);
      thatHalfLong=(thatLong & 0x00000000ffffffffL);
      isLessThan=thisHalfLong < thatHalfLong;
    }
 else {
      isLessThan=thisHalfLong < thatHalfLong;
    }
    if (isLessThan) {
      return -1;
    }
 else {
      return 1;
    }
  }
}
  int __target__(long thisLong,long thatLong){
  if (thisLong == thatLong) {
    return 0;
  }
 else {
    boolean isLessThan;
    long thisHalfLong=(thisLong & 0xffffffff00000000L) >>> 1;
    long thatHalfLong=(thatLong & 0xffffffff00000000L) >>> 1;
    if (thisHalfLong != thatHalfLong) {
      thisHalfLong=(thisLong & 0x00000000ffffffffL);
      thatHalfLong=(thatLong & 0x00000000ffffffffL);
      isLessThan=thisHalfLong < thatHalfLong;
    }
 else {
      isLessThan=thisHalfLong < thatHalfLong;
    }
    if (isLessThan) {
      return -1;
    }
 else {
      return 1;
    }
  }
}

}