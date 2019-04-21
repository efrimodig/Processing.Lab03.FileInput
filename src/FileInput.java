import ddf.minim.AudioOutput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.*;
/**
 * FileInput is a subclass of Processing applet.
 *    -It will initialize the applet.
 *    -Shapes and text are drawn on the screen.
 *    -Mouse and keyboard input are read in.
 */
public class FileInput extends PApplet
{
    private Minim minim;
    private AudioOutput out;

    private static final int HEIGHT = 400;
    private static final int WIDTH = 400;

    private int white;
    private int black;
    
    private PImage imageOfDog;
    private AudioPlayer soundOfDog;

    /**
     * Launch the Processing Application,
     *     Calls settings() once, then setup() once, then draw() 30 times per second.
     */
    public static void main(String args[]) {
        String packageFilename = "FileInput";
        PApplet.main(new String[] { packageFilename });
    }
    
    /**
     * Sets the Application Properties.
     */
    public void settings() {
        size(WIDTH,HEIGHT); // Set size of screen
    }

    /**
     * Called once at the start
     */
    public void setup() {
        white = color(255,255,255); // (r, g, b) [0, 256)
        black = color(0,0,0);
        
        minim = new Minim(this);
        
        /**
         * TODO 1: Load imageOfDog by calling
         *      loadImage(String filename)
         *      Note: If you place the image in a directory, prepend "../[DirectoryName]/" to filename.
         */
        /**
         * TODO 3: Load soundOfDog by calling 
         *         minim.loadFile(String filename)
         *         Note: If you place the image in a directory, prepend "../[DirectoryName]/" to filename.
         */
    }

    /**
     * Called repeatedly (once per frame)
     */
    public void draw() {
        background(white); // Fill background color with white
        
        if(mousePressed)
        {
            /**
             * TODO 2: display an image by calling 
             *     image(PImage img,
                         float a,
                         float b,
                         float c,
                         float d)
             */
        }
        else
        {
            fill(black);
            noStroke(); // No border on the rectangle
            rect(150,150,125,125); // center x, center y, width, height
        }
    }
    
    /**
     * Handle Mouse Press (Down)
     */
    public void mousePressed() {
        /**
         * TODO 4: Start the sound by calling .play()
         */
        /**
         * TODO 5: Rewind the sound by calling .rewind()
         *         So that it can be played multiple times.
         */
    }
    
    /**
     *  Called once when the program exits
     */
    public void stop()     {
        soundOfDog.close();
        minim.stop();
    }
}
