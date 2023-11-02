import processing.core.PApplet;

public class Sketch extends PApplet {
/**
 * Description: A program to draw 8 different shapes with different colours in 8 different sections using loops.
 * @author: RyanChan25
 *
 */
	
  public void settings() {
	  // Size of the canvas
    size(1200, 600);
  }

  
  public void setup() {
    // Background colour of the canvas.
    background(45, 150, 207);
  }

  
  public void draw() {
	  // Output of the different methods code.
	  draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    // Variables for the X and Y coordinates.
    int intX;
    int intY;
   
    // For loop to draw the squares in a 30x30 square.
    for(int intRow = 0; intRow < 30; intRow ++){
      for(int intColumn = 0; intColumn < 30; intColumn ++){
        intX = 3 + intRow * 10;  
        intY = 300 + 3 + intColumn * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

        
      }
    }
  }

  public void draw_section2(){
    // Variables for the X and Y coordinates and the colour. 
    int intX;
    int intY;
    int intColourX;

    // For loop to draw the squares in a 30x30 square.
    for(int intRow = 0; intRow < 30; intRow ++){
      for(int intColumn = 0; intColumn < 30; intColumn ++){
        intX = 300 + intRow * 10 + 3;  
        intY = 300 + 3 + intColumn * 10; 
        
        // If statement to change the colour of squares if the parameters are met.
        intColourX = intRow % 2;
        if (intColourX != 0) {
          fill(0);
        }
        else{
          fill(255);
        }
        
        noStroke();
        rect(intX, intY, 5, 5);  
        
      }
    }
  }

  
  public void draw_section3(){
    // Variables for the X and Y coordinates and the colour.
    int intX;
    int intY;
    int intColourY;

    // For loop to draw the squares in a 30x30 square.
    for(int intRow = 0; intRow < 30; intRow ++){
      for(int intColumn = 0; intColumn < 30; intColumn ++){
        intX = 600 + intRow * 10 + 3;  
        intY = 300 + 3 + intColumn * 10; 
        
        // If statement to change the colour of squares if the parameters are met or not met.
        intColourY = intColumn % 2;
        if (intColourY != 0) {
          fill(255);
        }
        else{
          fill(0);
        }
        
        noStroke();
        rect(intX, intY, 5, 5);  

      }
    }
  }

  
  public void draw_section4(){
    // Variables for the X and Y coordinates and the colour.
    int intX;
    int intY;
    int intColourX;
    int intColourY;

    // For loop to draw the squares in a 30x30 square.
    for(int intRow = 0; intRow < 30; intRow ++){
      for(int intColumn = 0; intColumn < 30; intColumn ++){
        intX = 900 + intRow * 10 + 3;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + intColumn * 10; //Instead of zero, calculate the proper intY location using 'intColumn'
        
        intColourY = intColumn % 2;
        intColourX = intRow % 2;
       
        // If statement to change the colour of squares if the parameters are met or not met.
        if (intColourY == 0) {
          fill(0);
        }
        else if (intColourX != 0){
          fill(0);
        }
        else{
          fill(255);
        }
        
        noStroke();
        rect(intX, intY, 5, 5);  

        

      }
    }
  }

  
  public void draw_section5(){
    // Variables for the X and Y coordinates.
    int intX;
    int intY;

    // For loop to draw a right angle triangle that is increasing to the right.
    for(int intRow = 0; intRow <= 30; intRow ++){
      for(int intColumn = 0; intColumn <= intRow; intColumn ++){
        intX = 0 + (30 - intColumn) * 10 + 3;  
        intY = 0 + 3 + intRow * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

        
      }
    }

  }

  public void draw_section6(){
    // Variables for the X and Y coordinates.
    int intX;
    int intY;

    // For loop to draw a right angle triangle that is decreasing to the right side.
    for(int intRow = 29; intRow >= 0; intRow --){
      for(int intColumn = 29; intColumn >= intRow; intColumn --){
        intX = 300 + intRow * 10 + 3;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 0 + 3 + intColumn * 10; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

        
      }
    }
  }

  public void draw_section7(){
    // Variables for the X and Y coordinates.
    int intX;
    int intY;

    // For loop to draw a right angle triangle that has been flipped along the X-Axis.
    for(int intRow = 30; intRow >= 0; intRow --){
      for(int intColumn = 30; intColumn > intRow; intColumn --){
        intX = 600 + (30 - intColumn) * 10 + 3;  
        intY = 0 + 3 + intRow * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

        
      }
    }
  }
  
  public void draw_section8(){
    // Variables for the X and Y coordinates.
    int intX;
    int intY;

    // For loop to draw a right angle triangle that is flipped along the X-Axis.
    for(int intRow = 0; intRow < 30; intRow ++){
      for(int intColumn = 0; intColumn <= intRow; intColumn ++){
        intX = 900 + intRow * 10 + 3;  
        intY = 0 + 3 + intColumn * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

        
      }
    }

  }






}
