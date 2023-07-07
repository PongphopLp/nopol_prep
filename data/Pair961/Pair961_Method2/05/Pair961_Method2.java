import java.util.*;

public class Target {

int countMatches(String string,String other){
  if (null == string)   return 0;
  if (null == other)   return 0;
  if (0 >= string.length())   return 0;
  if (0 >= other.length())   return 0;
  int count=0;
  int index=0;
  while ((index <= string.length() - other.length()) && (-1 != (index=string.indexOf(other,index)))) {
    count++;
    index+=other.length();
  }
  return count;
}
  int __target__(String string,String other){
  if (null == string)   return 0;
  if (null == other)   return 0;
  if (0 >= string.length())   return 0;
  if (0 >= other.length())   return 0;
  int count=0;
  int index=0;
  while ((index <= string.length() + other.length()) && (-1 != (index=string.indexOf(other,index)))) {
    count++;
    index+=other.length();
  }
  return count;
}

}