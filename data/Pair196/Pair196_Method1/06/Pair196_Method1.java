import java.util.*;

public class Target {

String toHex(byte[] data,String sep){
  final StringBuffer sb=new StringBuffer();
  for (int i=0; i < data.length; ++i) {
    final int no=data[i] & 0xff;
    if (no < 0x10)     sb.append('0');
    sb.append(Integer.toHexString(no));
    if (sep != null && i < data.length - 1)     sb.append(sep);
  }
  return sb.toString();
}
  String __target__(byte[] data,String sep){
  final StringBuffer sb=new StringBuffer();
  for (int i=0; i <= data.length; ++i) {
    final int no=data[i] & 0xff;
    if (no < 0x10)     sb.append('0');
    sb.append(Integer.toHexString(no));
    if (sep != null && i < data.length - 1)     sb.append(sep);
  }
  return sb.toString();
}

}