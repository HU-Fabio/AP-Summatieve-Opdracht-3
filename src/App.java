public class App {
    public static void main(String[] args) {
        Reis v1 = new Reis("A");
        Reis v2 = new Reis("B");
        Reis v3 = new Reis("C");
        Reis v4 = new Reis("D");

        v1.addNeighbour(new Stap<Rit>(5, v1, v2));
        v1.addNeighbour(new Stap<Rit>(10, v1, v3));

        v2.addNeighbour(new Stap<Rit>(5, v2, v4));
        v3.addNeighbour(new Stap<Rit>(10, v3, v4));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(v1);

        System.out.println(dijkstra.getShortestPathTo(v3));
    }
}