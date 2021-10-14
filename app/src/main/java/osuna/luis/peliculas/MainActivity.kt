package osuna.luis.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        agregar_peliculas()

        val adaptador: AdaptadorPelis = AdaptadorPelis(this,peliculas)
        var listView: ListView = findViewById(R.id.listview)
        listView.adapter = adaptador
    }

    fun agregar_peliculas(){
        peliculas.add(Pelicula(id = 1,nombre = "Avengers",desc = "Es una película de superhéroes estadounidense de 2019 basada en el equipo de superhéroes Los Vengadores de Marvel Comics. Producida por Marvel Studios y distribuida por Walt Disney Studios Motion Pictures, es la secuela directa de Avengers: Infinity War (2018) y la película número 22 del Universo cinematográfico de Marvel (UCM).",R.drawable.avengers))
        peliculas.add(Pelicula(id = 1,nombre = "Dr Strange",desc = "Es una película de superhéroes estadounidense de 2016 basada en el personaje homónimo de Marvel Comics, producida por Marvel Studios y distribuida por Walt Disney Studios Motion Pictures. Es la decimocuarta película del Universo cinematográfico de Marvel (MCU).",R.drawable.drstrange))
        peliculas.add(Pelicula(id = 1,nombre = "Spiderman: Lejos de casa",desc = "Es una película estadounidense de superhéroes de 2019 basada en el personaje de Spider-Man, perteneciente a Marvel Comics, producida por Columbia Pictures y Marvel Studios y distribuida por Sony Pictures Entertainment. ",R.drawable.spiderman))
        peliculas.add(Pelicula(id = 1,nombre = "Lobo de Wall Street",desc = "Es una película de 2013 dirigida por Martin Scorsese, basada en las memorias del mismo nombre de Jordan Belfort. Escrita por Terence Winter y protagonizada por Leonardo DiCaprio como Belfort, junto a Jonah Hill, Margot Robbie, Jean Dujardin, Rob Reiner, Kyle Chandler y Matthew McConaughey, se trata de la quinta colaboración entre Scorsese y DiCaprio.",R.drawable.lobo_wall_street))
    }
}