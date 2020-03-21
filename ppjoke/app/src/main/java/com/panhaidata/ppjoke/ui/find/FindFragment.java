package com.panhaidata.ppjoke.ui.find;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.panhaidata.libnavannotation.FragmentDestination;
import com.panhaidata.ppjoke.R;

@FragmentDestination(pageUrl = "main/tabs/find")
public class FindFragment extends Fragment {

    private FindViewModel mViewModel;

    public static FindFragment newInstance() {
        return new FindFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_find, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FindViewModel.class);
        // TODO: Use the ViewModel
    }

}
