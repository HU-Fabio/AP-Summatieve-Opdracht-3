public class App {
    public static void main(String[] args) {
        Reis A = new Reis("A");
        Reis B = new Reis("B");
        Reis C = new Reis("C");
        Reis D = new Reis("D");
        Reis E = new Reis("E");
        Reis F = new Reis("F");

        A.addNeighbour(new Stap<Treinrit>(10, A, B));
        A.addNeighbour(new Stap<Vlucht>(150, A, C));

        B.addNeighbour(new Stap<Rit>(12, B, D));
        B.addNeighbour(new Stap<Treinrit>(1, B, E));

        D.addNeighbour(new Stap<Rit>(2, D, F));

        E.addNeighbour(new Stap<Rit>(2, E, F));

        C.addNeighbour(new Stap<Treinrit>(2, C, F));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(A);

        System.out.println(dijkstra.getShortestPathTo(F));
    }
}