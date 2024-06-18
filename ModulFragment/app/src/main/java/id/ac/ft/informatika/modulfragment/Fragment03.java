package id.ac.ft.informatika.modulfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment03 extends Fragment {
    private Button btnNavFragment01;
    private Button btnNavFragment02;
    private Button btnNavFragment03;
    private Button btnNavActivity02;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment03,container, false);

        btnNavFragment01 = view.findViewById(R.id.btnToFragment1);
        btnNavFragment02 = view.findViewById(R.id.btnToFragment2);
        btnNavFragment03 = view.findViewById(R.id.btnToFragment3);
        btnNavActivity02 = view.findViewById(R.id.btnToActivity2);

        btnNavFragment01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Pindah ke Fragment 01", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        btnNavFragment02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Pindah ke Fragment 02", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        btnNavFragment03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Pindah ke Fragment 03", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });

        btnNavActivity02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Pindah ke Activity Kedua", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), Activity02.class);
                startActivity(i);
            }
        });

        return view;

    }

}
