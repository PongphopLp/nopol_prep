import java.util.*;

public class Target {

int getInt(byte bytes[]){
  int i=0;
  int j=24;
  for (int k=0; j >= 0; k++) {
    int l=bytes[k] & 0xff;
    i+=l << j;
    j-=8;
  }
  return i;
}
  int __target__(byte bytes[]){
  int i=0;
  int j=24;
  for (int k=0; j < 0; k++) {
    int l=bytes[k] & 0xff;
    i+=l << j;
    j-=8;
  }
  return i;
}

}