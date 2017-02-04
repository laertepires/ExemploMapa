package thiagocury.eti.br.exemplomapa;

import android.graphics.BitmapFactory;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Adicionando marcador na QI de Canoas
        LatLng qiCanoas = new LatLng(-29.904285, -51.177601);
        mMap.addMarker(
                new MarkerOptions()
                        .position(qiCanoas)
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher))
                        .title("QI Canoas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(qiCanoas));
        //Movimentando o zoom da camera
        mMap.moveCamera(CameraUpdateFactory.zoomTo(6));
    }
}
