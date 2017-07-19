Car c1=new Car(500, 50, 100, 5);
Car c2=new Car(0, 150, 50, 10);
Car c3=new Car(500, 340, 200, 3);
Car c4=new Car(0, 250, 115, 6);
int x=250;
int y=450;

void setup() {
  size(500, 500);
}
void draw() {
  background(50, 50, 250);
  fill(0, 200, 50);  
  ellipse(x, y, 35, 35);
  c1.display();
  c2.display();
  c3.display();
  c4.display();
  c1.carMove();
  c2.carMoveR();
  c3.carMove();
  c4.carMoveR();
  if(y==490){
    text("Congrats! You Win!",100,100);
    textSize(200);
    
  }
}
public class Car {

  int X;
  int Y;
  int Size;
  int Speed;



  public Car(int X, int Y, int Size, int Speed) {

    this.X=X;
    this.Y=Y;
    this.Size=Size;
    this.Speed=Speed;
  }

  void display() 
  {
    fill(200, 0, 0);
    rect(X, Y, Size, 50);
  }

  void carMove() {
    X-=Speed;
    if (X<=0) {
      X=500;
    }
  }
 void carMoveR() {
    X+=Speed;
    if (X>=500) {
      X=0;
    }
  }

}



void keyPressed()

{

  if (key == CODED) {
    if (keyCode == UP)
    {
      //Frog Y position goes up
      y-=20;
    } else if (keyCode == DOWN)
    {
      y+=20;  
      //Frog Y position goes down
    } else if (keyCode == RIGHT)
    {
      x+=20;
      //Frog X position goes right
    } else if (keyCode == LEFT)
    {
      x-=20;
      //Frog X position goes left
    }
  }
}