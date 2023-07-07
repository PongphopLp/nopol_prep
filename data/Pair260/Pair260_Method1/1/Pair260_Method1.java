import java.util.*;

public class Target {

String getTaskSingleValue(Map formData,String key){
  Object values=formData.get(key);
  if (values == null)   return null;
 else   if (values instanceof String)   return (String)values;
 else   if (values instanceof String[])   return ((String[])values)[0];
  return null;
}
  String __target__(Map formData,String key){
  Object values=formData.get(key);
  if (values != null)   return null;
 else   if (values instanceof String)   return (String)values;
 else   if (values instanceof String[])   return ((String[])values)[0];
  return null;
}

}