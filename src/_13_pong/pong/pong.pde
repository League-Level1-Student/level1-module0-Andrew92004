        import ddf.minim.*;
  Minim minim;
  AudioSample sound;
      PImage backgroundImage;
 int speedx = 5;
 int speedy = 2;
  int ballx = 1;
  int bally = 1;

  int paddleY = 470;
  int paddleLength = 100;
void draw(){
    int paddleX = mouseX;
          sound.trigger();
            image(backgroundImage, 0, 0);
    image(backgroundImage, 0, 0, width, height);
         rect(paddleX, paddleY, paddleLength, 20);

 
 fill(0,0,255);
 stroke(255,255,255);
 ellipse(ballx, bally,20,20);
     ballx = ballx + speedx;
     bally = bally + speedy;
 if (ballx <= 0){
  speedx = -speedx;
 }
 if (ballx >= width){
 speedx = -speedx;
 }
if (bally <= 0){
  speedy = -speedy;
}
if (bally >= height){
speedy = -speedy;
}
if(intersects(ballx,bally,paddleX,paddleY,paddleLength)){

  speedy= -speedy;
}
}
void setup(){
  
 size(500,500);
        minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
      backgroundImage = loadImage("pong.png");
      
}

       boolean intersects(int ballx, int bally, int paddleX, int paddleY, int paddleLength) {
     if (bally > paddleY && ballx > paddleX && ballx < paddleX + paddleLength)
          return true;
     else
          return false;
    }
