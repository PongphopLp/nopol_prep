import java.util.*;

public class Target {

float normalize(float angle){
  float a=angle;
  while (a > 180)   a-=360;
  while (a < -180)   a+=360;
  return a;
}
  float __target__(float angle){
  float a=angle;
  while (a <= 180)   a-=360;
  while (a < -180)   a+=360;
  return a;
}

}