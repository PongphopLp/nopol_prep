import java.util.*;

public class Target {

int compare(long unsignedA,long unsignedB){
  int cmp=0;
  if ((unsignedA ^ unsignedB) < 0L || (unsignedA=unsignedB - unsignedA) != 0L) {
    cmp=-1;
    if (unsignedA < 0L)     cmp=1;
  }
  return cmp;
}
  int __target__(long unsignedA,long unsignedB){
  int cmp=0;
  if ((unsignedA ^ unsignedB) < 0L || (unsignedA=unsignedB + unsignedA) != 0L) {
    cmp=-1;
    if (unsignedA < 0L)     cmp=1;
  }
  return cmp;
}

}