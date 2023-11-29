package ANHAR;

// NOMOR 2 ALGODAT MODUL 4
public class LokiHeroSearch {
    public static void main(String[] args) {
        LokiSearch lokiSearch = new LokiSearch(15);

        // Tambahkan informasi pahlawan dan kekuatannya untuk setiap universe
        lokiSearch.addUniverse("Earth-616", 8);
        lokiSearch.addHero("Earth-616", "Spider-Man", 85);
        lokiSearch.addHero("Earth-616", "Iron Man", 92);
        lokiSearch.addHero("Earth-616", "Captain America", 88);
        lokiSearch.addHero("Earth-616", "Thor", 95);
        lokiSearch.addHero("Earth-616", "Hulk", 97);
        lokiSearch.addHero("Earth-616", "Black Widow", 82);
        lokiSearch.addHero("Earth-616", "Hawkeye", 80);
        lokiSearch.addHero("Earth-616", "Mr. Fantastic", 90);

        lokiSearch.addUniverse("Earth-1610", 3);
        lokiSearch.addHero("Earth-1610", "Spider-Miles", 87);
        lokiSearch.addHero("Earth-1610", "Wolverine", 92);
        lokiSearch.addHero("Earth-1610", "Iron Man", 89);

        lokiSearch.addUniverse("Earth-295", 2);
        lokiSearch.addHero("Earth-295", "Cyclops", 89);
        lokiSearch.addHero("Earth-295", "Wolverine", 92);

        lokiSearch.addUniverse("Earth-18119", 4);
        lokiSearch.addHero("Earth-18119", "Spider-Miles", 88);
        lokiSearch.addHero("Earth-18119", "Spider-B.Parker", 86);
        lokiSearch.addHero("Earth-18119", "Spider-Gwen", 84);
        lokiSearch.addHero("Earth-18119", "Spider-Ham", 80);

        lokiSearch.addUniverse("Earth-1228", 4);
        lokiSearch.addHero("Earth-1228", "Mr. Fantastic", 91);
        lokiSearch.addHero("Earth-1228", "Invisible Woman", 84);
        lokiSearch.addHero("Earth-1228", "Human Torch", 87);
        lokiSearch.addHero("Earth-1228", "The Thing", 89);

        lokiSearch.addUniverse("Earth-65", 2);
        lokiSearch.addHero("Earth-65", "Spider-Gwen", 86);
        lokiSearch.addHero("Earth-65", "Spider-Woman", 83);

        lokiSearch.addUniverse("Earth-19999", 5);
        lokiSearch.addHero("Earth-19999", "Iron Man", 89);
        lokiSearch.addHero("Earth-19999", "Captain America", 87);
        lokiSearch.addHero("Earth-19999", "Thor", 94);
        lokiSearch.addHero("Earth-19999", "Hulk", 96);
        lokiSearch.addHero("Earth-19999", "Scarlet Witch", 99);

        lokiSearch.addUniverse("Earth-2149", 3);
        lokiSearch.addHero("Earth-2149", "Scarlet Witch", 98);
        lokiSearch.addHero("Earth-2149", "Captain America", 91);
        lokiSearch.addHero("Earth-2149", "Iron Man", 84);

        lokiSearch.addUniverse("Earth-807128", 2);
        lokiSearch.addHero("Earth-807128", "Wolverine", 95);
        lokiSearch.addHero("Earth-807128", "Hawkeye", 89);

        lokiSearch.addUniverse("Earth-311", 3);
        lokiSearch.addHero("Earth-311", "Spider-Man", 92);
        lokiSearch.addHero("Earth-311", "Captain America", 89);
        lokiSearch.addHero("Earth-311", "Black Widow", 82);

        lokiSearch.addUniverse("Earth-801", 3);
        lokiSearch.addHero("Earth-801", "Iron Man", 85);
        lokiSearch.addHero("Earth-801", "Captain America", 88);
        lokiSearch.addHero("Earth-801", "Doctor Strange", 83);

        lokiSearch.addUniverse("Earth-982", 1);
        lokiSearch.addHero("Earth-982", "Spider-Girl", 79);

        lokiSearch.addUniverse("Earth-6311", 2);
        lokiSearch.addHero("Earth-6311", "Spider-Noir", 87);
        lokiSearch.addHero("Earth-6311", "Daredevil", 83);

        lokiSearch.addUniverse("Earth-1611", 4);
        lokiSearch.addHero("Earth-1611", "Iron Man", 87);
        lokiSearch.addHero("Earth-1611", "Captain America", 90);
        lokiSearch.addHero("Earth-1611", "Thor", 94);
        lokiSearch.addHero("Earth-1611", "Hulk", 98);

        lokiSearch.addUniverse("Earth-5631", 2);
        lokiSearch.addHero("Earth-5631", "Black Panther", 88);
        lokiSearch.addHero("Earth-5631", "Scarlet Witch", 90);

        // Temukan pahlawan terkuat untuk setiap universe
        lokiSearch.findStrongestHeroes();
    }
}
