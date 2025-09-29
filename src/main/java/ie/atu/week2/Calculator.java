package ie.atu.week2;

public class Calculator {
   private String operate;
   private double sum;

   public Calculator(String operate, double sum)  {
       this.operate = operate;
       this.sum = sum;
   }

    public String getOperate() {
        return operate;
    }

    public double getSum() {
        return sum;
    }
}
