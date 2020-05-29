public class Stap<Type> {
    private double weight;
    private Reis startReis;
    private Reis targetReis;
    private Type type;

    public Stap(double weight, Reis startReis, Reis targetReis) {
        this.weight = weight;
        this.startReis = startReis;
        this.targetReis = targetReis;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Reis getStartReis() {
        return startReis;
    }

    public void setStartReis(Reis startReis) {
        this.startReis = startReis;
    }

    public Reis getTargetReis() {
        return targetReis;
    }

    public void setTargetReis(Reis targetReis) {
        this.targetReis = targetReis;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}