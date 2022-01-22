package ru.java.courses.sport;

public class FootballPlayer extends Athlete implements ScoringPlayer {

    public PlayerRole role;
    public int goals;

    public FootballPlayer(String name, PlayerRole role){
        super(name);

        if (role == null) {
            throw new IllegalArgumentException("");
        }
        this.role = role;

    }


    @Override
    public void score() {
        if(getRole() == PlayerRole.DEFENDER){
            return;
        }
        goals++;
    }

    public int getScore() {
        return goals;
    }


    public PlayerRole getRole() {
        if(role == null){
            throw new IllegalArgumentException("");
        }else {
            return role;
        }
    }

    public void setRole(PlayerRole role) {
        this.role = role;
    }

    public int getGoals() {
        return goals;
    }
}
