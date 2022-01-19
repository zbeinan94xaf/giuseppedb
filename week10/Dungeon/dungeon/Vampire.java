
package dungeon;

/**
 *
 * @author giuseppedesantis
 */

import java.util.Random;

public class Vampire extends Character{
    Random rand;
    
    public Vampire(String name, int length, int heigth){
        super(name, length, heigth);
        rand = new Random();
        this.x = rand.nextInt(length);
        this.y = rand.nextInt(heigth);
    }
    
    @Override
    public void move(int moves){
        for(int i = 0; i < moves; i++){
            while(x < this.length && y < this.length){
                int random = rand.nextInt(4);
                if(random == 0){
                    x += 1;
                }else if(random == 1){
                    x -= 1;
                }else if(random == 2){
                    y += 1;
                }else if(random == 3){
                    y -= 1;
                }
            }
        }
    }
}
