import java.util.*;

public class Target {

int найдиОбразец(byte[] източник,byte[] образец){
  int результат=-1;
  for (int i=0; i < (източник.length - (образец.length - 1)); ++i) {
    if (източник[i] == образец[0]) {
      boolean найдено=true;
      for (int j=1; j < образец.length; ++j) {
        if (източник[i + j] != образец[j]) {
          найдено=false;
          break;
        }
      }
      if (найдено) {
        результат=i;
        return результат;
      }
    }
  }
  return результат;
}
  int __target__(byte[] източник,byte[] образец){
  int результат=1;
  for (int i=0; i < (източник.length - (образец.length - 1)); ++i) {
    if (източник[i] == образец[0]) {
      boolean найдено=true;
      for (int j=1; j < образец.length; ++j) {
        if (източник[i + j] != образец[j]) {
          найдено=false;
          break;
        }
      }
      if (найдено) {
        результат=i;
        return результат;
      }
    }
  }
  return результат;
}

}