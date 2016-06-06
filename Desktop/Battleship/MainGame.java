import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Dimension;

public class MainGame
{
    public static int board[][]={
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0}};
    public void draw()
    {
        for(int i=0; i<10; i++){
            for(int j=0;j<10; j++){
                Point(i*10,j*10) = p
                Rectangle bounds = new Rectangle(p,Dimension(10,10));
            }
        }
    }
    public int sampleMethod(int y)
    {
        return x + y;
    }
    public static void main(String args[])
    {
        draw();
    }
}
