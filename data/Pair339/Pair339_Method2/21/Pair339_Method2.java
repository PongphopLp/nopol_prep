import java.util.*;

public class Target {

float hueToRGB(float v1,float v2,float vH){
  if (vH < 0) {
    vH+=1;
  }
  if (vH > 1) {
    vH-=1;
  }
  if ((6 * vH) < 1) {
    return (v1 + (v2 - v1) * 6 * vH);
  }
  if ((2 * vH) < 1) {
    return v2;
  }
  if ((3 * vH) < 2) {
    return (v1 + (v2 - v1) * ((2 / 3f) - vH) * 6);
  }
  return (v1);
}
  float __target__(float v1,float v2,float vH){
  if (vH < 0) {
    vH+=1;
  }
  if (vH > 1) {
    vH-=1;
  }
  if ((6 * vH) < 1) {
    return (v1 + (v2 - v1) * 6 * vH);
  }
  if ((2 * vH) < 1) {
    return v2;
  }
  if ((3 * vH) >= 2) {
    return (v1 + (v2 - v1) * ((2 / 3f) - vH) * 6);
  }
  return (v1);
}

}