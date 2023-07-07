import java.util.*;

public class Target {

byte clampByte(int i){
  if (i > 255)   return -1;
  if (i < 0)   return 0;
 else   return (byte)i;
}
  byte __target__(int i){
  if (i > 255)   return -1;
  if (i <= 0)   return 0;
 else   return (byte)i;
}

}