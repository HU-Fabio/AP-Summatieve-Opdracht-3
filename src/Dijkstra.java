import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    public Stap sourceStap;

    public void computePath(Reis sourceReis) {
        sourceReis.setMinDistance(0);
        PriorityQueue<Reis> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceReis);

        while (!priorityQueue.isEmpty()) {
            Reis reis = priorityQueue.poll();

            for (Stap stap : reis.getStaps()) {
                Reis v = stap.getTargetReis();
//                Vertex u = edge.getStartVertex();
                double minDistance = 0;

//              Convert to source node type
                if (reis.getMinDistance() != 0) {
                    if (stap.getType() instanceof Rit && sourceStap.getType() instanceof Rit || stap.getType() instanceof Treinrit && sourceStap.getType() instanceof Treinrit || stap.getType() instanceof Vlucht && sourceStap.getType() instanceof Vlucht) {
                        double weight = stap.getWeight();
                        minDistance = reis.getMinDistance() + weight;
                    } else if (stap.getType() instanceof Vlucht && sourceStap.getType() instanceof Rit || stap.getType() instanceof Rit && sourceStap.getType() instanceof Vlucht) {
                        double weight = stap.getWeight() * 11;
                        minDistance = reis.getMinDistance() + weight;
                    } else if (stap.getType() instanceof Treinrit && sourceStap.getType() instanceof Rit || stap.getType() instanceof Rit && sourceStap.getType() instanceof Treinrit) {
                        double weight = stap.getWeight() * 1.4;
                        minDistance = reis.getMinDistance() + weight;
                    } else if(stap.getType() instanceof Vlucht && sourceStap.getType() instanceof Treinrit || stap.getType() instanceof Treinrit && sourceStap.getType() instanceof Vlucht) {
                        double weight = 
                    }


                } else {
                    sourceStap = stap;
                    double weight = stap.getWeight();
                    minDistance = reis.getMinDistance() + weight;
                }


                if (minDistance < v.getMinDistance()) {
                    priorityQueue.remove(reis);
                    v.setPreviosReis(reis);
                    v.setMinDistance(minDistance);
                    priorityQueue.add(v);
                }
            }
        }
    }

    public List<Reis> getShortestPathTo(Reis targetVerte) {
        List<Reis> path = new ArrayList<>();

        for (Reis reis = targetVerte; reis != null; reis = reis.getPreviosReis()) {
            path.add(reis);
        }

        Collections.reverse(path);
        return path;
    }

    public Stap getSourceStap() {
        return sourceStap;
    }

    public void setSourceStap(Stap sourceStap) {
        this.sourceStap = sourceStap;
    }
}