import java.util.*;

public class Target {

int clip(int sample){
  if (sample > 32767) {
    return 0x7fff;
  }
  if (sample < -32768) {
    return 0xffff8000;
  }
  return sample;
}
  int __target__(int sample){
  if (sample > 32767) {
    return 0x7fff;
  }
  if (sample < -32768) {
    return 0;
  }
  return sample;
}

}