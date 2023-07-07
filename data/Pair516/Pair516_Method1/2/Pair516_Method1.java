import java.util.*;

public class Target {

float toFloat(String _data){
  try {
    if (_data == null || _data.length() <= 0)     return 0;
    return Float.parseFloat(_data);
  }
 catch (  Exception err) {
    return 0;
  }
}
  float __target__(String _data){
  try {
    if (_data != null || _data.length() <= 0)     return 0;
    return Float.parseFloat(_data);
  }
 catch (  Exception err) {
    return 0;
  }
}

}