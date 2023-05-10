package plantilla;

import java.util.List;

public class Pokemon {

    private int id;
    private String num;
    private String name;
    private String img;
    // private Type type;
    private List<String> type;
    private String height;
    private String weight;
    private String candy;
    private int candy_count;
    private String egg;
    private double spawn_chance;
    private int avg_spawns;
    private String spawn_time;
    // private Multipliers multipliers;
    private List<Double> multipliers;
    // private Weaknesses weaknesses;
    private List<String> weaknesses;

    private Next_evolution[] next_evolution;

    private Prev_evolution[] prev_evolution;

    // public Pokemon() {}



    
    @Override
    public String toString() {
        String array = this.name;
        return array;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setCandy(String candy) {
        this.candy = candy;
    }

    public void setCandy_count(int candy_count) {
        this.candy_count = candy_count;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }

    public void setSpawn_chance(double spawn_chance) {
        this.spawn_chance = spawn_chance;
    }

    public void setAvg_spawns(int avg_spawns) {
        this.avg_spawns = avg_spawns;
    }

    public void setSpawn_time(String spawn_time) {
        this.spawn_time = spawn_time;
    }

    public void setMultipliers(List<Double> multipliers) {
        this.multipliers = multipliers;
    }

    public void setWeaknesses(List<String> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public void setNext_evolution(Next_evolution[] next_evolution) {
        this.next_evolution = next_evolution;
    }

    public void setPrev_evolution(Prev_evolution[] prev_evolution) {
        this.prev_evolution = prev_evolution;
    }

    public void setType(List<String> type) {
        this.type = type;
    }
}
