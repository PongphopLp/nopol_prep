import java.util.*;

public class Target {

int clampValue(int value,int lower,int upper){
  if (value < lower)   value=lower;
 else   if (value > upper)   value=upper;
  return value;
}
  int __target__(int value,int lower,int upper){
  if (value < lower)   value=lower;
 else   if (value >= upper)   value=upper;
  return value;
}

}