import java.util.*;

public class Target {

double getAngle(double xHaarResponse,double yHaarResponse){
  if (xHaarResponse >= 0 && yHaarResponse >= 0)   return Math.atan(yHaarResponse / xHaarResponse);
  if (xHaarResponse < 0 && yHaarResponse >= 0)   return Math.PI - Math.atan(-yHaarResponse / xHaarResponse);
  if (xHaarResponse < 0 && yHaarResponse < 0)   return Math.PI + Math.atan(yHaarResponse / xHaarResponse);
  if (xHaarResponse >= 0 && yHaarResponse < 0)   return 2 * Math.PI - Math.atan(-yHaarResponse / xHaarResponse);
  return 0;
}
  double __target__(double xHaarResponse,double yHaarResponse){
  if (xHaarResponse >= 0 && yHaarResponse >= 0)   return Math.atan(yHaarResponse / xHaarResponse);
  if (xHaarResponse < 0 && yHaarResponse >= 0)   return Math.PI - Math.atan(-yHaarResponse / xHaarResponse);
  if (xHaarResponse < 0 && yHaarResponse < 0)   return Math.PI + Math.atan(yHaarResponse / xHaarResponse);
  if (xHaarResponse >= 0 && yHaarResponse <= 0)   return 2 * Math.PI - Math.atan(-yHaarResponse / xHaarResponse);
  return 0;
}

}