import java.util.*;

public class Target {

double toDouble(String _data){
  try {
    if (_data == null || _data.length() <= 0)     return 0;
    return Double.parseDouble(_data);
  }
 catch (  Exception err) {
    return 0;
  }
}
  double __target__(String _data){
  try {
    if (_data == null || _data.length() < 0)     return 0;
    return Double.parseDouble(_data);
  }
 catch (  Exception err) {
    return 0;
  }
}

}