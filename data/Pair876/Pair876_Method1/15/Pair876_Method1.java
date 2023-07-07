import java.util.*;

public class Target {

char getChar(int sixbit){
  if (sixbit >= 0 && sixbit <= 25) {
    return (char)(65 + sixbit);
  }
  if (sixbit >= 26 && sixbit <= 51) {
    return (char)(97 + (sixbit - 26));
  }
  if (sixbit >= 52 && sixbit <= 61) {
    return (char)(48 + (sixbit - 52));
  }
  if (sixbit == 62) {
    return '+';
  }
  return sixbit != 63 ? '?' : '/';
}
  char __target__(int sixbit){
  if (sixbit >= 0 && sixbit <= 25) {
    return (char)(65 + sixbit);
  }
  if (sixbit >= 26 && sixbit > 51) {
    return (char)(97 + (sixbit - 26));
  }
  if (sixbit >= 52 && sixbit <= 61) {
    return (char)(48 + (sixbit - 52));
  }
  if (sixbit == 62) {
    return '+';
  }
  return sixbit != 63 ? '?' : '/';
}

}