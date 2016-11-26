package quyt.com.listview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nguye on 24/10/2016.
 */
public class MyAdapter extends BaseAdapter {
    private ArrayList<item> lst;
    private LayoutInflater inflater;//dùng để lấy ra file giao diện đã thiết kế (res/layot/
    Context context;

    public MyAdapter(Context context, ArrayList<item> list) {
        lst = list;
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public int getCount() {//sl cần để vẽ danh sách
        return lst.size();
    }

    @Override
    public Object getItem(int i) {//lấy phần tử
        return null;
    }

    @Override
    public long getItemId(int i) {//
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {//vẽ giao diện 1 dòng
        ViewHolder viewHolder = null;//thiêt lập liên kết đến các đối tượng trong 1 item của listview
        //tránh việc findviewbyid quá nhiều
        if (view == null) {
            view = inflater.inflate(R.layout.item_layout, null);
            viewHolder = new ViewHolder();
            viewHolder.tvTen = (TextView) view.findViewById(R.id.tvTen);
            viewHolder.tvSdt = (TextView) view.findViewById(R.id.tvSDT);
            viewHolder.imgv = (ImageView) view.findViewById(R.id.imvHinh);
            view.setTag(viewHolder);//dùng để lưu viewholder vào một item của listview
        } else {
            viewHolder = (ViewHolder) view.getTag();//lấy viewholder đã thiết lặp từ trước
        }
        item data = lst.get(i);
        //View v=inflater.inflate(R.layout.item_layout,null);
        //TextView tvTen= (TextView)v.findViewById(R.id.tvTen);
        viewHolder.tvTen.setText(data.getTen());//v.setText(data.getTen());
        //TextView tvSDT= (TextView)v.findViewById(R.id.tvSDT);
        viewHolder.tvSdt.setText(data.getSdt());//v.setText(data.getSdt());
        //ImageView img= (ImageView)v.findViewById(R.id.imvHinh);
        int resID = context.getResources().getIdentifier(data.getHinh(),
                "drawable", context.getPackageName());
        viewHolder.imgv.setImageResource(resID);//v.setImageResource(resID);
        return view;
    }

    private class ViewHolder {
        TextView tvTen, tvSdt;
        ImageView imgv;
    }
}
