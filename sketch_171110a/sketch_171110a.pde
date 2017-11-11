int x = 50;
int y;
int pipeX = 400;
int pipeX2 = 400;
int width;
int height;
double VelocityY = 0;
double gravity = 0.2;
double VelocityPipe = -1;
double VelocityPipe2 = -1;
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
rect(pipeX,420,50,80);
if(pipeX<0){
  pipeX = 400;
  
}
rect(pipeX2,0,50,300);
pipeX2+=VelocityPipe2;
if(pipeX2<0){
  pipeX2 = 400;
  
}
if(y>500){
y=0;
VelocityY=0;
}



}
void mousePressed(){
 VelocityY-=10; 
}