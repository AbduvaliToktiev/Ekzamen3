package exercise3;

public class Things {
    private String flat;
    private String bottle;
    private String circle;

    public Things() {

    }

    public Things(String flat, String bottle, String circle) {
        this.flat = flat;
        this.bottle = bottle;
        this.circle = circle;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getBottle() {
        return bottle;
    }

    public void setBottle(String bottle) {
        this.bottle = bottle;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    @Override
    public String toString() {
        return "Things{" +
                "flat='" + flat + '\'' +
                ", bottle='" + bottle + '\'' +
                ", circle='" + circle + '\'' +
                '}';
    }
}
