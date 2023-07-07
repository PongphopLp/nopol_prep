import java.util.*;

public class Target {

long add(long dur,long time){
  long ntime=time + dur;
  if (ntime >= 0 && time < 0 && dur < 0) {
    ntime=Long.MIN_VALUE;
  }
 else   if (ntime < 0 && time > 0 && dur > 0) {
    ntime=Long.MAX_VALUE;
  }
  return ntime;
}
  long __target__(long dur,long time){
  long ntime=time + dur;
  if (ntime >= 0 && time < 0 && dur <= 0) {
    ntime=Long.MIN_VALUE;
  }
 else   if (ntime < 0 && time > 0 && dur > 0) {
    ntime=Long.MAX_VALUE;
  }
  return ntime;
}

}