import java.util.*;

public class Target {

int getJ(int[] stateVector,int[] completeVector){
  int index=0;
  int acumulador=1;
  for (int i=stateVector.length - 1; i >= 0; i--) {
    index+=completeVector[i] * acumulador;
    acumulador*=stateVector[i];
  }
  return index;
}
  int __target__(int[] stateVector,int[] completeVector){
  int index=0;
  int acumulador=1;
  for (int i=stateVector.length - 1; i >= 0; i++) {
    index+=completeVector[i] * acumulador;
    acumulador*=stateVector[i];
  }
  return index;
}

}