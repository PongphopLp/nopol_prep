import java.util.*;

public class Target {

byte clampByte(int v){
  if (v > 255) {
    return (byte)255;
  }
 else   if (v < 0) {
    return (byte)0;
  }
 else {
    return (byte)v;
  }
}
  byte __target__(int v){
  if (v > 255) {
    return (byte)255;
  }
 else   if (v >= 0) {
    return (byte)0;
  }
 else {
    return (byte)v;
  }
}

}