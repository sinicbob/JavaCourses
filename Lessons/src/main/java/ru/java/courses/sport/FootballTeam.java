package ru.java.courses.sport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FootballTeam extends Team {

    private final int MAX_PLAYERS = 20;

    public FootballTeam(String name){
       super(name);
    }

    @Override
    public int getMaxPlayersCount() {
        return MAX_PLAYERS;
    }
}
