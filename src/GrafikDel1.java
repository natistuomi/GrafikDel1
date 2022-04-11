import javax.swing.*;
import java.awt.*;

public class GrafikDel1 extends Canvas {
    private final int height = 600;
    private final int width = 800;

    public GrafikDel1() {
        JFrame frame = new JFrame("Del 1");
        this.setSize(width, height);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GrafikDel1 exempel = new GrafikDel1();
    }

    public void paint(Graphics g){
        drawHouse(g, 300, 200);
        drawTreeArea(g, 10, 280, 440);
        drawTreeArea(g, 470, 700, 440);
    }

    private void drawTreeArea(Graphics g, int x, int x2, int y){
        for(int i = 0; i < x2/30; i++){
            drawTree(g, x+(i*30), y);
        }
    }

    private void drawTree(Graphics g, int x, int y){
        double rand = Math.random()*10;
        g.setColor(new Color(0x460D0D));
        g.fillRect(x+12, y+35, 6, 25);
        if(rand > 3 && rand < 6){
            g.setColor(new Color(0x185725));
        }
        else if(rand <= 3){
            g.setColor(new Color(0x2B8C25));
        }
        else{
            g.setColor(new Color(0x838C25));
        }
        g.fillOval(x, y, 30, 40);
    }

    private void drawHouse(Graphics g, int x, int y){
        g.setColor(Color.black);
        g.fillRect(x, y, 150, 300);
        drawWindows(g, x, y);
    }

    private void drawWindows(Graphics g, int x, int y){
        double rand;
        for(int i = 0; i < 6; i++){
            for(int a = 0; a < 3; a++){
                if(i == 5 && a == 1){
                    g.setColor(Color.white);
                    g.drawRect(x+10+(a*50), y+10+(i*50), 30, 40);
                }
                else{
                    rand = Math.random()*10;
                    if(rand <= 5){
                        g.setColor(Color.yellow);
                        g.fillRect(x+15+(a*50), y+15+(i*50), 20, 20);
                    }
                    else{
                        g.setColor(Color.white);
                        g.drawRect(x+15+(a*50), y+15+(i*50), 20, 20);
                    }
                }
            }
        }
    }

}
