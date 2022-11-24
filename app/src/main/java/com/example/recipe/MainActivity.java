package com.example.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Ayam Bakar","800 g (1 ekor) ayam pejantan, potong jadi 4 bagian\n" +
                "4 lembar daun salam\n" +
                "2 batang serai, memarkan\n" +
                "20 g asam Jawa, larutkan dengan 3 sdm air panas \n" +
                "500 ml santan\n" +
                "2 sdm minyak, untuk menumis\n" +
                "10 butir bawang merah\n" +
                "5 siung bawang putih\n" +
                "1 sdm ketumbar, sangrai\n" +
                "5 butir kemiri\n" +
                "½ sdt merica bubuk\n" +
                "3 cm kunyit\n" +
                "50 g gula merah, sisir halus\n" +
                "1 sdt garam\n" +
                "1 sdt gula pasir\n" +
                "1 sdm Bango Kecap Manis","Method","Panaskan minyak, tumis bumbu halus, daun salam, dan serai hingga harum.\n" +
                "Masukkan air larutan asam Jawa dan ayam, aduk rata.\n" +
                "Tuangkan santan, aduk perlahan agar santan tidak pecah.\n" +
                "Masak hingga santan meresap dan ayam empuk. Angkat dan sisihkan.\n" +
                "Panaskan wajan, panggang ayam sambil diolesi bumbu halus dan kecap. Panggang hingga berwarna kecokelatan.\n" +
                "Angkat dan sajikan.",R.drawable.ayambakar));

        recipes1.add(new Recipes("Bubur Ayam","1 cup beras\n"+
                "1 liter air kaldu ayam\n"+
                "2 liter air\n"+
                "4 lembar daun salam\n"+
                "1 potong dada ayam rebus, suwir\n"+
                "1 sdt merica bubuk\n"+
                "1,5 sdt garam\n"+
                "30 ml santan instan\n"+
                "1/2 sdt kaldu bubuk\n","Method",
                "1. Rebus beras dengan 1 liter air dan daun salam, biarkan sampai beras menjadi lembek (api sedang).\n" +
                        "2. Jika air sudah sedikit menyusut, tambahkan air kaldu, biarkan sampai beras menjadi bubur (sambil sesekali diaduk).\n" +
                        "3. Tambahkan garam, kaldu bubuk, merica, dan santan, aduk rata.\n" +
                        "4. Jika bubur masih belum lembek, bisa tambahkan sisa air (1 liter) sampai bubur benar-benar lembek sempurna.\n" +
                        "5. Aduk terus jangan sampai bagian bawahnya gosong. Jika bubur sudah set, matikan api.",R.drawable.buburayam));

        recipes1.add(new Recipes("Gado-gado","Bahan:\n" +
                "- 5 buah lontong, potong-potong\n" +
                "- 1/4 daun selada, cuci bersih\n" +
                "- 1/4 tauge, seduh air panas\n" +
                "- 5 lembar daun kol, iris dan rebus\n" +
                "- 1 ikat kacang panjang\n" +
                "- 4 buah kentang, rebus\n" +
                "- 6 buah telur, rebus\n" +
                "- 2 buah timun, iris-iris\n" +
                "- 2 buah wortel, iris korek api dan rebus\n" +
                "- 6 buah telur, rebus\n" +
                "- 1 papan tempe, goreng\n" +
                "- 3 buah tahu putih, goreng\n" +
                "- 4 buah tomat\n\n " +
                "Bahan bumbu kacang:\n" +
                "- 500 gr kacang tanah, goreng\n" +
                "- 20 siung bawang putih, goreng\n" +
                "- 5 buah cabai merah besar, goreng\n" +
                "- 5 buah cabai merah keriting\n" +
                "- 150 gr gula merah, sisir\n" +
                "- 8 buah asam Jawa\n" +
                "- 2 sdt terasi, bakar/goreng\n" +
                "- 4 sdt garam\n" +
                "- 5-6 sdm gula pasir\n" +
                "- 1200 ml santan","Method","\n" +
                "1. Blender semua bahan bumbu kacang sampai halus.\n" +
                "2. Rebus dengan api kecil hingga mendidih. Tes rasa.\n" +
                "3. Terus masak bumbu kacang hingga matang sampai meletup-letup dan kental.\n" +
                "4. Angkat dan sisihkan.\n" +
                "5. Penyajian: Ambil piring, tata rapi semua bahan gado-gado. Siram dengan saus kacang dan taburi dengan bawang goreng dan beri kerupuk secukupnya.",R.drawable.gadogado));

        recipes1.add(new Recipes("Geprek","Bumbu marinasi ayam: \n" +
                " 250 gram daging ayam (bersihkan dan potong-potong) \n" +
                "1 buah lemon \n" +
                "1 sendok makan ketumbar\n" +
                " 1 sendok makan all purpose seasoning\n " +
                "1/4 sendok makan kaldu bubuk \n" +
                "1 sendok teh garam\n" +
                " 1 sendok teh lada \n\n" +
                "Adonan pelapis ayam: \n" +
                "5 sendok makan tepung terigu\n" +
                " 1 sendok makan kaldu bubuk \n" +
                " 1/2 sendok teh baking powder \n" +
                "1/4 sendok te baking soda 600 mililiter air es\n"
                ,"Method",
                "1. Campur ayam dengan air lemon, ketumbar, all porpuse seasoning, kaldu bubuk, garam, dan lada di dalam wadah, lalu baluri ayam dengan bumbu hingga rata. Biarkan bumbu marinasi meresap selama 30 menit.\n" +
                        " 2. Campur tepung terigu, kaldu bubuk, baking powder, dan baking soda hingga rata, lalu sisihkan untuk adonan tepung kering. Kemudian tuang air es ke dalam wadah terpisah dan sisihkan untuk bahan celup.\n " +
                        "3. Baluri daging ayam yang sudah dimarinasi ke dalam tepung kering, setelah itu celupkan ayam ke dalam air es. Kemudian celup kembali ayam ke dalam tepung kering  dan ulangi hingga ayam dibaluri semua dengan tepung.\n" +
                        " 4. Goreng ayam di dalam minyak panas menggunakan api kecil hingga matang dan berubah warna menjadi kecoklatan. Setelah itu angkat dan sajikan ayam bersama sambal geprek.\n"
                ,R.drawable.geprek));

        recipes1.add(new Recipes("Martabak keju","\n" +
                "300 ml air hangat\n" +
                "1 sdt ragi instan\n" +
                "2 sdm gula pasir\n" +
                "\n" +
                "250 g tepung terigu\n" +
                "3 sdm gula pasir\n" +
                "1 sdm susu bubuk fullcream\n" +
                "1/2 sdt baking powder\n" +
                "3 butir telur ayam\n" +
                "2 sdm gula pasir\n" +
                "1 sdt soda kue\n" +
                "30 g margarin lelehkan\n" +
                "Topping:\n" +
                "susu kental manis\n" +
                "keju cheddar parut\n" +
                "\n","Method",
                "1. Taruh ragi instan dan gula dalam mangkuk. Beri 100 ml air hangat dan aduk hingga larut. Sisihkan.\n" +
                        "2. Campur tepung terigu, gula, susu bubuk dan baking powder hingga rata.\n" +
                        "3. Tambahkan sisa air sedikit sedikit hingga tercampur rata.\n" +
                        "4. Kocok telur dan gula pasir hingga gula larut.\n" +
                        "5. Tuangkan ke dalam adonan tepung lalu aduk hingga tercampur rata.\n" +
                        "6. Masukkan larutan ragi, soda kue dan margarin leleh, aduk-aduk hingga licin dan diamkan hingga sedikit mengembang.\n" +
                        "7. Panaskan cetakan di atas api sedang. Tuangkan adonan ke dalam lubang cetakan sambil tekan dengan sendok sayur agar terbentuk lapisan tipis di kelilingnya.\n" +
                        "8. Setelah berlubang-lubang kecil, tutup cetakan, masak hingga agak kecokelatan.\n" +
                        "9. Angkat martabak, olesi/kucuri sedikit susu kental manis dan taburi keju cheddar.\n" ,R.drawable.martabak));
        recipes1.add(new Recipes("Mie Goreng","200 gr mie kuning kering\n" +
                "daun bawang secukupnya, potong-potong\n" +
                "\n" +
                "2 sdm kecap manis\n" +
                "1 sdm kecap asin\n" +
                "1 sdt saus cabai\n" +
                "2 siung bawang putih, haluskan\n" +
                "1 siung bawang merah, haluskan\n" +
                "1/4 sdt kaldu bubuk\n" +
                "garam dan lada bubuk secukupnya","Method",
                "Rebus hingga matang dengan sedikit minyak. Tiriskan.\n" +
                        "Tumis bawang hingga matang, masukkan daun bawang dan tumis hingga layu.\n" +
                        "Masukkan kecap manis, saus cabai, lada bubuk dan kaldu bubuk. Aduk rata.\n" +
                        "Masukkan mie dan tuang sedikit air.\n" +
                        "Masak hingga bumbu merata dan air habis. Sajikan.\n" +
                        "Mie goreng kecap siap sajikan hangat.",R.drawable.miegoreng));
        recipes1.add(new Recipes("Rawon","- 600 gr Daging Sapi untuk rawon/ sandung lamur\n" +
                "- 2 ltr Air\n" +
                "- 2 lbr Daun Salam\n" +
                "- 3 btg Serai, memarkan\n" +
                "- 3 cm Lengkuas, memarkan\n" +
                "- 3 lbr Daun Jeruk\n" +
                "- 5 sdm Minyak untuk menumis\n" +
                "Bumbu halus:\n" +
                "- 5 siung Bawang Merah\n" +
                "- 3 siung Bawang Putih\n" +
                "- 4 bh Cabai Merah\n" +
                "- 2 btr Kemiri\n" +
                "- 1 sdt Ketumbar\n" +
                "- 3 bh Keluak Tua, kukus, ambil isinya\n" +
                "- 2 cm Jahe\n" +
                "- 3 cm Kunyit\n" +
                "- 1 sdt Terasi matang\n" +
                "- 2 sdt Garam\n" +
                "- 1 sdt AJI-NO-MOTO®\n" +
                "- 2 tangkai Daun Bawang, iris\n" +
                "- 100 gr Tauge pendek (tauge soto)\n" +
                "- 2 btr Telur Asin","Method",
                "Langkah 1\n" +
                        "\n" +
                        "Masak daging bersama daun salam, serai, lengkuas, dan daun jeruk sampai empuk dan matang.\n" +
                        "\n" +
                        "Langkah 2\n" +
                        "\n" +
                        "Angkat daging, lalu potong kecil-kecil. Saring rebusan, didihkan lagi bersama irisan daging.\n" +
                        "\n" +
                        "Langkah 3\n" +
                        "\n" +
                        "Panaskan minyak, tumis bumbu halus bersama irisan daun bawang sampai harum dan matang\n" +
                        "\n" +
                        "Langkah 4\n" +
                        "\n" +
                        "Angkat, lalu masukkan ke dalam kaldu daging. Masak dengan api kecil sampai mendidih kembali\n" +
                        "\n" +
                        "Langkah 5\n" +
                        "\n" +
                        "Tuang rawon ke dalam mangkuk, taburkan tauge pendek di atasnya. Sajikan bersama telur asin dan sambal terasi.",R.drawable.rawon));
        recipes1.add(new Recipes("Seblak","1 bungkus mi rebus\n" +
                "1 mangkuk kecil kerupuk, rendam dalam air mendidih\n" +
                "3 sdm makaroni, rebus\n" +
                "1 butir telur ayam\n" +
                "2 buah sosis ayam\n" +
                "5 buah bakso sapi\n" +
                "1 ikat sayur pokcoy\n" +
                "7 buah cabai merah\n" +
                "9 buah cabai kering\n" +
                "7 buah cabai rawit\n" +
                "4 siung bawang putih\n" +
                "2 ruas kencur\n" +
                "1 sdt kaldu bubuk","Method",
                "Iris semua bahan sayur dan sosis.\n" +
                        "Rebus mi sebentar. Angkat dan tiriskan.\n" +
                        "Haluskan semua bahan cabai, bawang, dan kencur.\n" +
                        "Tumis bumbu halus hingga harum.\n" +
                        "Masukkan bakso, sosis, dan sayur ke tumisan.\n" +
                        "Tambahkan air ke tumisan.\n" +
                        "Masukkan mi, makaroni, dan kerupuk. Tambahkan kaldu bubuk.\n" +
                        "Masak hingga semua bahan matang dan bumbu meresap. Angkat dan sajikan..",R.drawable.seblak));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
