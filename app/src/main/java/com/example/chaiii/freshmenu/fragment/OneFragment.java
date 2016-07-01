package com.example.chaiii.freshmenu.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chaiii.freshmenu.R;
import com.example.chaiii.freshmenu.adapter.MyAdapter;


public class OneFragment extends Fragment {

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
        rv.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(new String[]{"Portuguese Chicken Bowl With Larb Salad(Non veg)",
                "Shanghai Noodles and Buttery Stir-Fried Veggies Combo(veg)",
                "Sweet and Savoury Combo (Non veg)",
                "penne primavera with Black Bean Salad Combo(Veg)",
                "Three Course Combo(Non veg)",
                "Portuguese Chicken Rice Bowl(Non veg)",
                "Southeast Asian Grilled Fish(Non veg) ",
                "Shanghai Noodle Bowl(veg)",
                "Tomata Cream Penne Primavera(veg)",
                "Corn quesadilla combo meal(veg)"});
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return rootView;
    }

}
