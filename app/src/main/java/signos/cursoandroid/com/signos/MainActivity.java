package signos.cursoandroid.com.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String[] signos = {
        "aries", "touro", "capricornio", "peixes", "aquário", "libra",
        "escorpião", "sagitário", "leão", "câncer", "gêmeos", "virgem"
    };
    private String[] detalhesSignos = {
            "Nome: Mu\n" +
                    "Constelação: Áries\n" +
                    "Classificação: Cavaleiro de Ouro\n" +
                    "Idade: 20 anos\n" +
                    "Altura: 1,82\n" +
                    "Peso: 75kg\n" +
                    "Aniversário: 27 de Março\n" +
                    "Signo: Áries\n" +
                    "Tipo sangüíneo: A\n" +
                    "Local de nascimento: Tibet\n" +
                    "Local de treinamento: Jamiel, Tibet\n" +
                    "Ataques: Parede de Cristal, Revolução Estelar, Extinção Estelar e Rede de Cristal\n" +
                    "Poderes Especiais: Telecinese e consertar armaduras (pó de estrelas)," +
                    "",
            "Nome: Aldebaran\n" +
                    "Constelação: Touro\n" +
                    "Classificação: Cavaleiro de Ouro\n" +
                    "Idade: 20 anos\n" +
                    "Altura: 2,10\n" +
                    "Peso: 130kg\n" +
                    "Aniversário: 8 de Maio\n" +
                    "Signo: Touro\n" +
                    "Tipo sangüíneo: B\n" +
                    "Local de nascimento: Brasil\n" +
                    "Local de treinamento: Brasil\n" +
                    "Ataque: Grande Chifre",
            "Nome: Shura\n" +
                    "Constelação: Capricórnio\n" +
                    "Classificação: Cavaleiro de Ouro\n" +
                    "Idade: 23 anos\n" +
                    "Altura: 1,86\n" +
                    "Peso: 83kg\n" +
                    "Aniversário: 12 de Janeiro\n" +
                    "Signo: Capricórnio\n" +
                    "Tipo sangüíneo: B\n" +
                    "Local de nascimento: Espanha\n" +
                    "Local de treinamento: Montes Pirineus, Espanha\n" +
                    "Ataque: Excalibur",
            "Nome: Afrodite\n" +
                    "Constelação: Peixes\n" +
                    "Classificação: Cavaleiro de Ouro\n" +
                    "Idade: 22 anos\n" +
                    "Altura: 1,83\n" +
                    "Peso: 72kg\n" +
                    "Aniversário: 10 de Março\n" +
                    "Signo: Peixes\n" +
                    "Tipo sangüíneo: O\n" +
                    "Local de nascimento: Suécia\n" +
                    "Local de treinamento: Groelândia\n" +
                    "Ataques: Rosas Diabólicas Reais, Rosas Piranhas e Rosa Branca (Sangrenta)",
            "Nome: Camus\n" +
                    "Constelação: Aquário\n" +
                    "Classificação: Cavaleiro de Ouro\n" +
                    "Idade: 20 anos\n" +
                    "Altura: 1,84\n" +
                    "Peso: 76kg\n" +
                    "Aniversário: 7 de Fevereiro\n" +
                    "Signo: Aquário\n" +
                    "Tipo sangüíneo: A\n" +
                    "Local de nascimento: França\n" +
                    "Local de treinamento: Sibéria Oriental\n" +
                    "Ataques: Pó de Diamante, Trovão Aurora e Execução Aurora\n" +
                    "Poder Especial: é capaz de construir um caixão de gelo (Esquife de Gelo) para o adversário, o qual só pode ser destruído pela Espada de Libra\n",
            "Nome: Dohko (Mestre Ancião)\n" +
                    "Constelação: Libra\n" +
                    "Classificação: Cavaleiro de Ouro\n" +
                    "Idade: 261 anos\n" +
                    "Altura: 1,40 (quando está velho);\n" +
                    "1,70 (jovem)\n" +
                    "Peso: ?\n" +
                    "Aniversário: 20 de Outubro\n" +
                    "Signo: Libra\n" +
                    "Tipo sangüíneo: A\n" +
                    "Local de nascimento: China\n" +
                    "Local de treinamento: 5 Picos Antigos de Rozan, China\n" +
                    "Ataques: Cólera do Dragão e Cólera dos 100 Dragões\n" +
                    "Armas de sua armadura: Tridente, Barra Dupla, Barra Tripla, Tonfá, Espada e Escudo\n" +
                    "Poder Especial: pode voltar a ser jovem devido à técnica \"Misopetha Menos\"\n",
            "Nome: Milo (pronúncia: \"Miro\")\n" +
                    "Constelação: Escorpião\n" +
                    "Classificação: Cavaleiro de Ouro\n" +
                    "Idade: 20 anos\n" +
                    "Altura: 1,85\n" +
                    "Peso: 84kg\n" +
                    "Aniversário: 8 de Novembro\n" +
                    "Signo: Escorpião\n" +
                    "Tipo sangüíneo: B\n" +
                    "Local de nascimento: Grécia\n" +
                    "Local de treinamento: Ilha de Milos, Grécia\n" +
                    "Ataques: Restrição, Agulha Escarlate e Antares\n" +
                    "Poder Especial: pode parar o sangramento da Agulha Escarlate atingindo um ponto no peito do adversário\n",
            "Nome: Aiolos (pronúncia: \"Aioros\")\n" +
                    "Constelação: Sagitário\n" +
                    "Classificação: Cavaleiro de Ouro\n" +
                    "Idade: morreu aos 14 anos\n" +
                    "Altura: 1,87\n" +
                    "Peso: 85kg\n" +
                    "Aniversário: 30 de Novembro\n" +
                    "Signo: Sagitário\n" +
                    "Tipo sangüíneo: O\n" +
                    "Local de nascimento: Grécia\n" +
                    "Local de treinamento: Santuário, Grécia\n" +
                    "Ataque: Trovão Atômico",
            "Nome: Aiolia (pronúncia: \"Aioria\")\n" +
                    "Constelação: Leão\n" +
                    "Classificação: Cavaleiro de Ouro\n" +
                    "Idade: 20 anos\n" +
                    "Altura: 1,85\n" +
                    "Peso: 85kg\n" +
                    "Aniversário: 16 de Agosto\n" +
                    "Signo: Leão\n" +
                    "Tipo sangüíneo: O\n" +
                    "Local de nascimento: Grécia\n" +
                    "Local de treinamento: Santuário, Grécia\n" +
                    "Ataques: Cápsula do Poder, Pata do Leão e Relâmpago de Plasma\n" +
                    "Poder Especial: pode tirar a sensação de dor de um cavaleiro ferido",
            "Nome: Máscara da Morte\n" +
                    "Constelação: Câncer\n" +
                    "Classificação: Cavaleiro de Ouro\n" +
                    "Idade: 23 anos\n" +
                    "Altura: 1,84\n" +
                    "Peso: 82kg\n" +
                    "Aniversário: 24 de Junho\n" +
                    "Signo: Câncer\n" +
                    "Tipo sangüíneo: A\n" +
                    "Local de nascimento: Itália\n" +
                    "Local de treinamento: Sicília, Itália\n" +
                    "Ataque: Ondas do Inferno (Sekishiki)\n" +
                    "\n",
            "Nome: Saga\n" +
                    "Constelação: Gêmeos\n" +
                    "Classificação: Cavaleiro de Ouro\n" +
                    "Idade: 28 anos\n" +
                    "Altura: 1,88\n" +
                    "Peso: 87kg\n" +
                    "Aniversário: 30 de Maio\n" +
                    "Signo: Gêmeos\n" +
                    "Tipo sangüíneo: AB\n" +
                    "Local de nascimento: Grécia\n" +
                    "Local de treinamento: Santuário, Grécia\n" +
                    "Ataques: Satã Imperial, Outra Dimensão e Explosão Galáctica\n",
            "Nome: Shaka\n" +
                    "Constelação: Virgem\n" +
                    "Classificação: Cavaleiro de Ouro\n" +
                    "Idade: 20 anos\n" +
                    "Altura: 1,82\n" +
                    "Peso: 68kg\n" +
                    "Aniversário: 19 de Setembro\n" +
                    "Signo: Virgem\n" +
                    "Tipo sangüíneo: AB\n" +
                    "Local de nascimento: Índia\n" +
                    "Local de treinamento: Ganges, Índia\n" +
                    "Ataques: Rendição Divina, Ciclo das 6 Existências, Tesouro do Céu, Invocação dos Espíritos, Ohm! (rebate o ataque do adversário) e Kahn! (escudo de energia)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewID);

        //este método ArrayAdapter<> adápta/transforma o seu conteúdo para a ListView
        ArrayAdapter<String> adaptor = new ArrayAdapter<String> (
                //aplicando parâmetros
                getApplicationContext(),

                //layout
                android.R.layout.simple_list_item_1,

                //tipo de letra
                android.R.id.text1,

                //o que o adapter adaptará
                signos
        );

        //pegamos nossa listaItens e setamos o adaptador
        listaSignos.setAdapter(adaptor);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //ordenar casa item clicado com o detalhe correto pela POSIÇÃO
                int codigoPosition = position;

                //apresentar o detalhe de cada signo
                Toast.makeText(getApplicationContext(), detalhesSignos[codigoPosition], Toast.LENGTH_LONG).show();
            }
        });

    }
}
