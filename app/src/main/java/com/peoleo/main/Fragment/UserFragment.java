package com.peoleo.main.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.peoleo.main.R;

/**
 * Created by hu on 14-11-4.
 */
public class UserFragment extends Fragment {
    private View parentView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        parentView = inflater.inflate(R.layout.fragment_user,container,false);
        return parentView;
    }
}
