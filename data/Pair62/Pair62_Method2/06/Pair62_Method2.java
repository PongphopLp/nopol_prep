import java.util.*;

public class Target {

String md5ToString(byte[] md5){
  int len=md5.length;
  StringBuffer res=new StringBuffer(len);
  for (int i=0; i < len; ++i) {
    if (md5[i] < 0) {
      res.append(Integer.toHexString(md5[i] + 256));
    }
 else {
      String rs=Integer.toHexString(md5[i]);
      if (rs.length() == 1) {
        res.append('0');
      }
      res.append(rs);
    }
  }
  return res.toString();
}
  String __target__(byte[] md5){
  int len=md5.length;
  StringBuffer res=new StringBuffer(len);
  for (int i=0; i < len; ++i) {
    if (md5[i] < 0) {
      res.append(Integer.toHexString(md5[i] + 256));
    }
 else {
      String rs=Integer.toHexString(md5[i]);
      if (rs.length() == 1) {
      }
      res.append(rs);
    }
  }
  return res.toString();
}

}