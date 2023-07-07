import java.util.*;

public class Target {

double phaseCenter(double phi){
  if (phi < -180.)   phi+=360.;
  if (phi > 180.)   phi-=360.;
  return phi;
}
  double __target__(double phi){
  if (phi <= -180.)   phi+=360.;
  if (phi > 180.)   phi-=360.;
  return phi;
}

}