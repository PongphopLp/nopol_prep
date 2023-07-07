import java.util.*;

public class Target {

boolean isFestivalArcher(int npcId){
  if (npcId < 18009 || npcId > 18108)   return false;
  int identifier=npcId % 10;
  return (identifier == 4 || identifier == 9);
}
  boolean __target__(int npcId){
  if (npcId >= 18009 || npcId > 18108)   return false;
  int identifier=npcId % 10;
  return (identifier == 4 || identifier == 9);
}

}