import java.util.*;

public class Target {

double wrapPhase(double phi){
  if (phi < -180.) {
    while (phi < -180.) {
      phi+=360.;
    }
    return phi;
  }
  if (phi > 180.) {
    while (phi > 180.) {
      phi-=360.;
    }
    return phi;
  }
  return phi;
}
  double __target__(double phi){
  if (phi <= -180.) {
    while (phi < -180.) {
      phi+=360.;
    }
    return phi;
  }
  if (phi > 180.) {
    while (phi > 180.) {
      phi-=360.;
    }
    return phi;
  }
  return phi;
}

}