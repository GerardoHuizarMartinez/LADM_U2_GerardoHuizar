package mx.edu.ittepic.ladm_u2_p1_gerardo_huizar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
//Se crea el objeto formal para poder hacer uso de el
    var lienzo : Lienzo ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lienzo=Lienzo(this)
        setContentView(lienzo)

        var hilacho = Hilos(this)
        hilacho.start()
    }
}