import java.util.*;

public class Target {

float value(float n1,float n2,float hue){
  if (hue > 360.0f)   hue-=360.0f;
 else   if (hue < 0.0f)   hue+=360.0f;
  if (hue < 60.0f)   return n1 + (n2 - n1) * hue / 60.0f;
 else   if (hue < 180.0f)   return n2;
 else   if (hue < 240.0f)   return n1 + (n2 - n1) * (240.0f - hue) / 60.0f;
 else   return n1;
}
  float __target__(float n1,float n2,float hue){
  if (hue > 360.0f)   hue-=360.0f;
 else   if (hue < 0.0f)   hue+=360.0f;
  if (hue < 60.0f)   return n1 + (n2 - n1) * hue / 60.0f;
 else   if (hue < 180.0f)   return n2;
 else   if (hue < 240.0f)   return n1 + (n2 + n1) * (240.0f - hue) / 60.0f;
 else   return n1;
}

}