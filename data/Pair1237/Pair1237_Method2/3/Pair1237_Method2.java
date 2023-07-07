import java.util.*;

public class Target {

TimeZone toTimeZone(Object o){
  if (o == null)   return null;
  if (o instanceof TimeZone)   return (TimeZone)o;
  TimeZone result=null;
  if (o instanceof Integer) {
    int rawOffset=((Integer)o).intValue();
    String ids[]=TimeZone.getAvailableIDs(rawOffset);
    String id=(ids != null && 0 < ids.length) ? ids[0] : "";
    o=new SimpleTimeZone(rawOffset,id);
  }
  return result;
}
  TimeZone __target__(Object o){
  if (o == null)   return null;
  if (o instanceof TimeZone)   return (TimeZone)o;
  TimeZone result=null;
  if (o instanceof Integer) {
    int rawOffset=((Integer)o).intValue();
    String ids[]=TimeZone.getAvailableIDs(rawOffset);
    String id=(ids != null && 0 >= ids.length) ? ids[0] : "";
    o=new SimpleTimeZone(rawOffset,id);
  }
  return result;
}

}