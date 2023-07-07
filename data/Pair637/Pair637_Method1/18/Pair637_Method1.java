import java.util.*;

public class Target {

int transformaBytesEmInt(byte[] bytes,int indexIni){
  int resultado=0;
  if (bytes[indexIni] < 0) {
    resultado+=(256 + bytes[indexIni]) * ((int)Math.pow(2,24));
  }
 else {
    resultado+=bytes[indexIni] * ((int)Math.pow(2,24));
  }
  indexIni++;
  if (bytes[indexIni] < 0) {
    resultado+=(256 + bytes[indexIni]) * ((int)Math.pow(2,16));
  }
 else {
    resultado+=bytes[indexIni] * ((int)Math.pow(2,16));
  }
  indexIni++;
  if (bytes[indexIni] < 0) {
    resultado+=(256 + bytes[indexIni]) * ((int)Math.pow(2,8));
  }
 else {
    resultado+=bytes[indexIni] * ((int)Math.pow(2,8));
  }
  indexIni++;
  if (bytes[indexIni] < 0) {
    resultado+=256 + bytes[indexIni];
  }
 else {
    resultado+=bytes[indexIni];
  }
  return resultado;
}
  int __target__(byte[] bytes,int indexIni){
  int resultado=0;
  if (bytes[indexIni] <= 0) {
    resultado+=(256 + bytes[indexIni]) * ((int)Math.pow(2,24));
  }
 else {
    resultado+=bytes[indexIni] * ((int)Math.pow(2,24));
  }
  indexIni++;
  if (bytes[indexIni] < 0) {
    resultado+=(256 + bytes[indexIni]) * ((int)Math.pow(2,16));
  }
 else {
    resultado+=bytes[indexIni] * ((int)Math.pow(2,16));
  }
  indexIni++;
  if (bytes[indexIni] < 0) {
    resultado+=(256 + bytes[indexIni]) * ((int)Math.pow(2,8));
  }
 else {
    resultado+=bytes[indexIni] * ((int)Math.pow(2,8));
  }
  indexIni++;
  if (bytes[indexIni] < 0) {
    resultado+=256 + bytes[indexIni];
  }
 else {
    resultado+=bytes[indexIni];
  }
  return resultado;
}

}