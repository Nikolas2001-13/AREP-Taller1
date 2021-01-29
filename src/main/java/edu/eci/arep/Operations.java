package edu.eci.arep;

import java.lang.Math;


public class Operations {

    /**
     *Calcula la media de la LinkedList dada
     * @param data tipo LinkedList
     * @return mean tipo Double
     */
    public static Double mean(LinkedList data){
        Double  rest=0.0;
        for(int i=0; i<data.size(); i++){
            rest += data.get(i);
        }
        return (Math.round((rest/ data.size())*100.0)/100.0);
    }

    /**
     * Calcula la desviacion estandar de la LinkedList dada
     * @param data tipo LinkedList
     * @return stdDev tipo Double
     */
    public static Double stdDev(LinkedList data){
        Double mean = mean(data);
        Double numerator = 0.0;
        for(int i=0; i<data.size(); i++){
            numerator+= Math.pow(data.get(i)-mean, 2);
        }
        Double inSide = numerator/(data.size()-1);
        return (Math.round((Math.sqrt(inSide))*100.0)/100.0);
    }
}
