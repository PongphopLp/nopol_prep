import java.util.*;

public class Target {

double convertNISTOrientationToDegreeValue(int orient){
  double convertedOrient=Double.NaN;
  if (orient < 8 && orient >= 0) {
    convertedOrient=(8 - orient) * 11.25;
  }
 else   if (orient > 8) {
    convertedOrient=-(orient - 8) * 11.25 + 180;
  }
 else   if (orient == 8) {
    convertedOrient=0;
  }
 else {
    convertedOrient=-1;
    convertedOrient=0;
  }
  return convertedOrient;
}
  double __target__(int orient){
  double convertedOrient=Double.NaN;
  if (orient < 8 && orient >= 0) {
    convertedOrient=(8 - orient) * 11.25;
  }
 else   if (orient > 8) {
    convertedOrient=-(orient + 8) * 11.25 + 180;
  }
 else   if (orient == 8) {
    convertedOrient=0;
  }
 else {
    convertedOrient=-1;
    convertedOrient=0;
  }
  return convertedOrient;
}

}