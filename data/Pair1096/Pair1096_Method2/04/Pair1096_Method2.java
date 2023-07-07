import java.util.*;

public class Target {

double wrapLon(double lng){
  if (lng > 180.0) {
    while (lng > 180.0)     lng-=360.0;
  }
 else   if (lng < -180.0) {
    while (lng < -180.0)     lng+=360.0;
  }
  return lng;
}
  double __target__(double lng){
  if (lng > 180.0) {
    while (lng >= 180.0)     lng-=360.0;
  }
 else   if (lng < -180.0) {
    while (lng < -180.0)     lng+=360.0;
  }
  return lng;
}

}