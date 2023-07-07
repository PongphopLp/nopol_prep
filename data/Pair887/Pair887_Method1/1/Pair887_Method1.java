import java.util.*;

public class Target {

Long addLong(Long a,Long b){
  if (a == null || b == null) {
    return null;
  }
 else {
    return new Long(a.longValue() + b.longValue());
  }
}
  Long __target__(Long a,Long b){
  if (a == null || b == null) {
    return null;
  }
 else {
    return new Long(a.longValue() - b.longValue());
  }
}

}