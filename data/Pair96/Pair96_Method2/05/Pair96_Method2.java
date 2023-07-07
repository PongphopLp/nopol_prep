import java.util.*;

public class Target {

String bytes2hex(byte[] _buffer){
  StringBuffer buffer=new StringBuffer();
  for (int i=0; i < _buffer.length; i++) {
    if (_buffer[i] <= 0x0F && _buffer[i] > 0x00)     buffer.append('0');
 else     if (_buffer[i] == 0x00) {
      buffer.append("00");
      continue;
    }
    buffer.append(Integer.toHexString(_buffer[i] & 0xFF).toUpperCase());
  }
  return buffer.toString();
}
  String __target__(byte[] _buffer){
  StringBuffer buffer=new StringBuffer();
  for (int i=0; i <= _buffer.length; i++) {
    if (_buffer[i] <= 0x0F && _buffer[i] > 0x00)     buffer.append('0');
 else     if (_buffer[i] == 0x00) {
      buffer.append("00");
      continue;
    }
    buffer.append(Integer.toHexString(_buffer[i] & 0xFF).toUpperCase());
  }
  return buffer.toString();
}

}