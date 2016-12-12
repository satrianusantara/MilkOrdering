package makers.android.milkordering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //variabel untuk menghitung jumlah order
    int quantityOfmilk = 0;
    //variabel untuk menghitung order total
    int totalPriceOfOrderMilk = 0;
    //variabel harga milk
    final int priceOfMilk = 5;
    //tipe data textview untuk nanti menampilkan order
    TextView quantityTextView;

    TextView totalPriceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menghubungkan antara variabel global pada java dengan textview yang ada di xml
        quantityTextView = (TextView)findViewById(R.id.quantityMilkTextView);
        totalPriceTextView = (TextView)findViewById(R.id.priceOrderMilkTextView);


    }
    //method untuk increment order
    public void incrementOrder(View view){
        if (quantityOfmilk==20){
            quantityOfmilk +=0;
            quantityTextView.setText(""+quantityOfmilk);
        }else {
            quantityOfmilk +=1;
            quantityTextView.setText(""+quantityOfmilk);
        }
        Log.v("incrementOrder","total : "+quantityOfmilk);


    }
    public void decrementOrder(View view){

        if (quantityOfmilk>0){
            quantityOfmilk -=1;
            quantityTextView.setText(""+quantityOfmilk);
        }else {
            quantityOfmilk-=0;
            quantityTextView.setText(""+quantityOfmilk);
        }
        Log.e("incrementOrder","total : "+quantityOfmilk);

    }
    public void showTotalPrice(View view){
        //perhitungan jumlah harga yang harus dibayarkan
        totalPriceOfOrderMilk = priceOfMilk * quantityOfmilk;
        //set text ke textview sejumla hasil perhitungan
        totalPriceTextView.setText("$"+totalPriceOfOrderMilk);
    }
    public void reset(View view){
        quantityOfmilk=0;
        quantityTextView.setText(""+quantityOfmilk);
        totalPriceTextView.setText("");

    }


}
