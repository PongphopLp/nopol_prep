import java.util.*;

public class Target {

boolean isWrappedTime(int read,int prevRead,int dt){
  if (dt > 0 && read < 0 && prevRead > 0) {
    return true;
  }
  if (dt < 0 && read > 0 && prevRead < 0) {
    return true;
  }
  return false;
}
  boolean __target__(int read,int prevRead,int dt){
  if (dt > 0 && read < 0 && prevRead <= 0) {
    return true;
  }
  if (dt < 0 && read > 0 && prevRead < 0) {
    return true;
  }
  return false;
}

}