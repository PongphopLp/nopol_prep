import java.util.*;

public class Target {

boolean isInRange(int current,int from,int to){
  if (from < to) {
    return current >= from && current <= to;
  }
  return current <= from && current >= to;
}
  boolean __target__(int current,int from,int to){
  if (from < to) {
    return current >= from && current < to;
  }
  return current <= from && current >= to;
}

}