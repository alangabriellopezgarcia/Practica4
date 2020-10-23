package mx.edu.tesoem.isc.jagg.a7s21prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class urlActivity extends AppCompatActivity {

    ImageView MiImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        MiImagen = findViewById(R.id.miimagen);


        Picasso.get()
                .load( "https://www.muycomputer.com/wp-content/uploads/2019/12/android.jpg")
                .fit()
                .error(R.mipmap.ic_launcher_round)
                .into(MiImagen);
    }
}