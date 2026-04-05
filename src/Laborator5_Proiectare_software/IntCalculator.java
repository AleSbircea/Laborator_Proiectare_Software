package Laborator5_Proiectare_software;

public class IntCalculator {
    protected int state;
     public IntCalculator(int state) {
         this.state = state;
     }

    public IntCalculator add(int nr){
         this.state+=nr;
         return this;
     }
     public IntCalculator subtract(int nr){
         this.state-=nr;
         return this;
     }
     public IntCalculator multiply(int nr){
         this.state*=nr;
         return this;
     }
     public int result(){
         return this.state;
     }
     public IntCalculator clear(){
         this.state=0;
         return this;
     }
}
