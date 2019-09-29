void draw(){
 float r = random(255);
 float g = random(255);
  float b = random(255);
makeMagical();
  for (int i = 0; i < 300; i++){
    fill(r,g,b);
   float x = getWormX(i);
     float y =  getWormY(i);
  ellipse(x, y, 8,8);
  }
}
void setup(){
      size(1100,1200 );
     background(0, 0, 0);
}
    float frequency = 0.001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
