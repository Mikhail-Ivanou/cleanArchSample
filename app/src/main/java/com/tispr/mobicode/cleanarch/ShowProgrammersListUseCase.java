package com.tispr.mobicode.cleanarch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikhail.ivanou on 03.12.16.
 */

public class ShowProgrammersListUseCase {

    private EntityGateway mEntityGateway;
    private ProgrammerListPresentation mPresenter;

    public ShowProgrammersListUseCase(EntityGateway mEntityGateway, ProgrammerListPresentation mPresenter) {
        this.mEntityGateway = mEntityGateway;
        this.mPresenter = mPresenter;
    }

    public void showProgrammers() {
        final List<Programmer> programmers = mEntityGateway.fetchProgrammersList();
        List<ProgrammerDisplayData> programmersToShow = new ArrayList<>(programmers.size());
        for (Programmer programmer : programmers) {
            programmersToShow.add(new ProgrammerDisplayData(programmer));
        }
        mPresenter.presentProgrammers(programmersToShow);
        // pass to presenter
    }



}
