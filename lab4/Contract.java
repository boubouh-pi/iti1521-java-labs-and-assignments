
public class Contract extends Employee {

  private double nbHours = -1.0;
  private double hourRate = -1.0;
  private double percentHourSup  = -1.0;
  private static final double dueHour  = 40.0;

   Contract(String name) {
    super(name);
  }

    Contract (String name, double nbHours, double hourRate, double percentHourSup) {
    super(name);
    this.nbHours = nbHours;
    this.hourRate = hourRate;
    this.percentHourSup = percentHourSup;
  }

  public void setSalaryInfo(double nbHours, double hourRate, double percentHourSup) {
    this.nbHours = nbHours;
    this.hourRate = hourRate;
    this.percentHourSup = percentHourSup;
  }
  
   
  public double getSalary() {
    double salary = 0.0;
    if (nbHours <= dueHour) {
      salary = nbHours * hourRate;
    } else {
      double regularPay = dueHour * hourRate;
      double extraHours = nbHours - dueHour;
      double extraPay = extraHours * hourRate * (1 + percentHourSup / 100);
      salary = regularPay + extraPay;
    }
    return salary;
  }

 public double getNbHours() {  
    return nbHours;
  }

  public double getHourRate() {
    return hourRate;
  }

  public double getPercentHourSup() {
    return percentHourSup;
  }

   public String toString() {
    return super.toString() + "; nbHours=" + nbHours 
      + "; Hour rate=" + hourRate + "; % Hour Sup=" + percentHourSup;
  }

}

