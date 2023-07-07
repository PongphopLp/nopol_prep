import java.util.*;

public class Target {

short max(short[] data){
  short max=data[0];
  for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
  return max;
}
  short __target__(short[] data){
  short max=data[0];
  for (int i=1; i < data.length; --i)   if (data[i] > max)   max=data[i];
  return max;
}

}