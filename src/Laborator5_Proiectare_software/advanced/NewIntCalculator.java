package Laborator5_Proiectare_software.advanced;

import Laborator5_Proiectare_software.IntCalculator;

public class NewIntCalculator extends ACalculator {

    public NewIntCalculator(Integer state) {
        super(state);
    }

    @Override
    public void init() {
        this.state = 0;
    }
    public NewIntCalculator add(Integer nr){
        this.state = (Integer)this.state + nr;
        return this;
    }
    public NewIntCalculator subtract(Integer nr){
        this.state = (Integer)this.state - nr;
        return this;
    }
    public NewIntCalculator multiply(Integer nr){
        this.state = (Integer)this.state * nr;
        return this;
    }
}
