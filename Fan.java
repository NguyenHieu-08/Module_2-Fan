public class Fan {

    private final int SLOW;
    private final int MEDIUM;
    private final int FAST;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.SLOW = 1;
        this.MEDIUM = 2;
        this.FAST = 3;
        this.speed = this.SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    //Getter & Setter
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String checkFanStatus() {
        if(this.on == true) return "Fan is on";
        else return "Fan is off"; 
    }

    public String checkSpeed() {
        if(this.speed == this.SLOW) return "SLOW";
        else if (this.speed == this.MEDIUM) return "MEDIUM";
        else if (this.speed == this.FAST) return "FAST";
        else return "FAN iS BROKEN";
    }

    @Override
    public String toString() {
        return "Fan has speed: "+ checkSpeed() + ", color: " + color + ", radius: " + radius + ", fan status: " + checkFanStatus();
    }
}