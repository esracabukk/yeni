package threadkontrol;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deniz
 */

class threadOrnek extends Thread
{
    threadOrnek(String isim)
    {
        super(isim);
        start();
        // nesnemizi başlattık
    }
     
    public void run()
    {
