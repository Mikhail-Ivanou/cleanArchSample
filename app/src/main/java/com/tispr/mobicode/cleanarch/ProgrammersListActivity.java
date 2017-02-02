package com.tispr.mobicode.cleanarch;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ProgrammersListActivity extends AppCompatActivity {

    private ProgrammersListPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programmers_list);
        initToolbar();
        initFab();
        initConnection();
        mPresenter.onViewCreated();
        initRecyclerView();
    }

    private void initConnection() {
        mPresenter = new ProgrammersListPresenter();
        ProgrammerRepository programmerRepository = new ProgrammerRepository();
        ShowProgrammersListUseCase useCase = new ShowProgrammersListUseCase(programmerRepository, mPresenter);
        mPresenter.setShowUseCase(useCase);
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.programmers_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ProgrammersListAdapter(mPresenter));

    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void initFab() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
