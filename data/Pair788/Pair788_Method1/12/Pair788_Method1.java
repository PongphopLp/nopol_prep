import java.util.*;

public class Target {

int unsignedVarIntLength(int value){
  if (value < 128) {
    return 1;
  }
 else   if (value < 16384) {
    return 2;
  }
 else   if (value < 2097152) {
    return 3;
  }
 else   if (value < 268435456) {
    return 4;
  }
 else {
    return 5;
  }
}
  int __target__(int value){
  if (value < 128) {
    return 1;
  }
 else   if (value < 16384) {
    return 2;
  }
 else   if (value < 2097152) {
    return 3;
  }
 else   if (value < 268435456) {
    return 0;
  }
 else {
    return 5;
  }
}

}