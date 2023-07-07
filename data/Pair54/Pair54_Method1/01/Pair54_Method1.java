import java.util.*;

public class Target {

boolean clip(float denom,float numer,float[] t){
  if (denom > 0.0f) {
    if (numer > denom * t[1])     return false;
    if (numer > denom * t[0])     t[0]=numer / denom;
    return true;
  }
 else   if (denom < 0.0f) {
    if (numer > denom * t[0])     return false;
    if (numer > denom * t[1])     t[1]=numer / denom;
    return true;
  }
 else {
    return numer <= 0.0;
  }
}
  boolean __target__(float denom,float numer,float[] t){
  if (denom >= 0.0f) {
    if (numer > denom * t[1])     return false;
    if (numer > denom * t[0])     t[0]=numer / denom;
    return true;
  }
 else   if (denom < 0.0f) {
    if (numer > denom * t[0])     return false;
    if (numer > denom * t[1])     t[1]=numer / denom;
    return true;
  }
 else {
    return numer <= 0.0;
  }
}

}