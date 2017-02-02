package com.tispr.mobicode.cleanarch;

import java.util.Date;

/**
 * Created by mikhail.ivanou on 03.12.16.
 */

public final class Programmer {

    private final String name;

    private final int emacs;

    private final int caffeine;

    private final int realProgrammerRating;

    private final Date lastInterviewDate;

    private final boolean favorite;


    public Programmer(String name, int emacs, int caffeine, int realProgrammerRating, Date lastInterviewDate, boolean favorite) {
        this.name = name;
        this.emacs = emacs;
        this.caffeine = caffeine;
        this.realProgrammerRating = realProgrammerRating;
        this.lastInterviewDate = lastInterviewDate;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public int getEmacs() {
        return emacs;
    }

    public int getCaffeine() {
        return caffeine;
    }

    public int getRealProgrammerRating() {
        return realProgrammerRating;
    }

    public Date getLastInterviewDate() {
        return lastInterviewDate;
    }

    public boolean isFavorite() {
        return favorite;
    }
}
