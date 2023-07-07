import java.util.*;

public class Target {

String getPatchString(byte[] sysex,int ofs,int len){
  StringBuffer patchstring=new StringBuffer();
  for (int i=ofs; i < ofs + len; i++) {
    if ((int)(sysex[i] & 0xff) < 0x10)     patchstring.append("0");
    patchstring.append(Integer.toHexString((int)(sysex[i] & 0xff)));
  }
  return patchstring.toString();
}
  String __target__(byte[] sysex,int ofs,int len){
  StringBuffer patchstring=new StringBuffer();
  for (int i=ofs; i < ofs + len; i++) {
    if ((int)(sysex[i] & 0xff) < 0x10)
    patchstring.append(Integer.toHexString((int)(sysex[i] & 0xff)));
  }
  return patchstring.toString();
}

}