package ex3;

import java.io.Serializable;

public class Animal implements Serializable {
     private double weight;

     public Animal(double weight) {
         this.weight = weight;
     }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
