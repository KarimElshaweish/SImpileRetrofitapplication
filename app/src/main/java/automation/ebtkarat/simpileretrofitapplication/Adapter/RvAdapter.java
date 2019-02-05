package automation.ebtkarat.simpileretrofitapplication.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import automation.ebtkarat.simpileretrofitapplication.Data.Data;
import automation.ebtkarat.simpileretrofitapplication.R;

/**
 * Created by Antnna on 05-Feb-19.
 */

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.CustomeViewGroup> {
    Context _ctx;
    List<Data>dateList;

    public RvAdapter(Context _ctx, List<Data> dateList) {
        this._ctx = _ctx;
        this.dateList = dateList;
    }

    @Override
    public CustomeViewGroup onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate=LayoutInflater.from(_ctx).inflate(R.layout.rv_item,parent,false);

        return new CustomeViewGroup(inflate);
    }

    @Override
    public void onBindViewHolder(CustomeViewGroup holder, int position) {
            holder.txtInfo.setText(dateList.get(position).getTitle());
            Picasso.with(_ctx).load(dateList.get(position).getUrl()).into(holder.imgInfo);
    }

    @Override
    public int getItemCount() {
        return dateList.size();
    }

    public class CustomeViewGroup extends RecyclerView.ViewHolder {
        ImageView imgInfo;
        TextView txtInfo;
        public CustomeViewGroup(View itemView) {
            super(itemView);
            imgInfo=itemView.findViewById(R.id.img_info);
            txtInfo=itemView.findViewById(R.id.info_text);
        }
    }
}
