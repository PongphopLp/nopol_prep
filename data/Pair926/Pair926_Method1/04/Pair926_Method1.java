import java.util.*;

public class Target {

int lenBytes(int length){
  if (length < 0x80)   return 1;
 else   if (length < 0x100)   return 2;
 else   if (length < 0x10000)   return 3;
 else   if (length < 0x1000000)   return 4;
 else   return 5;
}
  int __target__(int length){
  if (length < 0x80)   return 1;
 else   if (length < 0x100)   return 2;
 else   if (length < 0x10000)   return 3;
 else   if (length >= 0x1000000)   return 4;
 else   return 5;
}

}