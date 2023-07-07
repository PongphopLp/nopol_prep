import java.util.*;

public class Target {

double power(double base,int exponent){
switch (exponent) {
case 0:    return 1.0;
case 1:  return base;
case 2:return base * base;
case 3:return base * base * base;
case 4:return base * base * base* base;
default:return java.lang.Math.pow(base,exponent);
}
}
  double __target__(double base,int exponent){
switch (exponent) {
case 0:    return 0;
case 1:  return base;
case 2:return base * base;
case 3:return base * base * base;
case 4:return base * base * base* base;
default:return java.lang.Math.pow(base,exponent);
}
}

}