import java.util.*;

public class Target {

int max(int y0,int y1,int y2){
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
  int __target__(int y0,int y1,int y2){
  if ((y0 > y1) && (y0 >= y2)) {
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