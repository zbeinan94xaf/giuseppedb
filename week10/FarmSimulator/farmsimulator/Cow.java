
package farmsimulator;

/**
 *
 * @author giuseppedesantis
 */
 
 import java.util.random;
 
public class Cow implements milkable, alive{
    private String name;
    private int udder;
    private double amountOfMilk;
    private Random rand = new Random();
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(){
        this.udder = 15 + rand.nextInt(40 - 15 + 1);
        int nameIndex = rand.nextInt(NAMES.size());
        this.name = NAMES[nameIndex];
    }
    
    public Cow(String name){
        this.name = name;
        this.udder = 15 + rand.nextInt(40 - 15 + 1);
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getAmount(){
        return this.amountOfMilk;
    }
    
    @Override
    public String toSting(){
        return this.name + " " + this.amountOfMilk + "/" + this.capacity;
    }
    
    @Override
    public double milk(){
        this.amountOfMilk = 0;
        return this.amountOfMilk;
    }
    
    @Override
    public void liveHour(){
        double milkProduced = 0.7 + (2 - 0.7) * rand.nextDouble();
        this.amountOfMilk += milkProduced;
    }
}
