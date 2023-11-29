package ANHAR;

class Hero {
    String name;
    int power;

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String toString() {
        return name + " - " + power;
    }
}