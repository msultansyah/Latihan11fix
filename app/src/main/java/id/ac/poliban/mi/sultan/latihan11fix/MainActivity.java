package id.ac.poliban.mi.sultan.latihan11fix;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btPhone = findViewById(R.id.btPhone);
        Button btEmail = findViewById(R.id.btEmail);
        Button btWebsite = findViewById(R.id.btWebsite);
        Button btGeo = findViewById(R.id.btGeo);



        btPhone.setOnClickListener(v -> {
            Uri uri = Uri.parse("tel: 082254906696");
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        });

        btEmail.setOnClickListener(v -> {
            Uri uri = Uri.parse("mailto: msultansyah11@gmail.com");
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);

        });

        btWebsite.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/msultansyah"))));
        btGeo.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/@-3.2855083,114.5835054,16z"))));
    }
}
