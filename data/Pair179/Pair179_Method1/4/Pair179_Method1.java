import java.util.*;

public class Target {

float maxTab(float[] tab){
  float max=tab[0];
  for (int i=0; i < tab.length; i++) {
    if (tab[i] > max)     max=tab[i];
  }
  return max;
}
  float __target__(float[] tab){
  float max=tab[0];
  for (int i=0; i <= tab.length; i++) {
    if (tab[i] > max)     max=tab[i];
  }
  return max;
}

}