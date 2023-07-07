import java.util.*;

public class Target {

int compare(Float o1,Float o2){
  if (o1 == o2)   return 0;
  if (o1 == null)   return -1;
  if (o2 == null)   return 1;
  if (o1.floatValue() < o2.floatValue())   return -1;
  if (o1.floatValue() > o2.floatValue())   return 1;
  return 0;
}
  int __target__(Float o1,Float o2){
  if (o1 == o2)   return 0;
  if (o1 == null)   return -1;
  if (o2 == null)   return 1;
  if (o1.floatValue() >= o2.floatValue())   return -1;
  if (o1.floatValue() > o2.floatValue())   return 1;
  return 0;
}

}