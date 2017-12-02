int space=50;
int pipeY=420;
int pipeY2=0;
int x = 50;
int y;
int pipeX = 400;
int pipeX2 = 400;
int width;
int height;
int widthP;
int heightP = 80;
int widthP2;
int heightP2;
double VelocityY = 0;
double gravity = 0.2;
double VelocityPipe = -1;
double VelocityPipe2 = -1;
int newHeight=200;
int newYGap=150;
void setup(){
  size(400,500);
width=30;
height=30;
}
void draw(){
  background(0,200,50);
  VelocityY+=gravity;
  y+=VelocityY;
  pipeX+=VelocityPipe;
  ellipse(x,y,width,height);
rect(pipeX,0,50,newHeight);
if(pipeX<0){
  pipeX = 400;
  
}
rect(pipeX2,newHeight+newYGap,50,heightP+180);
pipeX2+=VelocityPipe2;
if(pipeX2<0){
  pipeX2 = 400;
 int random=(int)random(100,400);
newHeight = random;
 
}
if(y>500){
y=0;
VelocityY=0;
}



}
void mousePressed(){
 VelocityY-=10; 
}