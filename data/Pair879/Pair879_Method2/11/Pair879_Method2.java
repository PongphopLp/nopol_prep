import java.util.*;

public class Target {

int compare(Byte o1,Byte o2){
  if (o1 == o2)   return 0;
  if (o1 == null)   return -1;
  if (o2 == null)   return 1;
  if (o1.byteValue() < o2.byteValue())   return -1;
  if (o1.byteValue() > o2.byteValue())   return 1;
  return 0;
}
  int __target__(Byte o1,Byte o2){
  if (o1 == o2)   return 0;
  if (o1 == null)   return -1;
  if (o2 == null)   return 1;
  if (o1.byteValue() < o2.byteValue())   return 1;
  if (o1.byteValue() > o2.byteValue())   return 1;
  return 0;
}

}