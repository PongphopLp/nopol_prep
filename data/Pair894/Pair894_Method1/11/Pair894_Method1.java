import java.util.*;

public class Target {

boolean isExtender(char c){
switch (c) {
case 0x00B7:case 0x02D0:case 0x02D1:case 0x0387:case 0x0640:case 0x0E46:case 0x0EC6:case 0x3005:    return true;
default:  if ((c >= 0x3031) && (c <= 0x3035))   return true;
if ((c >= 0x309D) && (c <= 0x309E)) return true;
if ((c >= 0x30FC) && (c <= 0x30FE)) return true;
return false;
}
}
  boolean __target__(char c){
switch (c) {
case 0x00B7:case 0x02D0:case 0x02D1:case 0x0387:case 0x0640:case 0x0E46:case 0x0EC6:case 0x3005:    return true;
default:  if ((c >= 0x3031) && (c <= 0x3035))   return true;
if ((c >= 0x309D) && (c <= 0x309E)) return true;
if ((c > 0x30FC) && (c <= 0x30FE)) return true;
return false;
}
}

}