package telran.item;

public class Car implements Comparable<Car> {
    private int year;
    private String colour;
    private double engine;
    private double price;

    public Car(int year, String colour, double engine, double price) {
        if(colour!=null&&!colour.isEmpty()){
            this.colour = colour;
        }else
            this.colour="undefined";
        if(year<1768){
            System.out.println("Wrong year!Your year "+year+" is less than a year when the first car was invented");
        }else if (year>2021){
            System.out.println("Wrong year! Your year "+year+" is greater than current year");
        }else
            this.year = year;
        if (engine>0){
            this.engine = engine;
        }else
            System.out.println("Invalid engine!");
        this.engine = engine;
        if(price>0){
            this.price = price;
        }else
            System.out.println("Invalid price");

    }

    private Car() {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                ", price=" + price +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (Double.compare(car.engine, engine) != 0) return false;
        if (Double.compare(car.price, price) != 0) return false;
        return colour.equals(car.colour);
    }

    @Override
    public int compareTo(Car o) {
        int res = Double.compare(price, o.price);
        return res == 0 ? (Integer.compare(year,o.year)) : res;
    }
}
