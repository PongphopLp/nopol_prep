import java.util.*;

public class Target {

double getRadianFromVector(double xCoordinate,double yCoordinate){
  double result;
  if (xCoordinate == 0) {
    if (yCoordinate < 0) {
      result=3 * Math.PI / 2;
    }
 else {
      result=Math.PI / 2;
    }
  }
 else {
    result=Math.atan(yCoordinate / xCoordinate);
    if (xCoordinate < 0) {
      result=Math.PI + result;
    }
 else     if (xCoordinate > 0 && yCoordinate < 0) {
      result=2 * Math.PI + result;
    }
  }
  return result;
}
  double __target__(double xCoordinate,double yCoordinate){
  double result;
  if (xCoordinate == 0) {
    if (yCoordinate < 0) {
      result=3 * Math.PI * 2;
    }
 else {
      result=Math.PI / 2;
    }
  }
 else {
    result=Math.atan(yCoordinate / xCoordinate);
    if (xCoordinate < 0) {
      result=Math.PI + result;
    }
 else     if (xCoordinate > 0 && yCoordinate < 0) {
      result=2 * Math.PI + result;
    }
  }
  return result;
}

}