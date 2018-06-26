
void setup()
{
  size(500,500);
  PImage face  = loadImage("orange.jpg"); 
  face.resize(500,500);
 image(face, 0, 0);

}
void draw()
{
  System.out.println(mouseX); 
 System.out.println(mouseY);
 
ellipse(140,188,40,10);
}