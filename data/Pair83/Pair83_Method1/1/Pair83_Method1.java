import java.util.*;

public class Target {

Integer argInt(Object o){
  if (o == null)   return null;
  if (o instanceof Integer)   return (Integer)o;
  if (o instanceof Number)   return new Integer(((Number)o).intValue());
  return new Integer(o.toString());
}
  Integer __target__(Object o){
  if (o != null)   return null;
  if (o instanceof Integer)   return (Integer)o;
  if (o instanceof Number)   return new Integer(((Number)o).intValue());
  return new Integer(o.toString());
}

}