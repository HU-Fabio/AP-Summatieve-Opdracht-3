import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    public void computePath(Reis sourceReis) {
        sourceReis.setMinDistance(0);
        PriorityQueue<Reis> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceReis);

        while (!priorityQueue.isEmpty()) {
            Reis reis = priorityQueue.poll();

            for (Stap stap : reis.getStaps()) {
                Reis v = stap.getTargetReis();
//                Vertex u = edge.getStartVertex();
                double weight = stap.getWeight();
//              Change to checking type
                double minDistance = reis.getMinDistance() + weight;

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
}