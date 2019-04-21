package com.example.asus.olahraga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDeskripsi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://i5.walmartimages.com/asr/c73f42f5-165e-4c1c-9b56-8017930cae3f_3.c06b19fca32d2d6d3addbd36a56fff90.jpeg?odnHeight=560&odnWidth=560&odnBg=FFFFFF");
        mNames.add("Push Up");
        mDeskripsi.add("Tahap-tahap Melakukan Push Up\n" +
                "Tahapan-tahapan melakukan push up adalah sebagai berikut:\n" +
                "Ø  Posisi awal tidur tengkurap dengan tangan di sisi kanan kiri badan.\n" +
                "Ø  Kemudian badan didorong ke atas dengan kekuatan tangan.\n" +
                "Ø  Posisi kaki dan badan tetap lurus atau tegap.\n" +
                "Ø  Setelah itu, badan diturunkan dengan tetap menjaga kondisi badan dan kaki tetap lurus.\\\n" +
                "Ø  Badan turun tanpa menyentuh lantai atau tanah.\n" +
                "Ø  Setelah itu, naik lagi dan lakukan secara berulang.");

        mImageUrls.add("https://ids.uni.edu/15milefitness/files/2017/02/sit-up-0.jpg");
        mNames.add("Sit Up");
        mDeskripsi.add("Tahap-tahap Melakukan Sit Up\n" +
                "v  Berbaring di punggung anda. Menyentuh kaki di tanah dan membungkuk sehingga lutut mengarah ke atas. Tangan diletakkan di dada.\n" +
                "v Jalankan- Sit-up. Angkat tubuh bagian atas Anda sampai tangan Anda");

        mImageUrls.add("https://cf.shopee.co.id/file/5b5a4d50fb3d6f708452f9bd62df8c70");
        mNames.add("Dumble Tricep");
        mDeskripsi.add("Tahap - Tahap Dumble Tricep " +
                ":" +
                "* Angkat Barbel sampai ke atas seperti gambar di atas" +
                "* Ulangi sebanyak 12 x repetisi");

        mImageUrls.add("https://i5.walmartimages.com/asr/ad42927d-09ac-4dbd-ac56-7027f70efcef_1.85cee1ccfb13cb45ed8225c2a6a9065f.jpeg?odnHeight=560&odnWidth=560&odnBg=FFFFFF");
        mNames.add("Deadlift");
        mDeskripsi.add("Posisi tangan\n" +
                ">> Posisi tangan harus kira-kira selebar bahu dengan menggunakan overhand grip\n" +
                ">> Alternatif kedua adalah dengan kombinasi antara overhand dan underhand grip.\n" +
                "\n" +
                "Posisi kaki\n" +
                "Posisi kaki sedikit lebih lebar dari pinggul dan ujung kaki lurus mengarah ke depan atau sedikit keluar.\n" +
                "\n" +
                "Pinggul\n" +
                "Angkat pinggul hingga Anda merasakan tekanan atau otot hamstring Anda tertarik.\n" +
                "\n" +
                "Saat mengangkat beban\n" +
                ">> Angkat beban dengan mendorong tumit Anda dari lantai.\n" +
                ">> Jangan mencondongkan badan ke depan atau ke belakang.\n" +
                ">> Posisikan kepala sejajar dengan tulang punggung, tegak lurus, dan menghadap ke depan.\n" +
                ">> Busungkan dada Anda, namun jangan kencangkan otot di sekitar tulang belikat.\n" +
                ">> Jaga punggung pada posisi natural. Jangan membungkuk atau meratakan punggung Anda.\n" +
                ">> Jaga palang tetap dekat dengan tubuh – angkat hingga ke atas paha.\n" +
                "\n" +
                "Saat menurunkan beban\n" +
                ">> Dorong pinggul ke belakang kemudian tekuk lutut Anda ketika palang mencapai ketinggian lutut, jaga palang tetap dekat dengan tubuh lalu kembali ke posisi semula.\n" +
                ">> Atau, Anda dapat langsung menjatuhkan palang ke lantai.");

        mImageUrls.add("https://www.elitefitness.co.nz/pub/media/catalog/product/cache/image/700x560/e9c3970ab036de70892d86c6d221abfe/b/o/bowflex_selecttech_1090i_dumbbells_inclinepress.jpg");
        mNames.add("Chest Fly");
        mDeskripsi.add("Lakukan sebanyak 12 x repetisi " +
                "ulangi sebanyak 3 set");

        mImageUrls.add("https://wiki-fitness.com/wp-content/uploads/2014/04/triceps-dips.jpg");
        mNames.add("Tricep Dips");
        mDeskripsi.add("Dalam gerakan ini, Anda bisa menggunakan bangku atau tangga untuk melakukan trisep dips." +
                " Anda bisa duduk dulu dengan punggung lurus dan menempatkan kedua lengan di belakang memegang " +
                "kursi atau tangga. Kemudian tempatkan berat badan pada kedua tangan dengan meluruskan atau menekuk kedua kaki.");

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recycelrview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mDeskripsi);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
