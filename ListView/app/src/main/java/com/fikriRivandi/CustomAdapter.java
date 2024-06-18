package com.fikriRivandi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.shadiqwidi.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
public class CustomAdapter extends ArrayAdapter<ModelMahasiswa>{

    private List<ModelMahasiswa> listMahasiswa;
    private Context mContext;
    private int layout;

    static class  MahasiwaHolder{
        ImageView fotoMahasiswa;
        TextView namaMahasiswa;
        TextView nimMahasiswa;

    }
    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<ModelMahasiswa> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.listMahasiswa = objects;
        this.layout = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        MahasiwaHolder holder;

        if (v==null){
            LayoutInflater li = ((Activity)mContext).getLayoutInflater();
            v=li.inflate(layout, parent, false);

            holder = new MahasiwaHolder();
            holder.fotoMahasiswa=v.findViewById(R.id.foto);
            holder.namaMahasiswa=v.findViewById(R.id.nama);
            holder.nimMahasiswa=v.findViewById(R.id.nim);

            v.setTag(holder);
        }else{
            holder = (MahasiwaHolder) v.getTag();
        }

        ModelMahasiswa mahasiswa = listMahasiswa.get(position);
        holder.fotoMahasiswa.setImageResource(mahasiswa.getmImage());
        holder.namaMahasiswa.setText(mahasiswa.getNama());
        holder.nimMahasiswa.setText(mahasiswa.getNim());
//
//        return super.getView(position, convertView, parent);
        return v;
    }
}