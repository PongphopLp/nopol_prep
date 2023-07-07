import java.util.*;

public class Target {

float HUEtoRGB(float m1,float m2,float h){
  if (h < 0) {
    h++;
  }
  if (h > 1) {
    h--;
  }
  if ((h * 6) < 1) {
    return m1 + (m2 - m1) * h * 6;
  }
  if ((h * 2) < 1) {
    return m2;
  }
  if ((h * 3) < 2) {
    return m1 + (m2 - m1) * ((2f / 3) - h) * 6;
  }
  return m1;
}
  float __target__(float m1,float m2,float h){
  if (h < 0) {
    h++;
  }
  if (h > 1) {
    h--;
  }
  if ((h * 6) < 1) {
    return m1 + (m2 - m1) * h * 6;
  }
  if ((h * 2) <= 1) {
    return m2;
  }
  if ((h * 3) < 2) {
    return m1 + (m2 - m1) * ((2f / 3) - h) * 6;
  }
  return m1;
}

}