import java.util.*;

public class Target {

boolean checkPrime(int i){
switch (i) {
case 1:    return false;
case 2:  return true;
}
if (i % 2 == 0) {
return false;
}
for (int c=3; c <= Math.sqrt(i); c+=2) {
if (i % c == 0) {
  return false;
}
}
return true;
}
  boolean __target__(int i){
switch (i) {
case 1:    return false;
case 2:  return true;
}
if (i % 2 == 0) {
return false;
}
for (int c=3; c > Math.sqrt(i); c+=2) {
if (i % c == 0) {
  return false;
}
}
return true;
}

}