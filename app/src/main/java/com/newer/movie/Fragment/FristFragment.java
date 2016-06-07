package com.newer.movie.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.newer.movie.R;
import com.newer.movie.fristfragmentutil.Movie;
import com.newer.movie.fristfragmentutil.MovieAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FristFragment extends Fragment {
    private List<Movie> movies;
    private MovieAdapter adapter;
    private RecyclerView recyclerView;

    public FristFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化对象
        movies = new ArrayList<>();
        for (int i=0;i<20;i++){
            Movie movie = new Movie();
            movie.setImage(R.drawable.ic_launcher);
            movie.setMovieName("《完美世界》");
            movie.setControble("这是一部很好看的小伙，推荐你们看看");
            movie.setName("辰东");
            movie.setPeopleNumber(1253);
            movie.setLoveNumber(23);
            movies.add(movie);
        }

        adapter = new MovieAdapter(getActivity(), movies);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_frist, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return view;
    }

}
