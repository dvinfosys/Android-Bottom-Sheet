package com.dvinfosys.androidworkingwithbottomsheet.Fregment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.dvinfosys.androidworkingwithbottomsheet.R;

public class BottomSheetFragment extends BottomSheetDialogFragment {

    View view;

    public BottomSheetFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false);
        LinearLayout layoutPriview = (LinearLayout) view.findViewById(R.id.layout_priview);
        layoutPriview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Priview Click", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
