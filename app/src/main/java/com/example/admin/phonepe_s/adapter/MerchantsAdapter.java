package com.example.admin.phonepe_s.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.phonepe_s.R;
import com.example.admin.phonepe_s.model.MerchantModel;
import com.example.admin.phonepe_s.model.MerchantModel;

import java.util.ArrayList;

//import javax.naming.Context;
//import javax.swing.text.View;

public class MerchantsAdapter extends RecyclerView.Adapter<MerchantsAdapter.MyViewHolder> {

    private ArrayList<MerchantModel> merchantList;
    private Context context;

    public MerchantsAdapter(Context context, ArrayList<MerchantModel> merchantList) {
        this.merchantList = merchantList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_merchants, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mTxvMerchantName.setText(merchantList.get(position).getMerchant_name());
        holder.mTxvDiscountType.setText(merchantList.get(position).getDiscount_type());
        holder.mTxvDiscountAmount.setText(merchantList.get(position).getDiscount_amount());
        holder.mTxvDiscountMedium.setText(merchantList.get(position).getDiscount_medium());
        holder.mTxvDiscountDescription.setText(merchantList.get(position).getDiscount_description());
    }

    @Override
    public int getItemCount() {
        return merchantList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView mTxvMerchantName, mTxvDiscountType, mTxvDiscountAmount, mTxvDiscountMedium, mTxvDiscountDescription;

        public MyViewHolder(View itemView) {
            super(itemView);

            mTxvMerchantName = itemView.findViewById(R.id.txv_merchant_name);
            mTxvDiscountType = itemView.findViewById(R.id.txv_discount_type);
            mTxvDiscountAmount = itemView.findViewById(R.id.txv_discount_amount);
            mTxvDiscountMedium = itemView.findViewById(R.id.txv_discount_medium);
            mTxvDiscountDescription = itemView.findViewById(R.id.txv_discount_description);
        }
    }
}
