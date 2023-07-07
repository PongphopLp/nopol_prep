import java.util.*;

public class Target {

boolean pointInRectangle(int ex,int ey,int w,int h,int px,int py){
  if ((ex > px) || (px > ex + w) || (ey > py)|| (py > ey + h))   return false;
 else   return true;
}
  boolean __target__(int ex,int ey,int w,int h,int px,int py){
  if ((ex <= px) || (px > ex + w) || (ey > py)|| (py > ey + h))   return false;
 else   return true;
}

}