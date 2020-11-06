package com.anthony.exament3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anthony.exament3.AnimeAdapter.AnimeAdapter;
import com.anthony.exament3.AnimeClass.AnimeClass;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvAnimes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AnimeClass a= new AnimeClass();
        a.nombre="SAINT SEIYA";
        a.descripcion="Argumento. El argumento de la serie se centra en la historia de un grupo de jóvenes guerreros denominados «santos» (o «caballeros» en varias traducciones), quienes luchan por proteger a la diosa griega Atenea de las fuerzas del mal que quieren dominar la Tierra.";
        a.url="https://img2.rtve.es/im/3573443/?w=900";
        AnimeClass b= new AnimeClass();
        b.nombre="HIGHSCHOOL OF THE DEAD";
        b.descripcion="La historia de Highschool of the Dead nos narra el transcurro de un apocalípsis zombi a escala mundial y de origen desconocido visto desde los ojos de un grupo de estudiantes de un instituto japonés, centrándose en la figura del protagonista, un joven de 17 años llamado Takashi Komuro";
        b.url="https://vignette.wikia.nocookie.net/television/images/5/53/Highschool_of_the_Dead.jpg/revision/latest/top-crop/width/360/height/450?cb=20131108025616&path-prefix=es";
        AnimeClass c= new AnimeClass();
        c.nombre="RUROUNI KENSHIN: MEIJI KENKAKU ROMANTAN (SAMURÁI X)";
        c.descripcion="Ambientado en los primeros años de la era Meiji del Imperio del Japón, afectando también al argumento acontecimientos sucedidos en el tiempo Bakumatsu de la Dinastía Tokugawa. Su temática acerca de la paz, el amor y la redención ha impulsado su popularidad tanto en su país natal como internacionalmente.";
        c.url="https://vignette.wikia.nocookie.net/samuraix/images/f/f9/Rurouni_Kenshin_--_Meiji_Kenkaku_Romantan_-_Juuyuushi_Inbou_Hen.jpg/revision/latest/scale-to-width-down/340?cb=20180728071253&path-prefix=es";
        AnimeClass d= new AnimeClass();
        d.nombre=" FULL METAL ALCHEMIST";
        d.descripcion="Este anime nos cuenta la historia de los hermanos Edward (15 años) y Alphonse (14), quienes después de la muerte de su madre (cuando tenían la tierna edad que podéis ver en el gif superior), rompieron el mayor tabú de la alquimia al querer resucitarla: la transmutación humana";
        d.url="https://www.elretruecano.com/wp-content/uploads/2020/04/Hermanos-Elric.jpg";
        AnimeClass e= new AnimeClass();
        e.nombre="POKÉMON";
        e.descripcion="Es un anime metaserial creado por Satoshi Tajiri, Junichi Masuda y Ken Sugimori, que narra la historia de Ash Ketchum, un joven entrenador Pokémon de Pueblo Paleta que comienza un viaje para alcanzar su sueño, ser un Maestro Pokémon";
        e.url="https://i.ytimg.com/vi/lhQxOIPf7-U/hqdefault.jpg";
        AnimeClass f= new AnimeClass();
        f.nombre="DEATH NOTE";
        f.descripcion="En la historia, el “Death Note” es un cuaderno con una portada de color negro y su nombre inscrito en ella. Este cuaderno tiene la capacidad de matar a cualquier persona con tan sólo escribir su nombre en él siempre que el portador visualice mentalmente la cara de quien quiere asesinar.";
        f.url="https://sm.ign.com/t/ign_latam/screenshot/default/death-note_4h2e.h720.jpg";
        AnimeClass g= new AnimeClass();
        g.nombre="NEON GENESIS EVANGELION";
        g.descripcion="La historia de la obra se da lugar en un mundo futurista en el que una organización paramilitar llamada NERV protege a la humanidad de los ataques de seres de origen y naturaleza desconocidos, los «ángeles», utilizando para ello mechas humanoides llamados «EVAs»";
        g.url="https://es.web.img2.acsta.net/pictures/18/12/07/12/40/4530128.jpg";
        AnimeClass h= new AnimeClass();
        h.nombre="ONE PIECE";
        h.descripcion="One Piece es una aventura de piratas. Es la historia de un chico llamado Monkey D. ... Luffy, inspirado por el pirata Shanks 'Akagami', sale al mar diez años después para convertirse en el Rey de los Piratas.";
        h.url="https://as.com/meristation/imagenes/2020/02/24/noticias/1582540103_904787_1582540270_noticia_normal.jpg";
        AnimeClass i= new AnimeClass();
        i.nombre="NARUTO SSHIPPUDEN";
        i.descripcion=" narra la historia de un ninja adolescente hiperactivo, impredecible y ruidoso llamado Naruto Uzumaki, quien aspira a convertirse afanosamente en Hokage, el máximo grado ninja en su aldea, con el propósito de ser reconocido";
        i.url="https://assets.tonica.la/__export/1594398614288/sites/debate/img/2020/07/10/las-primeras-temporadas-de-naruto-gratis-en-microsoft-store_1.jpg_1359985867.jpg";
        AnimeClass j= new AnimeClass();
        j.nombre="DRAGON BALL Z";
        j.descripcion="La trama de Dragon Ball Z se centra en la vida adulta de Son Goku, quien tendrá que defender la tierra de los numerosos villanos que amenazan con destruirla. Además, la serie trama de forma paralela la madurez de su hijo Gohan. La producción destaca por tener un tono más serio que su predecesora.";
        j.url="https://pl4yers.com/wp-content/uploads/2020/02/dragon-ball-z-kakarot-an%C3%A1lisis-review-pl4yers.png";
        List<AnimeClass> data = new ArrayList<>();
        data.add(a);data.add(b);data.add(c);data.add(d);data.add(e);data.add(f);
        data.add(g);data.add(h);data.add(i);data.add(j);

        MainActivity act=MainActivity.this;
        AnimeAdapter adapter= new AnimeAdapter(data,act);
        recyclerView.setAdapter(adapter);



    }
}