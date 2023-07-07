import java.util.*;

public class Target {

double pow(double base,int exponent){
  double product=1.0;
  if (exponent < 0) {
    for (; exponent != 0; exponent++)     product*=base;
    return 1.0 / product;
  }
 else {
    for (; exponent != 0; exponent--)     product*=base;
    return product;
  }
}
  double __target__(double base,int exponent){
  double product=1.0;
  if (exponent < 0) {
    for (; exponent != 0; exponent++)     product*=base;
    return 1.0 / product;
  }
 else {
    for (; exponent != 0; exponent++)     product*=base;
    return product;
  }
}

}