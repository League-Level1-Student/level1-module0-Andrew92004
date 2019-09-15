import ddf.minim.*;
PImage pictureOfRecord;   
Minim minim;        //as a member variable
AudioPlayer song;
       int amountToRotate = 0; 
  void rotateImage(PImage image, int amountToRotate) {

        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
      void setup(){
        size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("record.png");      //in setup method
        pictureOfRecord.resize(600,600);     //in setup method
        minim = new Minim(this);    //in the setup method
        song = minim.loadFile("awesomeTrack.mp3", 512);   
}

  void draw(){

          image(pictureOfRecord, 0, 0);  //in draw method
          if (mousePressed){
          rotateImage(pictureOfRecord, amountToRotate);
          amountToRotate = amountToRotate + 10;
          song.play();
          }
          song.pause();
          image(pictureOfRecord,0,0);
          
  }
