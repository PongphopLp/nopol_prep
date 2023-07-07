import java.util.*;

public class Target {

boolean cdPoint(int x1,int y1,int x2,int y2){
  if (x1 == x2 && y1 == y2)   return true;
  return false;
}
  boolean __target__(int x1,int y1,int x2,int y2){
  if (x1 != x2 && y1 == y2)   return true;
  return false;
}

}