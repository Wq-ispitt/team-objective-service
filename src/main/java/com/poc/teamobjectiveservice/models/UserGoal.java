package com.poc.teamobjectiveservice.models;

import java.util.List;

public class UserGoal {

    private List<Goal> userGoal;

    public List<Goal> getUserGoal() {
        return userGoal;
    }

    public void setUserGoal(List<Goal> userGoal) {
        this.userGoal = userGoal;
    }
}
