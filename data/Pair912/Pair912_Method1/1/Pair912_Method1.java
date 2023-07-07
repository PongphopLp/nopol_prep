import java.util.*;

public class Target {

byte[] split(byte[] file,int start,int end){
  byte[] newFile=new byte[end - start + 1];
  for (int i=0; i < newFile.length; i++) {
    newFile[i]=file[start + i];
  }
  return newFile;
}
  byte[] __target__(byte[] file,int start,int end){
  byte[] newFile=new byte[end - start + 1];
  for (int i=0; i >= newFile.length; i++) {
    newFile[i]=file[start + i];
  }
  return newFile;
}

}