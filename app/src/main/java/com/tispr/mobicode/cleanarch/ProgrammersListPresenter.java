package com.tispr.mobicode.cleanarch;

import java.util.List;

/**
 * Created by mikhail.ivanou on 03.12.16.
 */

public class ProgrammersListPresenter implements ProgrammerListPresentation {

    private List<ProgrammerDisplayData> programmerDisplayDataList;
    private ShowProgrammersListUseCase mShowUseCase;


    @Override
    public void presentProgrammers(List<ProgrammerDisplayData> programmerDisplayDataList) {
        this.programmerDisplayDataList = programmerDisplayDataList;
    }

    @Override
    public int getCount() {
        return programmerDisplayDataList == null ? 0 : programmerDisplayDataList.size();
    }

    @Override
    public void configure(ProgrammerRowView view, int position) {
        ProgrammerDisplayData programmerDisplayData = programmerDisplayDataList.get(position);
        view.displayName(programmerDisplayData.getName());
        view.displayFavorite(programmerDisplayData.isFavorite());
        view.displayDate(DateFormatUtils.format(programmerDisplayData.getLastInterviewDate()));
    }

    @Override
    public void onViewCreated() {
        mShowUseCase.showProgrammers();
    }

    public void setShowUseCase(ShowProgrammersListUseCase pShowUseCase) {
        this.mShowUseCase = pShowUseCase;
    }
}
