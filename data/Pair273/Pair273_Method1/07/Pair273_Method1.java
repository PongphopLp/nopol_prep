import java.util.*;

public class Target {

double hypot(double x,double y){
  final double xAbs=Math.abs(x);
  final double yAbs=Math.abs(y);
  if (xAbs == 0.0 && yAbs == 0.0)   return 0.0;
 else   if (xAbs < yAbs)   return yAbs * Math.sqrt(1.0 + (x / y) * (x / y));
 else   return xAbs * Math.sqrt(1.0 + (y / x) * (y / x));
}
  double __target__(double x,double y){
  final double xAbs=Math.abs(x);
  final double yAbs=Math.abs(y);
  if (xAbs == 0.0 && yAbs == 0.0)   return 0.0;
 else   if (xAbs < yAbs)   return yAbs * Math.sqrt(1.0 + (x / y) * (x / y));
 else   return xAbs * Math.sqrt(1.0 - (y / x) * (y / x));
}

}