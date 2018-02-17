package com.codingdemos.shareplace;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.navagio, R.drawable.anse_source_dargent,
                R.drawable.as_catedrais, R.drawable.la_concha, R.drawable.bondi, R.drawable.nissi};

        placeNames = new String[]{"Navagio Beach", "Anse Source d'Argent Beach", "As Catedrais Beach",
                "La Concha Beach", "Bondi Beach", "Nissi Beach"};

        placeGuide = new String[]{"https://www.tripadvisor.com.my/Attraction_Review-g7777607-" +
                "d671779-Reviews-Navagio_Beach_Shipwreck_Beach-Anafonitria_Zakynthos_Ionian_Islands.html",
                "https://www.tripadvisor.com.my/Attraction_Review-g477968-d637885-Reviews-Anse_Source_D_Argent" +
                        "-La_Digue_Island.html",
                "https://www.tripadvisor.com.my/Attraction_Review-g609028-d1547522-Reviews-As_Catedrais_Beach-Ribadeo_" +
                        "Province_of_Lugo_Galicia.html",
                "https://www.tripadvisor.com.my/Attraction_Review-g187457-d675885-Reviews-La_Concha_Beach-San_Sebastian" +
                        "_Donostia_Province_of_Guipuzcoa_Basque_Country.html",
                "https://www.tripadvisor.com.my/Attraction_Review-g255060-d257354-Reviews-Bondi_Beach-Sydney_" +
                        "New_South_Wales.html",
                "https://www.tripadvisor.com.my/Attraction_Review-g262055-d1519581-Reviews-Nissi_Beach-Ayia_" +
                        "Napa_Famagusta_District.html"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapter);
    }
}
