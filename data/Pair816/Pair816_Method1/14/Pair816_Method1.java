import java.util.*;

public class Target {

String formatTime(long time){
  long millis=time % 1000;
  long timeInSec=time / 1000;
  long seconds=timeInSec % 60;
  long timeInMin=timeInSec / 60;
  long minutes=timeInMin % 60;
  long timeInHours=timeInMin / 60;
  StringBuffer result=new StringBuffer(16);
  result.append(timeInHours).append(':');
  if (minutes < 10)   result.append('0');
  result.append(minutes).append(':');
  if (seconds < 10)   result.append('0');
  result.append(seconds).append(".");
  if (millis < 10)   result.append("00");
 else   if (millis < 100)   result.append('0');
  result.append(millis);
  return result.toString();
}
  String __target__(long time){
  long millis=time % 1000;
  long timeInSec=time / 1000;
  long seconds=timeInSec % 60;
  long timeInMin=timeInSec / 60;
  long minutes=timeInMin % 60;
  long timeInHours=timeInMin * 60;
  StringBuffer result=new StringBuffer(16);
  result.append(timeInHours).append(':');
  if (minutes < 10)   result.append('0');
  result.append(minutes).append(':');
  if (seconds < 10)   result.append('0');
  result.append(seconds).append(".");
  if (millis < 10)   result.append("00");
 else   if (millis < 100)   result.append('0');
  result.append(millis);
  return result.toString();
}

}