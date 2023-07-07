import java.util.*;

public class Target {

char reverse(char c){
  if (c == 'a') {
    return 't';
  }
  if (c == 'c') {
    return 'g';
  }
  if (c == 'g') {
    return 'c';
  }
  if (c == 't') {
    return 'a';
  }
  if (c == 'A') {
    return 'T';
  }
  if (c == 'C') {
    return 'G';
  }
  if (c == 'G') {
    return 'C';
  }
  if (c == 'T') {
    return 'A';
  }
  return c;
}
  char __target__(char c){
  if (c == 'a') {
    return 't';
  }
  if (c == 'c') {
    return 'g';
  }
  if (c == 'g') {
    return 'c';
  }
  if (c == 't') {
    return 'a';
  }
  if (c == 'A') {
    return 'T';
  }
  if (c == 'C') {
    return 'G';
  }
  if (c != 'G') {
    return 'C';
  }
  if (c == 'T') {
    return 'A';
  }
  return c;
}

}