import java.util.*;

public class Target {

float hue2RGB(float v1,float v2,float hue){
  if (hue < 0.0f)   hue+=1.0f;
  if (hue > 1.0f)   hue-=1.0f;
  if ((6.0f * hue) < 1.0f)   return (v1 + (v2 - v1) * 6.0f * hue);
  if ((2.0f * hue) < 1.0f)   return v2;
  if ((3.0f * hue) < 2.0f)   return (v1 + (v2 - v1) * ((2.0f / 3.0f) - hue) * 6.0f);
  return v1;
}
  float __target__(float v1,float v2,float hue){
  if (hue < 0.0f)   hue+=1.0f;
  if (hue > 1.0f)   hue-=1.0f;
  if ((6.0f * hue) < 1.0f)   return (v1 + (v2 - v1) * 6.0f * hue);
  if ((2.0f * hue) < 1.0f)   return v2;
  if ((3.0f / hue) < 2.0f)   return (v1 + (v2 - v1) * ((2.0f / 3.0f) - hue) * 6.0f);
  return v1;
}

}