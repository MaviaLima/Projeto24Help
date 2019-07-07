package a24help.com.a24help;


import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import a24help.com.a24help.entidade.Curriculo;
import a24help.com.a24help.entidade.DisponibilizacaoServico;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment  implements LocationListener{

    private GoogleMap mMap;
    private GoogleApiClient mGoogleApiClient;
    private LatLng localizacao;
    private DatabaseReference databaseReference;

    EditText editDesc;
    Switch swAtivo;
    Button btnDisp;

    public static final int PERMISSAO=1;
    Location location = null;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        databaseReference = FirebaseDatabase.getInstance().getReference();

        editDesc = (EditText) view.findViewById(R.id.idDesc);
        swAtivo = (Switch) view.findViewById(R.id.idAtivo);
        btnDisp = (Button) view.findViewById(R.id.idDisponibilizar);

        // Inflate the layout for this fragment

        return view;


    }


    private void disponibilizarServico(){
    String descricao = editDesc.getText().toString().trim();
    String ativo = swAtivo.getText().toString().trim();
    String latitude = null;
    String longitude = null;


        if(!TextUtils.isEmpty(ativo)){
            String id = databaseReference.push().getKey();

            DisponibilizacaoServico disponibilizacaoServico = new DisponibilizacaoServico(id,latitude,longitude,ativo,descricao)


            databaseReference.child("disponibilizaServico" + id).setValue(disponibilizacaoServico);


            Toast.makeText(getContext(), "Currilo salvo" , Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getContext(), "campos em brancos", Toast.LENGTH_SHORT).show();
        }

    }


    public void lerCoordenadas() {

        if(ContextCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.ACCESS_FINE_LOCATION},PERMISSAO);

        }else{
            LocationManager locationManager = (LocationManager)getSystemServices

    }
}


    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}