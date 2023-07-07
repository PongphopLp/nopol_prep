import java.util.*;

public class Target {

float collapse(float[] chan){
  float v=chan[0];
  for (int i=0; i < chan.length; i++)   v=Math.min(v,chan[i]);
  return v;
}
  float __target__(float[] chan){
  float v=chan[0];
  for (int i=0; i < chan.length; i--)   v=Math.min(v,chan[i]);
  return v;
}

}