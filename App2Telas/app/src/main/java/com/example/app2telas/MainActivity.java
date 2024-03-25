package com.example.app2telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ObterDados();
    }

    public void Botao(View view)
    {
        TextView campoNome, campoCpf, campoEmail, campoSenha;
        String nome, cpf, email, senha;
        campoNome = findViewById(R.id.campoNome);
        campoCpf = findViewById(R.id.campoCpf);
        campoEmail = findViewById(R.id.campoEmail);
        campoSenha = findViewById(R.id.campoSenha);
        nome = campoNome.getText().toString();
        cpf = campoCpf.getText().toString();
        email =  campoEmail.getText().toString();
        senha = campoSenha.getText().toString();
        Usuario user1 = new Usuario(nome,cpf,email,senha);
        Intent mudarTela = new Intent(getApplicationContext(), Tela2.class);
        mudarTela.putExtra("objeto", user1);
        startActivity(mudarTela);
    }

    public void ObterDados()
    {
        Intent obterDadosTela2 = getIntent();
        Usuario user3 = (Usuario)obterDadosTela2.getSerializableExtra("objetoT2");
        if(user3 != null)
        {
            TextView campoNomeT1, campoCpfT1, campoEmailT1, campoSenhaT1;
            campoNomeT1 = findViewById(R.id.campoNome);
            campoCpfT1 = findViewById(R.id.campoCpf);
            campoEmailT1 = findViewById(R.id.campoEmail);
            campoSenhaT1 = findViewById(R.id.campoSenha);

            campoNomeT1.setText(user3.getNome());
            campoCpfT1.setText(user3.getCpf());
            campoEmailT1.setText(user3.getEmail());
            campoSenhaT1.setText(user3.getSenha());
        }

    }
}