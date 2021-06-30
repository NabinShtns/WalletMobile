package com.nabin.mobilewallet.MyAdapter;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nabin.mobilewallet.R;
import com.nabin.mobilewallet.model.moodel;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    Context mContext;
    List<moodel> moodellist;
    public MyAdapter(Context mContext, List<moodel> moodelList) {
        this.mContext = mContext;
        this.moodellist = moodelList;
    }





    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_view,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       moodel moodel = moodellist.get(position);
       holder.tvname.setText(moodel.getTvname());
       holder.tvlocation.setText(moodel.getTvlocation());

    }

    @Override
    public int getItemCount() {
        return moodellist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvname, tvlocation;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            tvname= itemView.findViewById(R.id.Name);
            tvlocation= itemView.findViewById(R.id.Location);
        }
    }
}
