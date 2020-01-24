package com.example.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private WebView webview;

        public ViewHolder(View itemView) {
            super(itemView);
            webview = (WebView) itemView.findViewById(R.id.webview);
        }
    }

    public List<Recurso> recursos;


    public RecyclerViewAdapter(List<Recurso> recursos) {
        this.recursos = recursos;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
         View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video, parent,false);
         ViewHolder viewHolder =  new ViewHolder(view);
         return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.webview.setWebViewClient(new WebViewClient());
        holder.webview.getSettings().setJavaScriptEnabled(true);
        holder.webview.getSettings().setBuiltInZoomControls(true);
        holder.webview.loadUrl(recursos.get(position).getUrl());
     }

    @Override
    public int getItemCount() {
        return recursos.size();
    }


}

