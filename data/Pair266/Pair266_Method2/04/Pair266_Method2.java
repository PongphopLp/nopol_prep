import java.util.*;

public class Target {

int compare(Double o1,Double o2){
  if (o1 == o2)   return 0;
  if (o1 == null)   return -1;
  if (o2 == null)   return 1;
  if (o1.doubleValue() < o2.doubleValue())   return -1;
  if (o1.doubleValue() > o2.doubleValue())   return 1;
  return 0;
}
  int __target__(Double o1,Double o2){
  if (o1 == o2)   return 0;
  if (o1 == null)   return -1;
  if (o2 == null)   return 1;
  if (o1.doubleValue() < o2.doubleValue())   return -1;
  if (o1.doubleValue() > o2.doubleValue())   return 0;
  return 0;
}

}