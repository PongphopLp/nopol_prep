import java.util.*;

public class Target {

long calculateNukedAmount(long size,float ratio,int multiplier){
  if (size != 0 && ratio != 0 && multiplier != 0) {
    return (long)((size * ratio) + (size * (multiplier - 1)));
  }
 else {
    return 0L;
  }
}
  long __target__(long size,float ratio,int multiplier){
  if (size != 0 && ratio != 0 && multiplier == 0) {
    return (long)((size * ratio) + (size * (multiplier - 1)));
  }
 else {
    return 0L;
  }
}

}