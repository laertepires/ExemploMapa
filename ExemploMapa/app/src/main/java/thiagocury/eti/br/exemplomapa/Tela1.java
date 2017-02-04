package thiagocury.eti.br.exemplomapa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
    }//fecha onCreate

    public void abrirMapa(View view) {
        Intent it = new Intent(Tela1.this,Mapa.class);
        startActivity(it);
    }
}
