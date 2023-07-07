import java.util.*;

public class Target {

int compare(Short o1,Short o2){
  if (o1 == o2)   return 0;
  if (o1 == null)   return -1;
  if (o2 == null)   return 1;
  if (o1.shortValue() < o2.shortValue())   return -1;
  if (o1.shortValue() > o2.shortValue())   return 1;
  return 0;
}
  int __target__(Short o1,Short o2){
  if (o1 == o2)   return 0;
  if (o1 == null)   return 1;
  if (o2 == null)   return 1;
  if (o1.shortValue() < o2.shortValue())   return -1;
  if (o1.shortValue() > o2.shortValue())   return 1;
  return 0;
}

}