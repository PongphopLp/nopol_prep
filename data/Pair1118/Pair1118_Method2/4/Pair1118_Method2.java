import java.util.*;

public class Target {

String truncate(String _string,int _len,String _append){
  StringBuffer _buffer=new StringBuffer(_string);
  if (_string.length() > _len) {
    _buffer.setLength(_len);
    String _truncated_string=_buffer.toString();
    if (_append != null)     _truncated_string+=_append;
    return _truncated_string;
  }
  return _string;
}
  String __target__(String _string,int _len,String _append){
  StringBuffer _buffer=new StringBuffer(_string);
  if (_string.length() > _len) {
    String _truncated_string=_buffer.toString();
    if (_append != null)     _truncated_string+=_append;
    return _truncated_string;
  }
  return _string;
}

}