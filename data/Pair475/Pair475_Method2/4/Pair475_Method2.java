import java.util.*;

public class Target {

int getRounds(int keySize,int blockSize){
switch (keySize) {
case 16:    return (blockSize == 16) ? 10 : ((blockSize == 24) ? 12 : 14);
case 24:  return (blockSize != 32) ? 12 : 14;
default:return 14;
}
}
  int __target__(int keySize,int blockSize){
switch (keySize) {
case 16:    return (blockSize == 16) ? 10 : ((blockSize == 24) ? 12 : 14);
case 24:  return (blockSize != 32) ? 12 : 14;
default:return 0;
}
}

}