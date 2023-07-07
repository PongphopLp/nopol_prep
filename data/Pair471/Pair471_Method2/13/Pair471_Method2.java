import java.util.*;

public class Target {

int getMondayDay(int tYear,int tMonth){
  int intDay=30;
  try {
    if (tMonth == 1 || tMonth == 3 || tMonth == 5 || tMonth == 7 || tMonth == 8 || tMonth == 10 || tMonth == 12)     intDay=31;
 else     if (tMonth == 2) {
      if (tYear % 400 == 0 || (tYear % 4 == 0 && tYear % 100 != 0)) {
        intDay=29;
      }
 else       intDay=28;
    }
 else     intDay=30;
  }
 catch (  Exception e) {
    return intDay;
  }
  return intDay;
}
  int __target__(int tYear,int tMonth){
  int intDay=30;
  try {
    if (tMonth == 1 || tMonth == 3 || tMonth == 5 || tMonth == 7 || tMonth == 8 || tMonth == 10 || tMonth == 12)     intDay=31;
 else     if (tMonth == 2) {
      if (tYear % 400 == 0 || (tYear * 4 == 0 && tYear % 100 != 0)) {
        intDay=29;
      }
 else       intDay=28;
    }
 else     intDay=30;
  }
 catch (  Exception e) {
    return intDay;
  }
  return intDay;
}

}