package ANHAR;

class Universe {
    String name;
    Hero[] heroes;
    int heroCount;

    public Universe(String name, int maxHeroes) {
        this.name = name;
        this.heroes = new Hero[maxHeroes];
        this.heroCount = 0;
    }

    public void addHero(String name, int power) {
        if (heroCount < heroes.length) {
            heroes[heroCount++] = new Hero(name, power);
        }
    }
}

class LokiSearch {
    Universe[] universes;
    int universeCount;

    public LokiSearch(int maxUniverses) {
        this.universes = new Universe[maxUniverses];
        this.universeCount = 0;
    }

    public void addUniverse(String name, int maxHeroes) {
        if (universeCount < universes.length) {
            universes[universeCount++] = new Universe(name, maxHeroes);
        }
    }

    public void addHero(String universeName, String heroName, int power) {
        for (Universe universe : universes) {
            if (universe != null && universe.name.equals(universeName)) {
                universe.addHero(heroName, power);
                break;
            }
        }
    }

    public void findStrongestHeroes() {
        System.out.println("Highest Power Hero In All Universe:");
        for (Universe universe : universes) {
            if (universe != null) {
                Hero strongestHero = findStrongestHero(universe.heroes);
                if (strongestHero != null) {
                    System.out.println(universe.name + " : " + strongestHero);
                }
            }
        }
    }

    private Hero findStrongestHero(Hero[] heroes) {
        Hero strongestHero = null;

        for (Hero hero : heroes) {
            if (hero != null && (strongestHero == null || hero.power > strongestHero.power)) {
                strongestHero = hero;
            }
        }

        return strongestHero;
    }
}