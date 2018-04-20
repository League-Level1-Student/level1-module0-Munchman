int x = 0;
int y = 0;

void setup(){
  size(700,700);
  background(255, 2, 175);
}
void draw(){
   fill(0, 225, 255);
  ellipse(x+=100,y+=100,100,100);
 
  if (y==700){
   stop();
  }
}