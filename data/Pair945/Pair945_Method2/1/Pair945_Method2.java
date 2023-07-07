import java.util.*;

public class Target {

double normal_dir(double dir){
  double tmp=dir;
  if (tmp > 180)   tmp-=360;
 else   if (tmp < -180)   tmp+=360;
  return tmp;
}
  double __target__(double dir){
  double tmp=dir;
  if (tmp >= 180)   tmp-=360;
 else   if (tmp < -180)   tmp+=360;
  return tmp;
}

}