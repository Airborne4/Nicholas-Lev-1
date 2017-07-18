
int x=250;
int y=450;
void setup() {
  size(500, 500);
  background(50, 50, 250);
}
void draw() {
  fill(0, 200, 50);  
  ellipse(x, y, 50, 50);
}
void keyPressed()

{

  if (key == CODED) {
    if (keyCode == UP)
    {
      //Frog Y position goes up
      y-=10;
    } else if (keyCode == DOWN)
    {
      y+=10;  
      //Frog Y position goes down
    } else if (keyCode == RIGHT)
    {
      x+=10;
      //Frog X position goes right
    } else if (keyCode == LEFT)
    {
      x-=10;
      //Frog X position goes left
    }
  }
}