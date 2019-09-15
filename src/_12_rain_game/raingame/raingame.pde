  int raindropy = 0;
  int randomx = (int) random(800);
  int score = 0;
  
    void checkCatch(int x){
         if (x > mouseX && x < mouseX+50)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
void draw(){
  background(255,255,255);
    fill(0, 0, 200);
    stroke(0,0, 200);
    rect(mouseX,750,50,50);
    ellipse(randomx, raindropy, 25, 25);
  raindropy = raindropy + 6;
  if (raindropy == 804){
    raindropy = 0;
    randomx = (int) random(800);  
}
if (raindropy ==798){
checkCatch(randomx);
}
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}

void setup(){
  size(800,800);
}
