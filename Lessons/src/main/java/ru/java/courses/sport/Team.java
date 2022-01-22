package ru.java.courses.sport;

import ru.java.courses.sport.coach.Coach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Team<T extends Athlete & ScoringPlayer> {

    public String name;
    public ru.java.courses.sport.coach.Coach coach;

    public List<T> players = new ArrayList<>();

    Team(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("");
        }
        this.name = name;
    }


    public void addPlayer(T player) {
        if(this.players.size() + 1 > getMaxPlayersCount()){
            throw new IllegalArgumentException("");
        }
        this.players.add(player);
    }
    public void removePlayer(T player){
        this.players.remove(player);
    }

    public int getPlayersCount(){
        return players.size();
    }

    public void addPlayers(T... players) {
        if(this.players.size() > getMaxPlayersCount()){
            throw new IllegalArgumentException("");
        }
        this.players.addAll(Arrays.asList(players));
    }

    public String getName() {
        return name;
    }

    public void setCoach(ru.java.courses.sport.coach.Coach coach) {
        this.coach = coach;
    }

    public List<T> getPlayers() {
        return players;
    }

    public int getScore() {
        int score = 0;
        for (T player: players) {
            score += player.getScore();
        }
        return score;
    }

    public Coach getCoach() {
        return coach;
    }

    public abstract int getMaxPlayersCount();
}
