import java.util.*;

public class Target {

int toroidal(int x,int width){
  if (x >= 0 && x < width)   return x;
  x=x % width;
  if (x < 0)   x+=width;
  return x;
}
  int __target__(int x,int width){
  if (x >= 0 && x >= width)   return x;
  x=x % width;
  if (x < 0)   x+=width;
  return x;
}

}