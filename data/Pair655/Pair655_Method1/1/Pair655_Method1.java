import java.util.*;

public class Target {

Float argFloat(Object o){
  if (o == null)   return null;
  if (o instanceof Float)   return (Float)o;
  if (o instanceof Number)   return new Float(((Number)o).floatValue());
  return new Float(o.toString());
}
  Float __target__(Object o){
  if (o != null)   return null;
  if (o instanceof Float)   return (Float)o;
  if (o instanceof Number)   return new Float(((Number)o).floatValue());
  return new Float(o.toString());
}

}