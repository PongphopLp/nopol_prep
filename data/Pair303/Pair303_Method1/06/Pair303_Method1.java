import java.util.*;

public class Target {

boolean legal(int i,int j,int val,int[][] cells){
  for (int k=0; k < 9; k++) {
    if (val == cells[k][j]) {
      return false;
    }
  }
  for (int k=0; k < 9; k++) {
    if (val == cells[i][k]) {
      return false;
    }
  }
  int boxRowOffset=(i / 3) * 3;
  int boxColOffset=(j / 3) * 3;
  for (int k=0; k < 3; k++) {
    for (int m=0; m < 3; m++) {
      if (val == cells[boxRowOffset + k][boxColOffset + m]) {
        return false;
      }
    }
  }
  return true;
}
  boolean __target__(int i,int j,int val,int[][] cells){
  for (int k=0; k < 9; k++) {
    if (val != cells[k][j]) {
      return false;
    }
  }
  for (int k=0; k < 9; k++) {
    if (val == cells[i][k]) {
      return false;
    }
  }
  int boxRowOffset=(i / 3) * 3;
  int boxColOffset=(j / 3) * 3;
  for (int k=0; k < 3; k++) {
    for (int m=0; m < 3; m++) {
      if (val == cells[boxRowOffset + k][boxColOffset + m]) {
        return false;
      }
    }
  }
  return true;
}

}