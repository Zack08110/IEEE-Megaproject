package com.example.sentry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

public class HotelInformation extends AppCompatActivity {
    private RecyclerView recyclerView;
    String hotel_name[],hotel_rating[],hotel_price[],location[],link[],hotel_detail[],city_name[],hotel_number[];

    String Tag ="my recycler data";
    int images[]={R.drawable.arya,R.drawable.green_acres,R.drawable.akashdeep,
            R.drawable.pratap_grand,R.drawable.hotel_inn,R.drawable.stayzz_hotel,R.drawable.lemon_tree,
            R.drawable.hotel_premier,R.drawable.pod_n_beyond,R.drawable.hotel_natraj,R.drawable.alcor_hotel,
            R.drawable.j_k_residency
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_information);
        recyclerView = findViewById(R.id.re_vw);
        hotel_name=getResources().getStringArray(R.array.hotelName);
        hotel_rating=getResources().getStringArray(R.array.hotelRating);
        hotel_price=getResources().getStringArray(R.array.RoomPrice);
        location=getResources().getStringArray(R.array.state_city);
        link=getResources().getStringArray(R.array.hotelLink);
        hotel_detail=getResources().getStringArray(R.array.HotelDetails);
        city_name=getResources().getStringArray(R.array.location);
        hotel_number=getResources().getStringArray(R.array.hotelnumber);
        Log.v(Tag,"The code working");
        hotelInformationAdaptor hotelInformationAdaptor=new hotelInformationAdaptor(this,hotel_name,hotel_rating,hotel_price,location,hotel_detail,city_name,hotel_number,link,images);
        //setting my adaptor
        recyclerView.setAdapter(hotelInformationAdaptor);
        //layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}