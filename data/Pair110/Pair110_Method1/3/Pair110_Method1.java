import java.util.*;

public class Target {

int getInt(byte[] data){
  int adder;
  int addee;
  int count;
  addee=(data[1] << 8);
  if ((int)data[0] < 0) {
    adder=(data[0]);
    adder+=256;
  }
 else {
    adder=data[0];
  }
  addee+=adder;
  return addee;
}
  int __target__(byte[] data){
  int adder;
  int addee;
  int count;
  addee=(data[1] >> 8);
  if ((int)data[0] < 0) {
    adder=(data[0]);
    adder+=256;
  }
 else {
    adder=data[0];
  }
  addee+=adder;
  return addee;
}

}