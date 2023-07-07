import java.util.*;

public class Target {

float minTab(float[] tab){
  float min=tab[0];
  for (int i=0; i < tab.length; i++) {
    if (tab[i] < min)     min=tab[i];
  }
  return min;
}
  float __target__(float[] tab){
  float min=tab[0];
  for (int i=0; i <= tab.length; i++) {
    if (tab[i] < min)     min=tab[i];
  }
  return min;
}

}