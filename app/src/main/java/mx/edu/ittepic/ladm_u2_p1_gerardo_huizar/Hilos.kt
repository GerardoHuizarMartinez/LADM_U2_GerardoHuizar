package mx.edu.ittepic.ladm_u2_p1_gerardo_huizar

class Hilos (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()
        while(true){
            sleep(100)
            puntero.runOnUiThread {
                puntero.lienzo!!.despeja()
            }
        }
    }

}//Fin de la clase Hilos