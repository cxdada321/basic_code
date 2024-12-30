package innerclassdemo1;

public class Car {
    private String carName;
    private int carAge;
    private String color;

    public Car() {
    }

    public Car(String carName, int carAge, String color) {
        this.carName = carName;
        this.carAge = carAge;
        this.color = color;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public class engine {
        private String engineName;
        private int engineAge;

        public engine() {
        }

        public void setEngineName(String engineerName) {
            this.engineName = engineerName;
        }
        public String getEngineName() {
            return engineName;
        }

        public int getEngineAge() {
            return engineAge;
        }

        public void setEngineAge(int engineAge) {
            this.engineAge = engineAge;
        }

        public engine(String engineName, int engineAge) {
            this.engineName = engineName;
            this.engineAge = engineAge;
        }
    }
    public void show(String engineName, int engineAge) {
        System.out.println("汽车品牌：" + carName + "，车龄：" + carAge + "年，颜色：" + color);
        engine e = new engine();
        e.setEngineName(engineName);
        e.setEngineAge(engineAge);
        System.out.println("发动机品牌：" + e.getEngineName() + "，使用年限：" + e.getEngineAge() + "年");
    }
}
