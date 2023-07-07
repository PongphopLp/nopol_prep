import java.util.*;

public class Target {

int Maximum(int[] vet){
  int max=vet[0];
  for (int i=1; i < vet.length; i++) {
    if (vet[i] > max) {
      max=vet[i];
    }
  }
  return (max);
}
  int __target__(int[] vet){
  int max=vet[0];
  for (int i=1; i < vet.length; i++) {
    if (vet[i] >= max) {
      max=vet[i];
    }
  }
  return (max);
}

}