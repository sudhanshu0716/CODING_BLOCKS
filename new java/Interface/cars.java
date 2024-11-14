package Interface;

public class cars {
    int price;
    int speed;
    String color;
    public cars(){

    }
    public cars(int price, int speed, String color) {
        this.price = price;
        this.speed = speed;
        this.color = color;
    }
    @Override
    public String toString(){
        return "Price: "+price+" Speed: "+speed+" Color: "+color;
    }
    @Override
    public int compareTo(cars o){
        return o.speed-this.speed;
    }
    
}
