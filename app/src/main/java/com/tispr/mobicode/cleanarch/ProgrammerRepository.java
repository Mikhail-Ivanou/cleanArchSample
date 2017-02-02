package com.tispr.mobicode.cleanarch;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mikhail.ivanou on 03.12.16.
 */

public class ProgrammerRepository implements EntityGateway {

    @Override
    public List<Programmer> fetchProgrammersList() {
        List<Programmer> programmerList = new ArrayList<Programmer>();
        programmerList.add(new Programmer("wer", 12, 32, 13, new Date(), false));
        programmerList.add(new Programmer("fhfds", 12, 32, 13, new Date(), true));
        programmerList.add(new Programmer("sdlfh", 12, 32, 13, new Date(), true));
        programmerList.add(new Programmer("sfdg", 12, 32, 13, new Date(), false));
        programmerList.add(new Programmer("sadkgj", 12, 32, 13, new Date(), true));
        return programmerList;
    }
}
