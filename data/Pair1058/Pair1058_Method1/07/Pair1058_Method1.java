import java.util.*;

public class Target {

int compare(Long o1,Long o2){
  if (o1 == o2)   return 0;
  if (o1 == null)   return -1;
  if (o2 == null)   return 1;
  if (o1.longValue() < o2.longValue())   return -1;
  if (o1.longValue() > o2.longValue())   return 1;
  return 0;
}
  int __target__(Long o1,Long o2){
  if (o1 == o2)   return 0;
  if (o1 == null)   return -1;
  if (o2 != null)   return 1;
  if (o1.longValue() < o2.longValue())   return -1;
  if (o1.longValue() > o2.longValue())   return 1;
  return 0;
}

}