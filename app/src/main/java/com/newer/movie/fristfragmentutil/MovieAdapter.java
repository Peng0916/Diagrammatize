package com.newer.movie.fristfragmentutil;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.newer.movie.PlayActivity;
import com.newer.movie.R;

import java.util.List;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    private List<Movie> movies;
    private LayoutInflater inflater;
    private Context context;

    public MovieAdapter(Context context,List<Movie> movies ) {
        this.movies = movies;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.frist_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MovieAdapter.ViewHolder holder, int position) {
        final Movie movie1 = movies.get(position);
        holder.rl_img_1.setImageResource(movie1.getImage());
        holder.rl_tv_name1.setText(movie1.getMovieName());
        holder.rl_tv_controle1.setText(movie1.getControble());
        holder.rl_ll_tv_name1.setText(movie1.getName());
        holder.rl_ll_tv_poplenub1.setText(movie1.getPeopleNumber().toString());
        holder.rl_ll_tv_lovenub1.setText(movie1.getLoveNumber().toString());

        // 4.6.3 点击事件
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, PlayActivity.class));
            }
        });
        final Movie movie2 = movies.get(position+1);
        holder.rl_img_2.setImageResource(movie2.getImage());
        holder.rl_tv_name2.setText(movie2.getMovieName());
        holder.rl_tv_controle2.setText(movie2.getControble());
        holder.rl_ll_tv_name2.setText(movie2.getName());
        holder.rl_ll_tv_poplenub2.setText(movie2.getPeopleNumber().toString());
        holder.rl_ll_tv_lovenub2.setText(movie2.getLoveNumber().toString());

        // 4.6.3 点击事件
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, PlayActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return movies.size()/2;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView rl_img_1;
        TextView rl_tv_name1;
        TextView rl_tv_controle1;
        TextView rl_ll_tv_name1;
        TextView rl_ll_tv_poplenub1;
        TextView rl_ll_tv_lovenub1;

        ImageView rl_img_2;
        TextView rl_tv_name2;
        TextView rl_tv_controle2;
        TextView rl_ll_tv_name2;
        TextView rl_ll_tv_poplenub2;
        TextView rl_ll_tv_lovenub2;
        View view;

        public ViewHolder(View view) {
            super(view);
            this.view = view;
            rl_img_1 = (ImageView) view.findViewById(R.id.rl_img_1);
            rl_tv_name1= (TextView) view.findViewById(R.id.rl_tv_name1);
            rl_tv_controle1= (TextView) view.findViewById(R.id.rl_tv_controle1);
            rl_ll_tv_name1= (TextView) view.findViewById(R.id.rl_ll_tv_name1);
            rl_ll_tv_poplenub1= (TextView) view.findViewById(R.id.rl_ll_tv_poplenub1);
            rl_ll_tv_lovenub1= (TextView) view.findViewById(R.id.rl_ll_tv_lovenub1);

            rl_img_2 = (ImageView) view.findViewById(R.id.rl_img_2);
            rl_tv_name2= (TextView) view.findViewById(R.id.rl_tv_name2);
            rl_tv_controle2= (TextView) view.findViewById(R.id.rl_tv_controle2);
            rl_ll_tv_name2= (TextView) view.findViewById(R.id.rl_ll_tv_name2);
            rl_ll_tv_poplenub2= (TextView) view.findViewById(R.id.rl_ll_tv_poplenub2);
            rl_ll_tv_lovenub2= (TextView) view.findViewById(R.id.rl_ll_tv_lovenub2);
        }
    }
}
