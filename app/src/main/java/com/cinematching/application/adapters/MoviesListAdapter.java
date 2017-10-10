package com.cinematching.application.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cinematching.application.R;
import com.cinematching.application.models.Movie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by meryl on 10/10/2017.
 */

public class MoviesListAdapter extends RecyclerView.Adapter<MoviesListAdapter.ViewHolder> {

    private Context mContext;
    private List<Movie> movies = new ArrayList<>();

    public MoviesListAdapter(Context context, @Nullable List<Movie> movies) {
        this.mContext = context;
        if (movies != null) {
            this.movies = movies;
        } else {
            this.movies = new ArrayList<>();
        }
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
        notifyDataSetChanged();
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
        notifyItemInserted(movies.size() - 1);
    }

    public void addUsers(Collection<Movie> movies) {
        this.movies.addAll(movies);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View userCellView = inflater.inflate(R.layout.cell_list_movies, parent, false);

        return new ViewHolder(userCellView);
    }

    @Override
    public void onBindViewHolder(MoviesListAdapter.ViewHolder holder, int position) {

        Movie movie = movies.get(position);
        ArrayList<String> date = movie.getReleaseDate();
        holder.movieCellTitle.setText(movie.getName());
        holder.movieCellDate.setText(date.get(0));
        holder.movieCellImage.setImageURI(movie.getImageUrl());
    }

    @Override
    public int getItemCount() {
        return (movies != null) ? movies.size() : 0;
    }

    public Context getContext() {
        return mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView movieCellTitle;
        TextView movieCellDate;
        ImageView movieCellImage;

        public ViewHolder(View itemView) {
            super(itemView);
            movieCellTitle = (TextView) itemView.findViewById(R.id.moviesList_title);
            movieCellDate = (TextView) itemView.findViewById(R.id.moviesList_date);
            movieCellImage = (ImageView) itemView.findViewById(R.id.moviesList_image);
        }
    }
}