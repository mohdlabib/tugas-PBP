package com.fikriRivandi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.shadiqwidi.R;
import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {

    private static final String TAG = "CustomListViewActivity";
    private ListView listView;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_list_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listView = findViewById(R.id.CustomListView);
        ArrayList <ModelMahasiswa> listMahasiswa = new ArrayList<>();

        ModelMahasiswa m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20, m21, m22, m23, m24, m25, m26, m27, m28, m29, m30, m31, m32, m33, m34, m35, m36, m37, m38, m39;
        m1 = new ModelMahasiswa (R.drawable.yuda,"Yuda Palevi Nedra","2007110666");
        m2 = new ModelMahasiswa (R.drawable.dimas,"Dimas Hanafie Sugiono Putra","2007113805");
        m3 = new ModelMahasiswa (R.drawable.fitri,"Fitri Desrianti Harahap","2107110258");
        m4 = new ModelMahasiswa (R.drawable.farkhan,"M. Farkhan Pratama","2107110515");
        m5 = new ModelMahasiswa (R.drawable.iqbal,"Tengku Iqbal Nebula Islami Assegaf","2107135918");
        m6 = new ModelMahasiswa (R.drawable.fadhil,"Muhammad Fadhil","220711386");
        m7 = new ModelMahasiswa (R.drawable.reza,"Reza Ramadhan Putra","2207111389");
        m8 = new ModelMahasiswa (R.drawable.alya,"Alya Angriani M","2207111390");
        m9 = new ModelMahasiswa (R.drawable.farah,"Farah Tsabitah Aflah","2207111394");
        m10 = new ModelMahasiswa (R.drawable.edi,"Edi Putra Yuni","2207111395");
        m11 = new ModelMahasiswa (R.drawable.zaqki,"Zakqi Hidayat","2207111396");
        m12 = new ModelMahasiswa (R.drawable.romi,"Romi","2207111400");
        m13 = new ModelMahasiswa (R.drawable.reynal,"Reynal Novriadi","2207111401");
        m14 = new ModelMahasiswa (R.drawable.rasyid,"Said Arrasyid","2207111402");
        m15 = new ModelMahasiswa (R.drawable.sabrina,"Sabrina Awaliah Putri","2207111403");
        m16 = new ModelMahasiswa (R.drawable.zain,"Zain M. Haqqo","2207112580");
        m17 = new ModelMahasiswa (R.drawable.shadiq,"Shadiq Widi Putra","2207112581");
        m18 = new ModelMahasiswa (R.drawable.adelvanryo,"Adel Vanryo","2207112582");
        m19 = new ModelMahasiswa (R.drawable.fikri,"Fikri Rivandi","2207112583");
        m20 = new ModelMahasiswa (R.drawable.yona,"Yona Nadya Fadila","2207112585");
        m21 = new ModelMahasiswa (R.drawable.della,"Viera Adella","2207112586");
        m22 = new ModelMahasiswa (R.drawable.fadli,"Fadli Rahman","2207112587");
        m23 = new ModelMahasiswa (R.drawable.lena,"Maghdalena","2207112588");
        m24 = new ModelMahasiswa (R.drawable.azizah,"Azizah Fauni Saputri","2207112594");
        m25 = new ModelMahasiswa (R.drawable.zikri,"Zikri Ahmad Maulana","2207112596");
        m26 = new ModelMahasiswa (R.drawable.adin,"Muhammad Aldiansyah Putra","2207112597");
        m27 = new ModelMahasiswa (R.drawable.drin,"Drin Marsal Albari","2207113381");
        m28 = new ModelMahasiswa (R.drawable.alvin,"Alvin Afrinaldo","2207113382");
        m29 = new ModelMahasiswa (R.drawable.aisa,"Aisyah Dwi Syahputri","2207113385");
        m30 = new ModelMahasiswa (R.drawable.jesika,"Jesika Mentari","2207125055");
        m31 = new ModelMahasiswa (R.drawable.salma,"Wan Salma Nurkhairin Fitri","2207125057");
        m32 = new ModelMahasiswa (R.drawable.labib,"Mohd. Abulkhairi Labib","2207125064");
        m33 = new ModelMahasiswa (R.drawable.naufal,"Naufal Al Mahdy Amara Putra","2207125069");
        m34 = new ModelMahasiswa (R.drawable.berlian,"Muhammad Berlian","2207125076");
        m35 = new ModelMahasiswa (R.drawable.dinda,"Dinda Wulandari","2207125080");
        m36 = new ModelMahasiswa (R.drawable.jeki,"Zacky Julio Putra","2207135753");
        m37 = new ModelMahasiswa (R.drawable.afif,"Afif Far Hani","2207135769");
        m38 = new ModelMahasiswa (R.drawable.diaz,"Diaz Firman Syam","2207135762");
        m39 = new ModelMahasiswa (R.drawable.abdul,"M. Abdul Mas'ud","2207135765");







        listMahasiswa.add(m1);
        listMahasiswa.add(m2);
        listMahasiswa.add(m3);
        listMahasiswa.add(m4);
        listMahasiswa.add(m5);
        listMahasiswa.add(m6);
        listMahasiswa.add(m7);
        listMahasiswa.add(m8);
        listMahasiswa.add(m9);
        listMahasiswa.add(m10);
        listMahasiswa.add(m11);
        listMahasiswa.add(m12);
        listMahasiswa.add(m13);
        listMahasiswa.add(m14);
        listMahasiswa.add(m15);
        listMahasiswa.add(m16);
        listMahasiswa.add(m17);
        listMahasiswa.add(m18);
        listMahasiswa.add(m19);
        listMahasiswa.add(m20);
        listMahasiswa.add(m21);
        listMahasiswa.add(m22);
        listMahasiswa.add(m23);
        listMahasiswa.add(m24);
        listMahasiswa.add(m25);
        listMahasiswa.add(m26);
        listMahasiswa.add(m27);
        listMahasiswa.add(m28);
        listMahasiswa.add(m29);
        listMahasiswa.add(m30);
        listMahasiswa.add(m31);
        listMahasiswa.add(m32);
        listMahasiswa.add(m33);
        listMahasiswa.add(m34);
        listMahasiswa.add(m35);
        listMahasiswa.add(m36);
        listMahasiswa.add(m37);
        listMahasiswa.add(m38);
        listMahasiswa.add(m39);





        listView.setAdapter(new CustomAdapter(this,R.layout.single_list, listMahasiswa));
    }
}