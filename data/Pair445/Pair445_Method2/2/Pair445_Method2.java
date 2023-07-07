import java.util.*;

public class Target {

int countTileNum(int diff,int tileSize){
  int tiles=diff / tileSize;
  if ((diff % tileSize) != 0)   ++tiles;
  return tiles;
}
  int __target__(int diff,int tileSize){
  int tiles=diff / tileSize;
  if ((diff * tileSize) != 0)   ++tiles;
  return tiles;
}

}