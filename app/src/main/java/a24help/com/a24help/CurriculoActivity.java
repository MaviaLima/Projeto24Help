package a24help.com.a24help;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import a24help.com.a24help.entidade.Curriculo;

public class CurriculoActivity extends AppCompatActivity {

    private DatabaseReference databaseReference;

    EditText editCPF;
    EditText editCategoria;
    EditText editServico;
    EditText editExperiencia;
    EditText editDescricao;

    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curriculo);

        databaseReference = FirebaseDatabase.getInstance().getReference();


        editCPF = (EditText)findViewById(R.id.txtCPf);
        editCategoria = (EditText)findViewById(R.id.txtCategoria);
        editDescricao = (EditText)findViewById(R.id.txtDescricao);
        editServico = (EditText)findViewById(R.id.txtServico);
        editExperiencia = (EditText)findViewById(R.id.txtExperiencia);
        btnSave = (Button)findViewById(R.id.btnsave);

        btnSave.setOnClickListener(new View.OnClickListener (){

            @Override
            public void onClick(View v) {
                addCurriculo();


            }
        });


    }

    private void  addCurriculo(){
        String cpf = editCPF.getText().toString().trim();
        String experiencia =editExperiencia.getText().toString().trim();
        String categoria = editCategoria.getText().toString().trim();
        String servico = editServico.getText().toString().trim();
        String descricao = editDescricao.getText().toString().trim();
        if(!TextUtils.isEmpty(cpf)){
            String id = databaseReference.push().getKey();

            Curriculo curriculo = new Curriculo(id, cpf, experiencia,categoria,servico,descricao);

            databaseReference.child("curriculo" + id).setValue(curriculo);
            editCPF.setText("");
            editExperiencia.setText("");
            editCategoria.setText("");
            editServico.setText("");
            editDescricao.setText("");



            Toast.makeText(getApplicationContext(), "Currilo salvo" , Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "campos em brancos", Toast.LENGTH_SHORT).show();
        }

        Intent intent = new Intent(this, NavigationActivity.class);
        startActivity(intent);
    }



}
