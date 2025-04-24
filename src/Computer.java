import java.math.BigDecimal;


public class Computer {
private String model;
private double diagonalOfScreen;
private boolean isCompanyComputer;
private BigDecimal price;
private boolean isLaptop;

public Computer /* Computer je návratový typ Konstrokturu*/(String model, double diagonalOfScreen, boolean isCompanyComputer, BigDecimal price, boolean isLaptop) {
this.model = model;
this.diagonalOfScreen = diagonalOfScreen;
this.isCompanyComputer = isCompanyComputer;
this.price = price;
this.isLaptop = isLaptop;
}
//druhej konstruktor
public Computer (BigDecimal price) {
this.model = "Dell";
this.diagonalOfScreen = 15.6;
this.isCompanyComputer = true;
this.price = price;
this.isLaptop = true;

}

//třetí konstruktor
public  Computer (String model, BigDecimal price) {
this(model, 15.6, true, price, true);
}

//čtvrtý konstruktor
public Computer (boolean isCompanyComputer, BigDecimal price) {
this("Hipo", price);
}


public String getModel() {
return model;
}

public void setModel(String model) {
this.model = model; // this je atribut a model je parametr
}

public void setModelAndDiagonal(String model, double diagonalOfScreen) {

this.model = model;
this.diagonalOfScreen = diagonalOfScreen;

}


public double getDiagonalOfScreen() {
return diagonalOfScreen;
}

public void setDiagonalOfScreen(double diagonalOfScreen) {
this.diagonalOfScreen = diagonalOfScreen;
}
public boolean isOverPriceLimit(BigDecimal priceLimit) {
return price.compareTo(priceLimit) > 2000;

}

public boolean isCompanyComputer() {
return isCompanyComputer;
}

public void setCompanyComputer(boolean companyComputer) {
isCompanyComputer = companyComputer;
}

public BigDecimal getPrice() {
return price;
}

public void setPrice(BigDecimal price) {
this.price = price;
}

public boolean isLaptop() {
return isLaptop;
}

public void setLaptop(boolean laptop) {
this.isLaptop = laptop;
}

public String getDescription() {
  return "Model: " + model + ", Diagonal of Screen: " + diagonalOfScreen +
          ", Is Company Computer: " + isCompanyComputer + ", Price: " + price +
          ", Is Laptop: " + isLaptop;

}


    @Override // co dělá override? override je přepsání
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", diagonalOfScreen=" + diagonalOfScreen +
                ", isCompanyComputer=" + isCompanyComputer +
                ", price=" + price +
                ", isLaptop=" + isLaptop +
                '}';
    }
}
