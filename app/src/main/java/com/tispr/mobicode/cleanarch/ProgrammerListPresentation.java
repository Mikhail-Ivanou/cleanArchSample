package com.tispr.mobicode.cleanarch;

import java.util.List;

/**
 * Created by mikhail.ivanou on 03.12.16.
 */

public interface ProgrammerListPresentation {

    void presentProgrammers(List<ProgrammerDisplayData> programmerDisplayDataList);

    int getCount();

    void configure(ProgrammerRowView holder, int position);

    void onViewCreated();
}
