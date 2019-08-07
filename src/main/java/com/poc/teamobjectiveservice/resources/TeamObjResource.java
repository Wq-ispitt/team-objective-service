package com.poc.teamobjectiveservice.resources;

import com.poc.teamobjectiveservice.models.Goal;
import com.poc.teamobjectiveservice.models.UserGoal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/teamObj")
public class TeamObjResource {


    @RequestMapping("/{campId}")
    public Goal getCampGoal(@PathVariable("campId") String campId) {
        return new Goal(campId, "testGoal-First round");
    }


    @RequestMapping("user/{userId}")
    public UserGoal getUserCampGoal(@PathVariable("userId") String userId) {


        List<Goal> goals = Arrays.asList(
                new Goal("001", "Introducing the brand"),
                new Goal("002", "Identity the potential donor")
        );

        UserGoal userGoal = new UserGoal();
        userGoal.setUserGoal(goals);

        return userGoal;
    }

}
