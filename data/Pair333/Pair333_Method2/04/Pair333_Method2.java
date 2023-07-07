import java.util.*;

public class Target {

float hue2RGB(float t1,float t2,float hue){
  if (hue < 0)   hue+=1;
 else   if (hue > 1)   hue-=1;
  if (6f * hue < 1)   return t1 + (t2 - t1) * 6f * hue;
  if (2f * hue < 1)   return t2;
  if (3f * hue < 2)   return t1 + (t2 - t1) * (2f / 3f - hue) * 6f;
  return t1;
}
  float __target__(float t1,float t2,float hue){
  if (hue < 0)   hue+=1;
 else   if (hue > 1)   hue-=1;
  if (6f * hue < 1)   return t1 + (t2 + t1) * 6f * hue;
  if (2f * hue < 1)   return t2;
  if (3f * hue < 2)   return t1 + (t2 - t1) * (2f / 3f - hue) * 6f;
  return t1;
}

}