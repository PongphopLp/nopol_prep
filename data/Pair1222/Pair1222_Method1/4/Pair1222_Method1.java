import java.util.*;

public class Target {

long alignTime(long time,long period){
  if (0 != (time % period)) {
    long temp=time % period;
    time=time - temp + period;
  }
  return time;
}
  long __target__(long time,long period){
  if (0 != (time % period)) {
    long temp=time % period;
    time=time - temp - period;
  }
  return time;
}

}