import java.util.*;

public class Target {

Long argLong(Object o){
  if (o == null)   return null;
  if (o instanceof Long)   return (Long)o;
  if (o instanceof Number)   return new Long(((Number)o).longValue());
  return new Long(o.toString());
}
  Long __target__(Object o){
  if (o != null)   return null;
  if (o instanceof Long)   return (Long)o;
  if (o instanceof Number)   return new Long(((Number)o).longValue());
  return new Long(o.toString());
}

}