import java.util.*;

public class Target {

int check(int val){
  if (val > 32767)   val=32767;
  if (val < -32768)   val=-32768;
  if (val < 0)   val=val | 0x8000;
  return val;
}
  int __target__(int val){
  if (val > 32767)   val=32767;
  if (val < -32768)   val=-32768;
  if (val < 0)   val=val & 0x8000;
  return val;
}

}