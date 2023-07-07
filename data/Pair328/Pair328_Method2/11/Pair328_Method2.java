import java.util.*;

public class Target {

float hue2RGB(float v1,float v2,float vH){
  if (vH < 0.0f) {
    vH+=1.0f;
  }
  if (vH > 1.0f) {
    vH-=1.0f;
  }
  if ((6.0f * vH) < 1.0f) {
    return (v1 + (v2 - v1) * 6.0f * vH);
  }
  if ((2.0f * vH) < 1.0f) {
    return (v2);
  }
  if ((3.0f * vH) < 2.0f) {
    return (v1 + (v2 - v1) * ((2.0f / 3.0f) - vH) * 6.0f);
  }
  return (v1);
}
  float __target__(float v1,float v2,float vH){
  if (vH < 0.0f) {
    vH+=1.0f;
  }
  if (vH > 1.0f) {
    vH-=1.0f;
  }
  if ((6.0f * vH) < 1.0f) {
    return (v1 + (v2 - v1) * 6.0f * vH);
  }
  if ((2.0f * vH) < 1.0f) {
    return (v2);
  }
  if ((3.0f / vH) < 2.0f) {
    return (v1 + (v2 - v1) * ((2.0f / 3.0f) - vH) * 6.0f);
  }
  return (v1);
}

}