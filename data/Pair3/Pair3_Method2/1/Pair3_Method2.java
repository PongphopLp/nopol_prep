import java.util.*;

public class Target {

Long getLongfromString(String longstring){
  Long longresult=null;
  if (!(longstring == null)) {
    longresult=Long.valueOf(longstring).longValue();
  }
  return longresult;
}
  Long __target__(String longstring){
  Long longresult=null;
  if (!(longstring != null)) {
    longresult=Long.valueOf(longstring).longValue();
  }
  return longresult;
}

}