package com.menisamet.activityfb;



import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private final static int MY_PERMISSIONS_COURSE_LOCATION = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_location);

        FloatingActionButton button = (FloatingActionButton) findViewById(R.id.floatingActionButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MapsActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng telAviv = new LatLng(32.062448, 34.765650);
        mMap.addMarker(new MarkerOptions().position(telAviv));

        CameraPosition target = CameraPosition.builder().target(telAviv).zoom(14).build();
        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(target));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(telAviv));
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Intent intent = new Intent(getBaseContext(), JoinEventActivity.class);
                intent.putExtra("TITLE_EVENT", "fun Basketball game");
                intent.putExtra("INTEREST", "Basketball");
                intent.putExtra("DETEILES", "5pm 3 people");
                intent.putExtra("USER_NAME", "https://www.facebook.com/sami.semo.108889?fref=search");
                startActivity(intent);
                return false;
            }
        });


        LatLng telAviv1 = new LatLng(32.0806262,34.7684083);
        mMap.addMarker(new MarkerOptions().position(telAviv1));
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Intent intent = new Intent(getBaseContext(), JoinEventActivity.class);
                intent.putExtra("TITLE_EVENT", "fun Basketball game");
                intent.putExtra("INTEREST", "Basketball");
                intent.putExtra("DETAILES", "5pm 3 people");
                intent.putExtra("USER_NAME", "https://www.facebook.com/sami.semo.108889?fref=search");
                startActivity(intent);
                return false;
            }
        });

        LatLng telAviv2 = new LatLng(32.0794981,34.7721494);
        mMap.addMarker(new MarkerOptions().position(telAviv2));
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Intent intent = new Intent(getBaseContext(), JoinEventActivity.class);
                intent.putExtra("TITLE_EVENT", "fun Basketball game");
                intent.putExtra("INTEREST", "Basketball");
                intent.putExtra("DETAILES", "5pm 3 people");
                intent.putExtra("USER_NAME", "https://www.facebook.com/sami.semo.108889?fref=search");
                startActivity(intent);
                return false;
            }
        });

        LatLng telAviv3 = new LatLng(32.0631611,34.7737188);
        mMap.addMarker(new MarkerOptions().position(telAviv3));
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Intent intent = new Intent(getBaseContext(), JoinEventActivity.class);
                intent.putExtra("TITLE_EVENT", "fun Basketball game");
                intent.putExtra("INTEREST", "Basketball");
                intent.putExtra("DETAILES", "5pm 3 people");
                intent.putExtra("USER_NAME", "https://www.facebook.com/sami.semo.108889?fref=search");
                startActivity(intent);
                return false;
            }
        });

        LatLng telAviv4 = new LatLng(32.0683742,34.7661822);
        mMap.addMarker(new MarkerOptions().position(telAviv4));
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Intent intent = new Intent(getBaseContext(), JoinEventActivity.class);
                intent.putExtra("TITLE_EVENT", "fun Basketball game");
                intent.putExtra("INTEREST", "Basketball");
                intent.putExtra("DETAILES", "5pm 3 people");
                intent.putExtra("USER_NAME", "https://www.facebook.com/sami.semo.108889?fref=search");
                startActivity(intent);
                return false;
            }
        });

        LatLng telAviv5 = new LatLng(32.0778768, 34.735675767);
        mMap.addMarker(new MarkerOptions().position(telAviv5));
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Intent intent = new Intent(getBaseContext(), JoinEventActivity.class);
                intent.putExtra("TITLE_EVENT", "fun Basketball game");
                intent.putExtra("INTEREST", "Basketball");
                intent.putExtra("DETAILES", "5pm 3 people");
                intent.putExtra("USER_NAME", "https://www.facebook.com/sami.semo.108889?fref=search");
                startActivity(intent);
                return false;
            }
        });

        LatLng telAviv6 = new LatLng(32.0627512,34.7811311);
        mMap.addMarker(new MarkerOptions().position(telAviv6));
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Intent intent = new Intent(getBaseContext(), JoinEventActivity.class);
                intent.putExtra("TITLE_EVENT", "fun Basketball game");
                intent.putExtra("INTEREST", "Basketball");
                intent.putExtra("DETAILES", "5pm 3 people");
                intent.putExtra("USER_NAME", "https://www.facebook.com/sami.semo.108889?fref=search");
                startActivity(intent);
                return false;
            }
        });



        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {
            requestPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, MY_PERMISSIONS_COURSE_LOCATION);
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case MY_PERMISSIONS_COURSE_LOCATION:
                if (grantResults[0] == PackageManager.PERMISSION_DENIED) {
                    if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                        mMap.setMyLocationEnabled(true);
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "This app requires location permissions to be granted", Toast.LENGTH_LONG).show();
                    finish();
                }
                break;
        }
    }

    public void nextToNewEvent(View view)
    {
        Intent intent = new Intent(this, addMenu.class);
        startActivityForResult(intent,100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100) {
            if (resultCode == RESULT_OK) {
                Intent intent = new Intent(getBaseContext(), JoinEventActivity.class);
                intent.putExtra("TITLE_EVENT",data.getStringExtra("Title"));
                intent.putExtra("DETAILES",data.getStringExtra("Body"));
                intent.putExtra("Location",data.getStringExtra("Location"));
                intent.putExtra("INTEREST",data.getStringExtra("Interest"));
                intent.putExtra("USER_NAME", "https://www.facebook.com/sami.semo.108889?fref=search");
                startActivity(intent);
            }
        }
    }

}