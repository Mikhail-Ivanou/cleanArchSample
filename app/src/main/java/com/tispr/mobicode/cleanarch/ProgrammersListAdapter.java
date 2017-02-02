package com.tispr.mobicode.cleanarch;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mikhail.ivanou on 03.12.16.
 */

public class ProgrammersListAdapter extends RecyclerView.Adapter<ProgrammersListAdapter.ProgrammerRowViewHolder> {

    private ProgrammerListPresentation mPresenter;

    public ProgrammersListAdapter(ProgrammerListPresentation pPresenter) {
        this.mPresenter = pPresenter;
    }

    @Override
    public ProgrammerRowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_programmer, parent, false);
        return new ProgrammerRowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProgrammerRowViewHolder holder, int position) {
        mPresenter.configure(holder, position);
    }

    @Override
    public int getItemCount() {
        return mPresenter.getCount();
    }

    public static class ProgrammerRowViewHolder extends RecyclerView.ViewHolder implements ProgrammerRowView{

        TextView nameView;
        TextView dateView;
        ImageView favoriteView;

        public ProgrammerRowViewHolder(View itemView) {
            super(itemView);
            this.nameView = (TextView) itemView.findViewById(R.id.nameTextView);
            this.dateView = (TextView) itemView.findViewById(R.id.interviewDateTextView);
            this.favoriteView = (ImageView) itemView.findViewById(R.id.favorite);
        }


        @Override
        public void displayName(String name) {
            nameView.setText(name);
        }

        @Override
        public void displayDate(String date) {
            dateView.setText(date);
        }

        @Override
        public void displayFavorite(boolean isFavorite) {
            favoriteView.setVisibility(isFavorite ? View.VISIBLE : View.INVISIBLE);
        }
    }
}
