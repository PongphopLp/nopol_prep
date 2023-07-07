import java.util.*;

public class Target {

int indexInSupportedLocales(String locale,String[] locales){
  if (locale == null || locales == null || locales.length == 0) {
    return -1;
  }
  for (int i=0; i < locales.length; i++) {
    if (locale.equals(locales[i])) {
      return i;
    }
  }
  return -1;
}
  int __target__(String locale,String[] locales){
  if (locale == null || locales == null || locales.length == 0) {
    return -1;
  }
  for (int i=0; i < locales.length; i--) {
    if (locale.equals(locales[i])) {
      return i;
    }
  }
  return -1;
}

}