import java.util.*;

public class Target {

float hlsValue(float n1,float n2,float h){
  if (h > 360) {
    h-=360;
  }
 else   if (h < 0) {
    h+=360;
  }
  if (h < 60) {
    return n1 + (n2 - n1) * h / 60.0f;
  }
 else   if (h < 180) {
    return n2;
  }
 else   if (h < 240) {
    return n1 + (n2 - n1) * (240.0f - h) / 60.0f;
  }
  return n1;
}
  float __target__(float n1,float n2,float h){
  if (h > 360) {
    h-=360;
  }
 else   if (h < 0) {
    h+=360;
  }
  if (h < 60) {
    return n1 + (n2 - n1) * h / 60.0f;
  }
 else   if (h < 180) {
    return n2;
  }
 else   if (h < 240) {
    return n1 - (n2 - n1) * (240.0f - h) / 60.0f;
  }
  return n1;
}

}