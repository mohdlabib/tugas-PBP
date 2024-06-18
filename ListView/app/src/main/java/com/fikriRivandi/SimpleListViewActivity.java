package com.fikriRivandi;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.shadiqwidi.R;
import java.util.ArrayList;

public class SimpleListViewActivity extends AppCompatActivity {

    private static final String Tag = "SimpleListViewActivity";
    private ListView simpleList;
    private ArrayList ar_nama_mahasiswa;

    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_simple_list_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        simpleList = findViewById(R.id.SimpleListView);

        ar_nama_mahasiswa = new ArrayList<String>();
        ar_nama_mahasiswa.add("Yuda Palevi Nedra");
        ar_nama_mahasiswa.add("Dimas Hanafie Sugiono Putra");
        ar_nama_mahasiswa.add("Fitri Desrianti Harahap");
        ar_nama_mahasiswa.add("M. Farkhan Pratama");
        ar_nama_mahasiswa.add("Tengku Iqbal Nebula Islami Assegaf");
        ar_nama_mahasiswa.add("Muhammad Fadhil");
        ar_nama_mahasiswa.add("Reza Ramadhan Putra");
        ar_nama_mahasiswa.add("Alya Angriani M");
        ar_nama_mahasiswa.add("Farah Tsabitah Aflah");
        ar_nama_mahasiswa.add("Edi Putra Yuni");
        ar_nama_mahasiswa.add("Zaqki Hidayat");
        ar_nama_mahasiswa.add("Romi");
        ar_nama_mahasiswa.add("Reynal Novriadi");
        ar_nama_mahasiswa.add("Said Arrasyid");
        ar_nama_mahasiswa.add("Sabrina Awaliah Putri");
        ar_nama_mahasiswa.add("Zain M. Haqqo");
        ar_nama_mahasiswa.add("Shadiq Widi Putra");
        ar_nama_mahasiswa.add("Adel Vanryo");
        ar_nama_mahasiswa.add("Fikri Rivandi");
        ar_nama_mahasiswa.add("Yona Nadya Fadila");
        ar_nama_mahasiswa.add("Viera Adella");
        ar_nama_mahasiswa.add("Fadli Rahman");
        ar_nama_mahasiswa.add("Maghdalena");
        ar_nama_mahasiswa.add("Azizah Fauni Saputri");
        ar_nama_mahasiswa.add("Zikri Ahmad Maulana");
        ar_nama_mahasiswa.add("Muhammad Aldiansyah Putra");
        ar_nama_mahasiswa.add("Drin Marsal Albari");
        ar_nama_mahasiswa.add("Alvin Afrinaldo");
        ar_nama_mahasiswa.add("Aisyah Dwi Syahputri");
        ar_nama_mahasiswa.add("Jesika Mentari");
        ar_nama_mahasiswa.add("Wan Salma Nurkhairin Fitri");
        ar_nama_mahasiswa.add("Mohd. Abulkhairi Labib");
        ar_nama_mahasiswa.add("Naufal Al Mahdy Amara Putra");
        ar_nama_mahasiswa.add("Muhammad Berlian");
        ar_nama_mahasiswa.add("Dinda Wulandari");
        ar_nama_mahasiswa.add("Zacky Julio Putra");
        ar_nama_mahasiswa.add("Afif Far Hani");
        ar_nama_mahasiswa.add("Diaz Firman Syam");
        ar_nama_mahasiswa.add("M. Abdul Mas'ud");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ar_nama_mahasiswa);
        simpleList.setAdapter(adapter);


    }
}