import java.util.*;

public class Target {

char getUTMZoneLetter(double latitude){
  char zoneLetter='Z';
  if (84 >= latitude && latitude >= 72) {
    zoneLetter='X';
  }
 else   if (72 > latitude && latitude >= 64) {
    zoneLetter='W';
  }
 else   if (64 > latitude && latitude >= 56) {
    zoneLetter='V';
  }
 else   if (56 > latitude && latitude >= 48) {
    zoneLetter='U';
  }
 else   if (48 > latitude && latitude >= 40) {
    zoneLetter='T';
  }
 else   if (40 > latitude && latitude >= 32) {
    zoneLetter='S';
  }
 else   if (32 > latitude && latitude >= 24) {
    zoneLetter='R';
  }
 else   if (24 > latitude && latitude >= 16) {
    zoneLetter='Q';
  }
 else   if (16 > latitude && latitude >= 8) {
    zoneLetter='P';
  }
 else   if (8 > latitude && latitude >= 0) {
    zoneLetter='N';
  }
 else   if (0 > latitude && latitude >= -8) {
    zoneLetter='M';
  }
 else   if (-8 > latitude && latitude >= -16) {
    zoneLetter='L';
  }
 else   if (-16 > latitude && latitude >= -24) {
    zoneLetter='K';
  }
 else   if (-24 > latitude && latitude >= -32) {
    zoneLetter='J';
  }
 else   if (-32 > latitude && latitude >= -40) {
    zoneLetter='H';
  }
 else   if (-40 > latitude && latitude >= -48) {
    zoneLetter='G';
  }
 else   if (-48 > latitude && latitude >= -56) {
    zoneLetter='F';
  }
 else   if (-56 > latitude && latitude >= -64) {
    zoneLetter='E';
  }
 else   if (-64 > latitude && latitude >= -72) {
    zoneLetter='D';
  }
 else   if (-72 > latitude && latitude >= -80) {
    zoneLetter='C';
  }
  return zoneLetter;
}
  char __target__(double latitude){
  char zoneLetter='Z';
  if (84 >= latitude && latitude >= 72) {
    zoneLetter='X';
  }
 else   if (72 > latitude && latitude >= 64) {
    zoneLetter='W';
  }
 else   if (64 > latitude && latitude >= 56) {
    zoneLetter='V';
  }
 else   if (56 > latitude && latitude >= 48) {
    zoneLetter='U';
  }
 else   if (48 > latitude && latitude >= 40) {
    zoneLetter='T';
  }
 else   if (40 > latitude && latitude >= 32) {
    zoneLetter='S';
  }
 else   if (32 > latitude && latitude >= 24) {
    zoneLetter='R';
  }
 else   if (24 > latitude && latitude >= 16) {
    zoneLetter='Q';
  }
 else   if (16 > latitude && latitude >= 8) {
    zoneLetter='P';
  }
 else   if (8 > latitude && latitude >= 0) {
    zoneLetter='N';
  }
 else   if (0 > latitude && latitude >= -8) {
    zoneLetter='M';
  }
 else   if (-8 > latitude && latitude >= -16) {
    zoneLetter='L';
  }
 else   if (-16 > latitude && latitude >= -24) {
    zoneLetter='K';
  }
 else   if (-24 > latitude && latitude >= -32) {
    zoneLetter='J';
  }
 else   if (-32 > latitude && latitude >= -40) {
    zoneLetter='H';
  }
 else   if (-40 > latitude && latitude >= 48) {
    zoneLetter='G';
  }
 else   if (-48 > latitude && latitude >= -56) {
    zoneLetter='F';
  }
 else   if (-56 > latitude && latitude >= -64) {
    zoneLetter='E';
  }
 else   if (-64 > latitude && latitude >= -72) {
    zoneLetter='D';
  }
 else   if (-72 > latitude && latitude >= -80) {
    zoneLetter='C';
  }
  return zoneLetter;
}

}