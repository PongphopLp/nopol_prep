import java.util.*;

public class Target {

double translateLng(double lng){
  if (lng < -180) {
    lng+=360;
  }
 else   if (lng > 180) {
    lng-=360;
  }
  return lng;
}
  double __target__(double lng){
  if (lng < -180) {
    lng+=360;
  }
 else   if (lng >= 180) {
    lng-=360;
  }
  return lng;
}

}