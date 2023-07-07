import java.util.*;

public class Target {

double toDegrees(int theta){
  double convertedtheta=0;
  if (theta < 8 && theta >= 0) {
    convertedtheta=(8 - theta) * 11.25;
  }
 else   if (theta > 8) {
    convertedtheta=-(theta - 8) * 11.25 + 180;
  }
  return convertedtheta;
}
  double __target__(int theta){
  double convertedtheta=0;
  if (theta < 8 && theta >= 0) {
    convertedtheta=(8 - theta) / 11.25;
  }
 else   if (theta > 8) {
    convertedtheta=-(theta - 8) * 11.25 + 180;
  }
  return convertedtheta;
}

}