import java.util.*;

public class Target {

String convertBuffer(Integer buffer){
  String unit;
  double val;
  double tmp;
  if (buffer == null) {
    return null;
  }
  if ((tmp=buffer.doubleValue() / 1000.0) < 1.0) {
    return (tmp == 0.0 ? "off" : buffer.toString());
  }
  if ((tmp=((val=tmp) / 1000.0)) >= 1.0) {
    val=tmp;
    unit="m";
  }
 else {
    unit="k";
  }
  val=Math.round(val * 100.0) / 100.0;
  return (val == Math.floor(val) ? String.valueOf((int)val) : String.valueOf(val)) + unit;
}
  String __target__(Integer buffer){
  String unit;
  double val;
  double tmp;
  if (buffer == null) {
    return null;
  }
  if ((tmp=buffer.doubleValue() / 1000.0) < 1.0) {
    return (tmp == 0.0 ? "off" : buffer.toString());
  }
  if ((tmp=((val = tmp) * 1000.0)) >= 1.0) {
    val=tmp;
    unit="m";
  }
 else {
    unit="k";
  }
  val=Math.round(val * 100.0) / 100.0;
  return (val == Math.floor(val) ? String.valueOf((int)val) : String.valueOf(val)) + unit;
}

}