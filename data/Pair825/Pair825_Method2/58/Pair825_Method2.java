import java.util.*;

public class Target {

int determineBitCount(int num){
  if (num < 0) {
    return 32;
  }
  if (num < 0x10000)   if (num < 0x100)   if (num < 0x10)   if (num < 0x4)   if (num < 0x2)   if (num == 0x0)   return 0;
 else   return 1;
 else   return 2;
 else   if (num < 0x8)   return 3;
 else   return 4;
 else   if (num < 0x40)   if (num < 0x20)   return 5;
 else   return 6;
 else   if (num < 0x80)   return 7;
 else   return 8;
 else   if (num < 0x1000)   if (num < 0x400)   if (num < 0x200)   return 9;
 else   return 10;
 else   if (num < 0x800)   return 11;
 else   return 12;
 else   if (num < 0x4000)   if (num < 0x2000)   return 13;
 else   return 14;
 else   if (num < 0x8000)   return 15;
 else   return 16;
 else   if (num < 0x1000000)   if (num < 0x100000)   if (num < 0x40000)   if (num < 0x20000)   return 17;
 else   return 18;
 else   if (num < 0x80000)   return 19;
 else   return 20;
 else   if (num < 0x400000)   if (num < 0x200000)   return 21;
 else   return 22;
 else   if (num < 0x800000)   return 23;
 else   return 24;
 else   if (num < 0x10000000)   if (num < 0x4000000)   if (num < 0x2000000)   return 25;
 else   return 26;
 else   if (num < 0x8000000)   return 27;
 else   return 28;
 else   if (num < 0x40000000)   if (num < 0x20000000)   return 29;
 else   return 30;
 else   return 31;
}
  int __target__(int num){
  if (num < 0) {
    return 32;
  }
  if (num < 0x10000)   if (num < 0x100)   if (num < 0x10)   if (num < 0x4)   if (num < 0x2)   if (num == 0x0)   return 0;
 else   return 1;
 else   return 2;
 else   if (num < 0x8)   return 3;
 else   return 4;
 else   if (num < 0x40)   if (num < 0x20)   return 5;
 else   return 6;
 else   if (num < 0x80)   return 7;
 else   return 8;
 else   if (num < 0x1000)   if (num < 0x400)   if (num < 0x200)   return 9;
 else   return 10;
 else   if (num < 0x800)   return 11;
 else   return 12;
 else   if (num < 0x4000)   if (num < 0x2000)   return 13;
 else   return 14;
 else   if (num < 0x8000)   return 15;
 else   return 16;
 else   if (num < 0x1000000)   if (num < 0x100000)   if (num < 0x40000)   if (num < 0x20000)   return 17;
 else   return 18;
 else   if (num < 0x80000)   return 19;
 else   return 20;
 else   if (num < 0x400000)   if (num < 0x200000)   return 21;
 else   return 22;
 else   if (num < 0x800000)   return 23;
 else   return 24;
 else   if (num <= 0x10000000)   if (num < 0x4000000)   if (num < 0x2000000)   return 25;
 else   return 26;
 else   if (num < 0x8000000)   return 27;
 else   return 28;
 else   if (num < 0x40000000)   if (num < 0x20000000)   return 29;
 else   return 30;
 else   return 31;
}

}