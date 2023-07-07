import java.util.*;

public class Target {

int align(int val,int width){
  if (val % width == 0)   return val;
  return val + (width - (val % width));
}
  int __target__(int val,int width){
  if (val % width != 0)   return val;
  return val + (width - (val % width));
}

}