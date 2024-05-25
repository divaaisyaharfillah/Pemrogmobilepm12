package com.example.praktikum8;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder>{

    private Context context;
    private List<Notes> notesList; //untuk menyimpan daftar catatan.

    public NotesAdapter(Context context, List<Notes> notesList) {
        this.context = context;
        this.notesList = notesList;
    }

    @NonNull
    @Override
    public NotesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.search, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesAdapter.ViewHolder holder, int position) {
        Notes notes = notesList.get(position);
        holder.tvTitle.setText(notes.getJudul());
        holder.tvDesc.setText(notes.getDeskripsi());

        String timestampText; //untuk menyimpan teks timestamp.
        if (notes.getCreatedAt().equals(notes.getUpdatedAt())) { //cek apakah waktu pembuatan (createdAt) sama dengan waktu pembaruan (updatedAt).
            timestampText = "Created at " + notes.getCreatedAt(); //jika sama, sama ji brrti waktunya
        } else {
            timestampText = "Updated at " + notes.getUpdatedAt(); //diatur ke "Updated at" diikuti oleh waktu pembaruan.
        }
        holder.tvTimestamp.setText(timestampText); //untuk menampilkan teks timestamp.

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, UpdateActivity.class);
            intent.putExtra("record_id", notes.getId());
            context.startActivity(intent);
        });
    }




    @Override
    public int getItemCount() {
        return notesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvDesc, tvTimestamp;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDesc = itemView.findViewById(R.id.tv_desc);
            tvTimestamp = itemView.findViewById(R.id.tv_timestamp);
        }
    }
}
