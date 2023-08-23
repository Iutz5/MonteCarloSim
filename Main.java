/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonteCarloSimulation;

/**
 *
 * @author ianut
 */
public class Main {

    /**
     * @param iterations
     * @return 
*/
    public static double estimatePi(int iterations) {
        int inCircle = 0;
        
        for(int i = 0; i < iterations; i++) {
            double x = Math.random();
            double y = Math.random();
            double squared = Math.pow(x,2) + Math.pow(y,2);
            if (squared <= 1) {
                inCircle = inCircle + 1;
            }
        }
        double estimate = inCircle*4.0/iterations;
        return estimate;
    }
    public static void main(String[] args) {
        for(int i = 10; i < 10000000 ; i*=10) {
            double piEstimate = estimatePi(i);
            double error = Math.PI - piEstimate;
            System.out.println(i);
            System.out.println(piEstimate);
            System.out.println(error);
        } 
    }
    
}
