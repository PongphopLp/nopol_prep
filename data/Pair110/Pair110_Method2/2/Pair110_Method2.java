import java.util.*;

public class Target {

int bytesToInt(byte[] bytes){
  int adder, addee;
  addee=(bytes[1] << 8);
  if ((int)bytes[0] < 0) {
    adder=(bytes[0]);
    adder+=256;
  }
 else {
    adder=bytes[0];
  }
  addee+=adder;
  return addee;
}
  int __target__(byte[] bytes){
  int adder, addee;
  addee=(bytes[1] >> 8);
  if ((int)bytes[0] < 0) {
    adder=(bytes[0]);
    adder+=256;
  }
 else {
    adder=bytes[0];
  }
  addee+=adder;
  return addee;
}

}