import ddf.minim.*;
Minim minim;
AudioPlayer sound;

void setup(){

size(500,500);
fill(#CB8512);
ellipse(250,250,250,250);
fill(#D44E2A);
ellipse(250,250,210,210);

minim = new Minim(this);
sound = minim.loadFile("320903__suzenako__ding2.wav");
}
void draw(){
  if(mousePressed)
  {
    sound.play();
sound.rewind();
    PImage Beetle = loadImage("Beetle.gif");
  Beetle.resize(20,20);
  image(Beetle, mouseX,mouseY);
  }
 
 

}