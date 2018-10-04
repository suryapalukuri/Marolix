package com.example.admin.phonepe_s.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.phonepe_s.R;
//import com.debajyotibasak.phonepeclone.adapter.TransactionsAdapter;
//import com.debajyotibasak.phonepeclone.model.TransactionModel;
import com.example.admin.phonepe_s.adapter.TransactionsAdapter;
import com.example.admin.phonepe_s.model.TransactionModel;

import java.util.ArrayList;

public class TransactionsFragment extends Fragment {
    private Context context;
    private RecyclerView mRecyclerview;

    public TransactionsFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    public static TransactionsFragment newInstance() {
        TransactionsFragment fragment = new TransactionsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    private void initViews(View view) {
        mRecyclerview = view.findViewById(R.id.rv_transactions);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(context));
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transactions, container, false);
        initViews(view);

        ArrayList<TransactionModel> transactionList = new ArrayList<>();
        transactionList.add(new TransactionModel(R.drawable.ic_to_contact, "2 days ago", "Paid to",
                "Swiggy", getResources().getString(R.string.rupees) + "250", "Debited from"));
        transactionList.add(new TransactionModel(R.drawable.ic_to_contact, "3 days ago", "Paid to",
                "Zomato", getResources().getString(R.string.rupees) + "150", "Debited from"));
        transactionList.add(new TransactionModel(R.drawable.ic_to_account, "3 days ago", "Cashback from",
                "Mojo Pizza", getResources().getString(R.string.rupees) + "50", "Credited to"));
        transactionList.add(new TransactionModel(R.drawable.ic_to_contact, "3 days ago", "Paid to",
                "Mojo Pizza", getResources().getString(R.string.rupees) + "150", "Debited from"));
        transactionList.add(new TransactionModel(R.drawable.ic_to_account, "4 days ago", "Cashback from",
                "Mojo Pizza", getResources().getString(R.string.rupees) + "50", "Credited to"));
        transactionList.add(new TransactionModel(R.drawable.ic_to_contact, "4 days ago", "Paid to",
                "Mojo Pizza", getResources().getString(R.string.rupees) + "150", "Debited from"));
        transactionList.add(new TransactionModel(R.drawable.ic_to_contact, "5 days ago", "Paid to",
                "Flipkart", getResources().getString(R.string.rupees) + "250", "Debited from"));
        transactionList.add(new TransactionModel(R.drawable.ic_to_contact, "5 days ago", "Paid to",
                "Amazon", getResources().getString(R.string.rupees) + "150", "Debited from"));
        transactionList.add(new TransactionModel(R.drawable.ic_to_contact, "6 days ago", "Paid to",
                "Google Play", getResources().getString(R.string.rupees) + "250", "Debited from"));
        transactionList.add(new TransactionModel(R.drawable.ic_to_contact, "6 days ago", "Paid to",
                "Amazon", getResources().getString(R.string.rupees) + "150", "Debited from"));
        TransactionsAdapter adapter = new TransactionsAdapter(context, transactionList);
        mRecyclerview.setAdapter(adapter);
        return view;
    }

}
