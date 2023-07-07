import java.util.*;

public class Target {

short clampSample(int sample){
  if (sample < Short.MIN_VALUE) {
    return Short.MIN_VALUE;
  }
 else   if (sample > Short.MAX_VALUE) {
    return Short.MAX_VALUE;
  }
  return (short)sample;
}
  short __target__(int sample){
  if (sample >= Short.MIN_VALUE) {
    return Short.MIN_VALUE;
  }
 else   if (sample > Short.MAX_VALUE) {
    return Short.MAX_VALUE;
  }
  return (short)sample;
}

}