package a24help.com.a24help;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import a24help.com.a24help.entidade.Curriculo;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;


/**
 * A simple {@link Fragment} subclass.
 */
public class CurriculoFragment extends Fragment {

    private DatabaseReference databaseReference;

    EditText editCPF;
    Button btnSave;

    public CurriculoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_curriculo, container, false);
        databaseReference = FirebaseDatabase.getInstance().getReference();


        editCPF = (EditText)view.findViewById(R.id.txtCPf);
        btnSave = (Button)view.findViewById(R.id.btnsave);


        btnSave.setOnClickListener(new View.OnClickListener (){

            @Override
            public void onClick(View v) {
                addCurriculo();

            }
        });

        return view;

    }


    private void  addCurriculo(){
        String cpf = editCPF.getText().toString().trim();
        if(!TextUtils.isEmpty(cpf)){
            String id = databaseReference.push().getKey();

            //Curriculo curriculo = new Curriculo(id, cpf);

            //databaseReference.child(id).setValue(curriculo);
            editCPF.setText("");

            Toast.makeText(getContext(), "Currilo salvo", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getContext(), "campos em brancos", Toast.LENGTH_SHORT).show();
        }
    }
}
