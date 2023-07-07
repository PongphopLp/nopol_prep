import java.util.*;

public class Target {

boolean isCompatibilityChar(char ch){
switch ((ch >> 8) & 0x0ff) {
case 0x00:    return (ch == 0x00aa) || (ch == 0x00b5) || (ch == 0x00ba);
case 0x01:  return ((ch >= 0x0132) && (ch <= 0x0133)) || ((ch >= 0x013f) && (ch <= 0x0140)) || (ch == 0x0149)|| (ch == 0x017f)|| ((ch >= 0x01c4) && (ch <= 0x01cc))|| ((ch >= 0x01f1) && (ch <= 0x01f3));
case 0x02:return ((ch >= 0x02b0) && (ch <= 0x02b8)) || ((ch >= 0x02e0) && (ch <= 0x02e4));
case 0x03:return ch == 0x037a;
case 0x05:return ch == 0x0587;
case 0x0e:return (ch >= 0x0edc) && (ch <= 0x0edd);
case 0x11:return (ch == 0x1101) || (ch == 0x1104) || (ch == 0x1108)|| (ch == 0x110a)|| (ch == 0x110d)|| ((ch >= 0x1113) && (ch <= 0x113b))|| (ch == 0x113d)|| (ch == 0x113f)|| ((ch >= 0x1141) && (ch <= 0x114b))|| (ch == 0x114d)|| (ch == 0x114f)|| ((ch >= 0x1151) && (ch <= 0x1153))|| ((ch >= 0x1156) && (ch <= 0x1158))|| (ch == 0x1162)|| (ch == 0x1164)|| (ch == 0x1166)|| (ch == 0x1168)|| ((ch >= 0x116a) && (ch <= 0x116c))|| ((ch >= 0x116f) && (ch <= 0x1171))|| (ch == 0x1174)|| ((ch >= 0x1176) && (ch <= 0x119d))|| ((ch >= 0x119f) && (ch <= 0x11a2))|| ((ch >= 0x11a9) && (ch <= 0x11aa))|| ((ch >= 0x11ac) && (ch <= 0x11ad))|| ((ch >= 0x11b0) && (ch <= 0x11b6))|| (ch == 0x11b9)|| (ch == 0x11bb)|| ((ch >= 0x11c3) && (ch <= 0x11ea))|| ((ch >= 0x11ec) && (ch <= 0x11ef))|| ((ch >= 0x11f1) && (ch <= 0x11f8));
case 0x20:return ch == 0x207f;
case 0x21:return (ch == 0x2102) || (ch == 0x2107) || ((ch >= 0x210a) && (ch <= 0x2113))|| (ch == 0x2115)|| ((ch >= 0x2118) && (ch <= 0x211d))|| (ch == 0x2124)|| (ch == 0x2128)|| ((ch >= 0x212c) && (ch <= 0x212d))|| ((ch >= 0x212f) && (ch <= 0x2138))|| ((ch >= 0x2160) && (ch <= 0x217f));
case 0x30:return (ch >= 0x309b) && (ch <= 0x309c);
case 0x31:return (ch >= 0x3131) && (ch <= 0x318e);
case 0xf9:case 0xfa:case 0xfb:case 0xfc:case 0xfd:case 0xfe:case 0xff:return true;
default:return false;
}
}
  boolean __target__(char ch){
switch ((ch >> 8) & 0x0ff) {
case 0x00:    return (ch == 0x00aa) || (ch == 0x00b5) || (ch == 0x00ba);
case 0x01:  return ((ch >= 0x0132) && (ch <= 0x0133)) || ((ch >= 0x013f) && (ch <= 0x0140)) || (ch == 0x0149)|| (ch == 0x017f)|| ((ch >= 0x01c4) && (ch <= 0x01cc))|| ((ch >= 0x01f1) && (ch <= 0x01f3));
case 0x02:return ((ch >= 0x02b0) && (ch <= 0x02b8)) || ((ch >= 0x02e0) && (ch <= 0x02e4));
case 0x03:return ch == 0x037a;
case 0x05:return ch == 0x0587;
case 0x0e:return (ch >= 0x0edc) && (ch <= 0x0edd);
case 0x11:return (ch == 0x1101) || (ch == 0x1104) || (ch == 0x1108)|| (ch == 0x110a)|| (ch == 0x110d)|| ((ch >= 0x1113) && (ch <= 0x113b))|| (ch == 0x113d)|| (ch == 0x113f)|| ((ch > 0x1141) && (ch <= 0x114b))|| (ch == 0x114d)|| (ch == 0x114f)|| ((ch >= 0x1151) && (ch <= 0x1153))|| ((ch >= 0x1156) && (ch <= 0x1158))|| (ch == 0x1162)|| (ch == 0x1164)|| (ch == 0x1166)|| (ch == 0x1168)|| ((ch >= 0x116a) && (ch <= 0x116c))|| ((ch >= 0x116f) && (ch <= 0x1171))|| (ch == 0x1174)|| ((ch >= 0x1176) && (ch <= 0x119d))|| ((ch >= 0x119f) && (ch <= 0x11a2))|| ((ch >= 0x11a9) && (ch <= 0x11aa))|| ((ch >= 0x11ac) && (ch <= 0x11ad))|| ((ch >= 0x11b0) && (ch <= 0x11b6))|| (ch == 0x11b9)|| (ch == 0x11bb)|| ((ch >= 0x11c3) && (ch <= 0x11ea))|| ((ch >= 0x11ec) && (ch <= 0x11ef))|| ((ch >= 0x11f1) && (ch <= 0x11f8));
case 0x20:return ch == 0x207f;
case 0x21:return (ch == 0x2102) || (ch == 0x2107) || ((ch >= 0x210a) && (ch <= 0x2113))|| (ch == 0x2115)|| ((ch >= 0x2118) && (ch <= 0x211d))|| (ch == 0x2124)|| (ch == 0x2128)|| ((ch >= 0x212c) && (ch <= 0x212d))|| ((ch >= 0x212f) && (ch <= 0x2138))|| ((ch >= 0x2160) && (ch <= 0x217f));
case 0x30:return (ch >= 0x309b) && (ch <= 0x309c);
case 0x31:return (ch >= 0x3131) && (ch <= 0x318e);
case 0xf9:case 0xfa:case 0xfb:case 0xfc:case 0xfd:case 0xfe:case 0xff:return true;
default:return false;
}
}

}