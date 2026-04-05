package Laborator5_Proiectare_software.advanced;

import Laborator5_Proiectare_software.IntCalculator;

public class DoubleCalculator extends ACalculator {
    public DoubleCalculator(Double state) {
        super(state);
    }

    @Override
    public void init() {
        this.state = 0.0;
    }
    public DoubleCalculator add(double nr){
        this.state = (Double)this.state + nr;
        return this;
    }
    public DoubleCalculator subtract(double nr){
        this.state = (Double)this.state - nr;
        return this;
    }
    public DoubleCalculator multiply(double nr){
        this.state = (Double)this.state * nr;
        return this;
    }
}
