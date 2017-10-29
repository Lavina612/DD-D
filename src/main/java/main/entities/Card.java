package main.entities;

import javax.persistence.*;

@Entity(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "cardSeq")
    @SequenceGenerator(name = "cardSeq", sequenceName = "cardSeq")
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "creature_id")
    private Creature creature;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Column(name = "cubeNumber")
    private int cubeNumber;

    public Long getId() {
        return id;
    }
    public void setName (String name) {this.name = name;}
    public String getName () {return name;}
    public void setDescription (String description) {this.description = description;}
    public String getDescription () {return description;}
    public Creature getCreature() {
        return creature;
    }
    public void setCreature(Creature creature) {
        this.creature = creature;
    }
    public Skill getSkill() {
        return skill;
    }
    public void setSkill(Skill skill) {
        this.skill = skill;
    }
    public int getCubeNumber() {
        return cubeNumber;
    }
    public void setCubeNumber(int cubeNumber) {
        this.cubeNumber = cubeNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "id=\"" + id +
                "\", name=\"" + name +
                "\", description=\"" + description +
                "\", creature=\"" + creature +
                "\", skill=\"" + skill +
                "\", cubeNumber=\"" + cubeNumber +
                "\"}";
    }

    public Card() {}
    public Card (String name, String description, Creature creature, Skill skill, int cubeNumber) {
        this.name = name;
        this.description = description;
        this.creature = creature;
        this.skill = skill;
        this.cubeNumber = cubeNumber;
    }
}
