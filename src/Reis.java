import java.util.ArrayList;
import java.util.List;

public class Reis implements Comparable<Reis> {
    private String name;
    private List<Stap> staps;
    private boolean visited;
    private Reis previosReis;
    private double minDistance = Double.MAX_VALUE;

    public Reis(String name) {
        this.name = name;
        this.staps = new ArrayList<>();
    }

    public void addNeighbour(Stap stap) {
        this.staps.add(stap);
    }

    public List<Stap> getStaps() {
        return staps;
    }

    public void setStaps(List<Stap> staps) {
        this.staps = staps;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Reis getPreviosReis() {
        return previosReis;
    }

    public void setPreviosReis(Reis previosReis) {
        this.previosReis = previosReis;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Reis otherReis) {
        return Double.compare(this.minDistance, otherReis.minDistance);
    }
}