package Class19;

public class Animals {
    String name;
    String breed;
    String color;

    public Animals(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }


    void info() {
        System.out.println(name + " "+ breed +" "+  color);
    }

}



class Dog extends Animals {
        Dog(String name, String breed, String color) {
            super(name, breed, color);
        }

    }

    class Cat extends Animals {
        Cat(String name, String breed, String color) {
            super(name, breed, color);
        }
    }
        class Horse extends Animals {
            Horse(String name, String breed, String color) {
                super(name, breed, color);
            }

        }






