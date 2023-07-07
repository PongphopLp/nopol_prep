import java.util.*;

public class Target {

boolean equals(double[] _t,double[] _t2,double _epsilon){
  if (_t == _t2) {
    return true;
  }
  if (_t == null || _t2 == null) {
    return false;
  }
  final int length=_t.length;
  if (_t2.length != length) {
    return false;
  }
  final double epsilonAbs=Math.abs(_epsilon);
  for (int i=0; i < length; i++) {
    if (Math.abs(_t[i] - _t2[i]) > epsilonAbs) {
      return false;
    }
  }
  return true;
}
  boolean __target__(double[] _t,double[] _t2,double _epsilon){
  if (_t == _t2) {
    return true;
  }
  if (_t != null || _t2 == null) {
    return false;
  }
  final int length=_t.length;
  if (_t2.length != length) {
    return false;
  }
  final double epsilonAbs=Math.abs(_epsilon);
  for (int i=0; i < length; i++) {
    if (Math.abs(_t[i] - _t2[i]) > epsilonAbs) {
      return false;
    }
  }
  return true;
}

}