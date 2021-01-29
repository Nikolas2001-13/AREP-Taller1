package edu.eci.arep;

public class Main {
    private static LinkedList list;
    public static void main(String[] args) {
            
        list = new LinkedList();

        list.addNode(15.0);
        list.addNode(69.9);
        list.addNode(6.5);
        list.addNode(22.4);
        list.addNode(28.4);
        list.addNode(65.9);
        list.addNode(19.4);
        list.addNode(198.7);
        list.addNode(38.8);
        list.addNode(138.2);

        showMean();
        showStdDev();
    }

    /**
     * Muestra la media en pantalla
     */
    public static void showMean(){
        System.out.println("Mean: "+Operations.mean(list));
    }

    /**
     * Muestra la desviacion standar en pantalla
     */
    public static void showStdDev(){
        System.out.println("Std. Dev: "+Operations.stdDev(list));
    }
}  