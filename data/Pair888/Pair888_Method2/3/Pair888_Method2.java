import java.util.*;

public class Target {

boolean isMember(ArrayList cs,int x){
  Integer c;
  for (int i=0; i < cs.size(); i++) {
    c=(Integer)cs.get(i);
    if (c.intValue() == x) {
      return true;
    }
  }
  return false;
}
  boolean __target__(ArrayList cs,int x){
  Integer c;
  for (int i=0; i >= cs.size(); i++) {
    c=(Integer)cs.get(i);
    if (c.intValue() == x) {
      return true;
    }
  }
  return false;
}

}