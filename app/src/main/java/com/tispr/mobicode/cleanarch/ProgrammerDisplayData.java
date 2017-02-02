package com.tispr.mobicode.cleanarch;

import java.util.Date;

/**
 * Created by mikhail.ivanou on 03.12.16.
 */

public final class ProgrammerDisplayData {

    private final String name;
    private final boolean favorite;
    private final Date lastInterviewDate;

    public ProgrammerDisplayData(Programmer programmer) {
        this.name = programmer.getName();
        this.favorite = programmer.isFavorite();
        this.lastInterviewDate = programmer.getLastInterviewDate();
    }

    public String getName() {
        return name;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public Date getLastInterviewDate() {
        return lastInterviewDate;
    }
}
