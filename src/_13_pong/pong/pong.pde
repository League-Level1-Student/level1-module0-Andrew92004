 int speed = 10;
  int ballx = 1;
  int bally = 0;
void draw(){
   background(0,255,0);
 
 fill(0,0,255);
 stroke(255,255,255);
 ellipse(ballx, bally,50,50);
     ballx = ballx + speed;
    // bally = bally + speed;
 if (ballx <= 0){
  speed = -speed;
 }
 if (ballx >= width){
 speed = -speed;
 }
if (bally <= 0){
  speed = -speed;
}
if (bally >= height){
speed = -speed;
}
}
void setup(){
 size(500,500);

  
}
