import java.util.*;

public class Target {

float max(float y0,float y1,float y2){
  if ((y0 >= y1) && (y0 >= y2)) {
    return y0;
  }
 else   if (y1 >= y2) {
    return y1;
  }
 else {
    return y2;
  }
}
  float __target__(float y0,float y1,float y2){
  if ((y0 >= y1) && (y0 > y2)) {
    return y0;
  }
 else   if (y1 >= y2) {
    return y1;
  }
 else {
    return y2;
  }
}

}