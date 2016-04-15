package com.oreilly.entities;

import org.springframework.stereotype.Component;

/**
 * Created by deepakvalechha on 3/4/16.
 */
@Component
public class Cubs implements Team {
    public String getName() {
        return "Chicago cubs";
    }
}
