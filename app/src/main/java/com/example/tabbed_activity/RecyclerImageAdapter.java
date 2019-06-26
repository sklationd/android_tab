package com.example.tabbed_activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerImageAdapter extends RecyclerView.Adapter<RecyclerImageAdapter.ViewHolder> {
    private ArrayList<AlbumRecyclerItem> mData = null ;

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView photo ;
        //TextView desc ;
        ViewHolder(View itemView) {
            super(itemView) ;
            // 뷰 객체에 대한 참조. (hold strong reference)
            photo = itemView.findViewById(R.id.photo);
            //desc = itemView.findViewById(R.id.desc) ;
        }
    }

    // 생성자에서 데이터 리스트 객체를 전달받음.
    RecyclerImageAdapter(ArrayList<AlbumRecyclerItem> list) {
        mData = list ;
    }

    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.album_recyclerview_item, parent, false) ;
        ViewHolder vh = new ViewHolder(view) ;

        return vh ;
    }

    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        AlbumRecyclerItem item = mData.get(position) ;

        holder.photo.setImageDrawable(item.getPhoto()) ;
        //holder.desc.setText(item.getDesc()) ;
    }

    // getItemCount() - 전체 데이터 갯수 리턴.
    @Override
    public int getItemCount() {
        return mData.size() ;
    }
}