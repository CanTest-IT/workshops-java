import java.util.List;

public class Currency {
    private String name = "Pesos";
    private String currencyCode = "PES";
    private double costForOneEuro = 15.0; // dotąd mamy POJO
    private double percentageOfGlobalMoney;
    private List<Double> historicalCostsofEuro;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public double getCostForOneEuro() {
        return costForOneEuro;
    }

    public void setCurrencyCode(String currencyCode) throws Exception {
        if(currencyCode.length()!=3)throw new Exception("Wrong currency code");
        this.currencyCode = currencyCode;
    }

    public void setCostForOneEuro(double costForOneEuro) throws Exception {
        if (costForOneEuro <= 0) throw new Exception("Cost cannot be 0 or less, got: " + costForOneEuro);
        this.costForOneEuro = costForOneEuro;
    }

    public void setPercentageOfGlobalMoney(double percentageOfGlobalMoney) {
        this.percentageOfGlobalMoney = percentageOfGlobalMoney;
    }

    public double howMuchForGivenEuro(double euroValue){
        return euroValue * this.costForOneEuro;
    }

    public String howMuchForGivenEurosMsg(double euroValue) {
         return euroValue+" EUR kosztuje "+howMuchForGivenEuro(euroValue) +" "+this.currencyCode;
    }

    public Currency(String name, String currencyCode, double costForOneEuro) throws Exception {
        if (costForOneEuro <= 0) throw new Exception("Cost cannot be 0 or less, got: " + costForOneEuro);
        this.name = name;
        this.currencyCode = currencyCode;
        this.costForOneEuro = costForOneEuro;
    }

    public Currency(String name, String currencyCode, double costForOneEuro, double percentageOfGlobalMoney) throws Exception {
        this(name, currencyCode, costForOneEuro);
        this.percentageOfGlobalMoney = percentageOfGlobalMoney;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", costForOneEuro=" + costForOneEuro +
                '}';
    }


    public Currency() {
    }
}
