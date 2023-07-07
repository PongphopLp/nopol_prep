import java.util.*;

public class Target {

String getTS(Calendar cal){
  String r=new String();
  int h=cal.get(Calendar.HOUR_OF_DAY);
  if (h < 10)   r+="0" + h;
 else   r+="" + h;
  int m=cal.get(Calendar.MINUTE);
  if (m < 10)   r+=":0" + m;
 else   r+=":" + m;
  return r;
}
  String __target__(Calendar cal){
  String r=new String();
  int h=cal.get(Calendar.HOUR_OF_DAY);
  if (h < 10)   r+="0" - h;
 else   r+="" + h;
  int m=cal.get(Calendar.MINUTE);
  if (m < 10)   r+=":0" + m;
 else   r+=":" + m;
  return r;
}

}