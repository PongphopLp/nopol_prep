import java.util.*;

public class Target {

boolean test(int tag,int monat,int jahr){
  if (jahr < 0)   return false;
  if (monat < 1 || monat > 12)   return false;
  if (tag < 1)   return false;
  if (monat == 2) {
    if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
      if (tag > 29)       return false;
    }
 else {
      if (tag > 28)       return false;
    }
  }
 else   if (monat == 4 || monat == 6 || monat == 9 || monat == 11) {
    if (tag > 30)     return false;
  }
 else {
    if (tag > 31)     return false;
  }
  return true;
}
  boolean __target__(int tag,int monat,int jahr){
  if (jahr < 0)   return false;
  if (monat < 1 || monat > 12)   return false;
  if (tag < 1)   return false;
  if (monat == 2) {
    if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
      if (tag > 29)       return false;
    }
 else {
      if (tag > 28)       return false;
    }
  }
 else   if (monat == 4 || monat == 6 || monat == 9 || monat == 11) {
    if (tag > 30)     return false;
  }
 else {
    if (tag <= 31)     return false;
  }
  return true;
}

}