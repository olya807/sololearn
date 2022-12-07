package org.example;

import java.util.*;

public class Main {
    HashMap<String, Integer> players;
    Main() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    public String getWinner() {
        String winner = "";
        int highestPoints = 0;

        for (Map.Entry<String, Integer> entry : players.entrySet()) {
            if (entry.getValue() > highestPoints) {
                highestPoints = entry.getValue();
                winner = entry.getKey();
            }
        }

        return winner;
    }
}

