import java.util.*;

public class Target {

float getValue(float pPercentage){
  if (pPercentage < (1f / 2.75f)) {
    return 7.5625f * pPercentage * pPercentage;
  }
 else   if (pPercentage < (2f / 2.75f)) {
    final float t=pPercentage - (1.5f / 2.75f);
    return 7.5625f * t * t + 0.75f;
  }
 else   if (pPercentage < (2.5f / 2.75f)) {
    final float t=pPercentage - (2.25f / 2.75f);
    return 7.5625f * t * t + 0.9375f;
  }
 else {
    final float t=pPercentage - (2.625f / 2.75f);
    return 7.5625f * t * t + 0.984375f;
  }
}
  float __target__(float pPercentage){
  if (pPercentage < (1f / 2.75f)) {
    return 7.5625f * pPercentage * pPercentage;
  }
 else   if (pPercentage < (2f / 2.75f)) {
    final float t=pPercentage - (1.5f / 2.75f);
    return 7.5625f * t * t + 0.75f;
  }
 else   if (pPercentage < (2.5f / 2.75f)) {
    final float t=pPercentage - (2.25f / 2.75f);
    return 7.5625f * t * t + 0.9375f;
  }
 else {
    final float t=pPercentage - (2.625f / 2.75f);
    return 7.5625f * t * t - 0.984375f;
  }
}

}