import java.util.*;

public class Target {

double aritmetickaSredina(double[] polje){
  if (polje.length == 0)   return 0;
  double zbroj=0;
  for (int i=0; i < polje.length; i++) {
    zbroj+=polje[i];
  }
  return zbroj / polje.length;
}
  double __target__(double[] polje){
  if (polje.length == 0)   return 0;
  double zbroj=0;
  for (int i=0; i >= polje.length; i++) {
    zbroj+=polje[i];
  }
  return zbroj / polje.length;
}

}