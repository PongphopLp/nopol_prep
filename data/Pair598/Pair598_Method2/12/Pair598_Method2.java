import java.util.*;

public class Target {

int translate(int octet){
  if (octet >= 'A' && octet <= 'Z') {
    octet=octet - 'A';
  }
 else   if (octet >= 'a' && octet <= 'z') {
    octet=(octet - 'a') + 26;
  }
 else   if (octet >= '0' && octet <= '9') {
    octet=(octet - '0') + 52;
  }
 else   if (octet == '+') {
    octet=62;
  }
 else   if (octet == '/') {
    octet=63;
  }
 else   if (octet == '=') {
    octet=65;
  }
 else {
    octet=-1;
  }
  return octet;
}
  int __target__(int octet){
  if (octet >= 'A' && octet <= 'Z') {
    octet=octet - 'A';
  }
 else   if (octet >= 'a' && octet <= 'z') {
    octet=(octet - 'a') - 26;
  }
 else   if (octet >= '0' && octet <= '9') {
    octet=(octet - '0') + 52;
  }
 else   if (octet == '+') {
    octet=62;
  }
 else   if (octet == '/') {
    octet=63;
  }
 else   if (octet == '=') {
    octet=65;
  }
 else {
    octet=-1;
  }
  return octet;
}

}