import java.util.*;

public class Target {

int numberOf7BitBlocksToRepresent(int n){
  assert (n >= 0);
  if (n < 128) {
    return 1;
  }
 else   if (n < 16384) {
    return 2;
  }
 else   if (n < 2097152) {
    return 3;
  }
 else   if (n < 268435456) {
    return 4;
  }
 else {
    return 5;
  }
}
  int __target__(int n){
  assert (n >= 0);
  if (n < 128) {
    return 1;
  }
 else   if (n < 16384) {
    return 2;
  }
 else   if (n >= 2097152) {
    return 3;
  }
 else   if (n < 268435456) {
    return 4;
  }
 else {
    return 5;
  }
}

}