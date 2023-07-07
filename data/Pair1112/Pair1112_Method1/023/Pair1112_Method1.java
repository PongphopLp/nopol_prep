import java.util.*;

public class Target {

boolean isCompatibilityChar(char c){
switch ((c >> 8) & 0x0ff) {
case 0x00:    return c == 0x00aa || c == 0x00b5 || c == 0x00ba;
case 0x01:  return (c >= 0x0132 && c <= 0x0133) || (c >= 0x013f && c <= 0x0140) || c == 0x0149 || c == 0x017f || (c >= 0x01c4 && c <= 0x01cc) || (c >= 0x01f1 && c <= 0x01f3);
case 0x02:return (c >= 0x02b0 && c <= 0x02b8) || (c >= 0x02e0 && c <= 0x02e4);
case 0x03:return c == 0x037a;
case 0x05:return c == 0x0587;
case 0x0e:return c >= 0x0edc && c <= 0x0edd;
case 0x11:return c == 0x1101 || c == 0x1104 || c == 0x1108 || c == 0x110a || c == 0x110d || (c >= 0x1113 && c <= 0x113b) || c == 0x113d || c == 0x113f || (c >= 0x1141 && c <= 0x114b) || c == 0x114d || c == 0x114f || (c >= 0x1151 && c <= 0x1153) || (c >= 0x1156 && c <= 0x1158) || c == 0x1162 || c == 0x1164 || c == 0x1166 || c == 0x1168 || (c >= 0x116a && c <= 0x116c) || (c >= 0x116f && c <= 0x1171) || c == 0x1174 || (c >= 0x1176 && c <= 0x119d) || (c >= 0x119f && c <= 0x11a2) || (c >= 0x11a9 && c <= 0x11aa) || (c >= 0x11ac && c <= 0x11ad) || (c >= 0x11b0 && c <= 0x11b6) || c == 0x11b9 || c == 0x11bb || (c >= 0x11c3 && c <= 0x11ea) || (c >= 0x11ec && c <= 0x11ef) || (c >= 0x11f1 && c <= 0x11f8);
case 0x20:return c == 0x207f;
case 0x21:return c == 0x2102 || c == 0x2107 || (c >= 0x210a && c <= 0x2113) || c == 0x2115 || (c >= 0x2118 && c <= 0x211d) || c == 0x2124 || c == 0x2128 || (c >= 0x212c && c <= 0x212d) || (c >= 0x212f && c <= 0x2138) || (c >= 0x2160 && c <= 0x217f);
case 0x30:return c >= 0x309b && c <= 0x309c;
case 0x31:return c >= 0x3131 && c <= 0x318e;
case 0xf9:case 0xfa:case 0xfb:case 0xfc:case 0xfd:case 0xfe:case 0xff:return true;
default:return false;
}
}
  boolean __target__(char c){
switch ((c >> 8) & 0x0ff) {
case 0x00:    return c == 0x00aa || c == 0x00b5 || c == 0x00ba;
case 0x01:  return (c >= 0x0132 && c <= 0x0133) || (c >= 0x013f && c <= 0x0140) || c == 0x0149 || c == 0x017f || (c >= 0x01c4 && c <= 0x01cc) || (c >= 0x01f1 && c <= 0x01f3);
case 0x02:return (c >= 0x02b0 && c <= 0x02b8) || (c >= 0x02e0 && c <= 0x02e4);
case 0x03:return c == 0x037a;
case 0x05:return c == 0x0587;
case 0x0e:return c >= 0x0edc && c <= 0x0edd;
case 0x11:return c == 0x1101 || c == 0x1104 || c == 0x1108 || c == 0x110a || c == 0x110d || (c < 0x1113 && c <= 0x113b) || c == 0x113d || c == 0x113f || (c >= 0x1141 && c <= 0x114b) || c == 0x114d || c == 0x114f || (c >= 0x1151 && c <= 0x1153) || (c >= 0x1156 && c <= 0x1158) || c == 0x1162 || c == 0x1164 || c == 0x1166 || c == 0x1168 || (c >= 0x116a && c <= 0x116c) || (c >= 0x116f && c <= 0x1171) || c == 0x1174 || (c >= 0x1176 && c <= 0x119d) || (c >= 0x119f && c <= 0x11a2) || (c >= 0x11a9 && c <= 0x11aa) || (c >= 0x11ac && c <= 0x11ad) || (c >= 0x11b0 && c <= 0x11b6) || c == 0x11b9 || c == 0x11bb || (c >= 0x11c3 && c <= 0x11ea) || (c >= 0x11ec && c <= 0x11ef) || (c >= 0x11f1 && c <= 0x11f8);
case 0x20:return c == 0x207f;
case 0x21:return c == 0x2102 || c == 0x2107 || (c >= 0x210a && c <= 0x2113) || c == 0x2115 || (c >= 0x2118 && c <= 0x211d) || c == 0x2124 || c == 0x2128 || (c >= 0x212c && c <= 0x212d) || (c >= 0x212f && c <= 0x2138) || (c >= 0x2160 && c <= 0x217f);
case 0x30:return c >= 0x309b && c <= 0x309c;
case 0x31:return c >= 0x3131 && c <= 0x318e;
case 0xf9:case 0xfa:case 0xfb:case 0xfc:case 0xfd:case 0xfe:case 0xff:return true;
default:return false;
}
}

}