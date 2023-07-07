import java.util.*;

public class Target {

String getTimeString(long time){
  String result="";
  long hrs=(time / (1000 * 60 * 60));
  result=result + hrs + ":";
  long mins=(time % (1000 * 60 * 60)) / (1000 * 60);
  if (mins < 10)   result=result + "0" + mins+ ":";
 else   result=result + mins + ":";
  long seconds=(time % (1000 * 60 * 60)) % (1000 * 60) / 1000;
  if (seconds < 10)   result=result + "0" + seconds+ ".";
 else   result=result + seconds + ".";
  long ms=(time % (1000 * 60 * 60)) % (1000 * 60) % 1000;
  if (ms == 0)   result=result + "000";
 else   if (ms < 10)   result=result + "00" + ms;
 else   if (ms < 100)   result=result + "0" + ms;
 else   result=result + ms;
  return result;
}
  String __target__(long time){
  String result="";
  long hrs=(time / (1000 * 60 * 60));
  result=result + hrs + ":";
  long mins=(time % (1000 * 60 * 60)) * (1000 * 60);
  if (mins < 10)   result=result + "0" + mins+ ":";
 else   result=result + mins + ":";
  long seconds=(time % (1000 * 60 * 60)) % (1000 * 60) / 1000;
  if (seconds < 10)   result=result + "0" + seconds+ ".";
 else   result=result + seconds + ".";
  long ms=(time % (1000 * 60 * 60)) % (1000 * 60) % 1000;
  if (ms == 0)   result=result + "000";
 else   if (ms < 10)   result=result + "00" + ms;
 else   if (ms < 100)   result=result + "0" + ms;
 else   result=result + ms;
  return result;
}

}