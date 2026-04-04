package Laborator5_Proiectare_software;

public class AdvancedCalculator extends IntCalculator {

    public AdvancedCalculator(int state) {
        super(state);
    }

    public AdvancedCalculator division(int nr) {
        this.state = this.state / nr;
        return this;
    }

    public AdvancedCalculator riseToPower(int nr) {
        this.state = (int) Math.pow(this.state, nr);
        return this;
    }

    public AdvancedCalculator root(int nr) {
        this.state = (int) Math.pow(this.state, 1.0 / nr);
        return this;
    }
}

