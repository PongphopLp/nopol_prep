import java.util.*;

public class Target {

double clamp(double val,double minVal,double maxVal){
  double newVal=val;
  if (minVal < maxVal) {
    if (newVal < minVal)     newVal=minVal;
 else     if (newVal > maxVal)     newVal=maxVal;
  }
 else {
    if (newVal < maxVal)     newVal=maxVal;
 else     if (newVal > minVal)     newVal=minVal;
  }
  return newVal;
}
  double __target__(double val,double minVal,double maxVal){
  double newVal=val;
  if (minVal >= maxVal) {
    if (newVal < minVal)     newVal=minVal;
 else     if (newVal > maxVal)     newVal=maxVal;
  }
 else {
    if (newVal < maxVal)     newVal=maxVal;
 else     if (newVal > minVal)     newVal=minVal;
  }
  return newVal;
}

}