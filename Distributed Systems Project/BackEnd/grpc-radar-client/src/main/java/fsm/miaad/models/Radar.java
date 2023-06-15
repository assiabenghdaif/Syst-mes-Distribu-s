package fsm.miaad.models;


public class Radar {

    private Long id;
    private double maxSpeed;

    public Radar(Long id, double maxSpeed) {
        this.id = id;
        this.maxSpeed = maxSpeed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
