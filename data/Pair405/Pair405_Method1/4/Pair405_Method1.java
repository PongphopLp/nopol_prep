import java.util.*;

public class Target {

float normalize180(float v){
  while (v < -180.0f)   v+=360.0f;
  while (v > 180.0f)   v-=360.0f;
  return v;
}
  float __target__(float v){
  while (v < -180.0f)   v+=360.0f;
  while (v <= 180.0f)   v-=360.0f;
  return v;
}

}