package mx.edu.ittepic.ladm_u2_p1_gerardo_huizar

import android.graphics.*
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity) : View(p){// se requiere p para que view sepa cual activity va a trabajar
var puntero = p
    /*var cx = 150f
    var cy = 150f
    var tx = 733f
    var ty = 818f*/

    var pasto = FiguraGeometrica(0,1500,1100,1000)
    var casaBase = FiguraGeometrica(500,1300,500,300)
    var puerta = FiguraGeometrica(750,1350,110, 250)
    var ventana = FiguraGeometrica(620,1400,70)
    var tronco = FiguraGeometrica(150,1400,50,150)
    var arbol = FiguraGeometrica(165,1350,120)
    var arbolCopa = FiguraGeometrica(165,1200,100)
    var sol = FiguraGeometrica(1000,100,200)
    var nubeup =  FiguraGeometrica(290,200,100)
    var nuberdown = FiguraGeometrica(280,350,100)
    var nubeleft = FiguraGeometrica(130,280,100)
    var nubeRight = FiguraGeometrica(400,300,100)

    //La nieve que caera
    var n1 = FiguraGeometrica(10,-100,20)
    var n2= FiguraGeometrica(40,-50,50)
    var n3 = FiguraGeometrica(30,-105,10)
    var n4 = FiguraGeometrica(100,-85,60)
    var n5 = FiguraGeometrica(400,-205,80)
    var n6 = FiguraGeometrica(400,-125,10)
    var n7 = FiguraGeometrica(450,-135,60)
    var n8 = FiguraGeometrica(150,-66,20)
    var n9 = FiguraGeometrica(200,-104,10)
    var n10 = FiguraGeometrica(25,-244,15)
    var n11 = FiguraGeometrica(390,-212,10)
    var n12 = FiguraGeometrica(650,-174,34)
    var n13 = FiguraGeometrica(49,-60,22)
    var n14 = FiguraGeometrica(404,-14,28)
    var n15 = FiguraGeometrica(349,-55,20)
    var n16 = FiguraGeometrica(43,-100,20)
    var n17 = FiguraGeometrica(360,-190,20)
    var n18 = FiguraGeometrica(490,-230,20)
    var n19 = FiguraGeometrica(262,-411,20)
    var n20 = FiguraGeometrica(842,-140,20)
    var n21 = FiguraGeometrica(115,-370,75)
    var n22 = FiguraGeometrica(905,-360,14)
    var n23 = FiguraGeometrica(795,-347,35)
    var n24 = FiguraGeometrica(290,-180,17)
    var n25 = FiguraGeometrica(956,-275,16)
    var n26 = FiguraGeometrica(882,-55,24)
    var n27 = FiguraGeometrica(775,-115,21)
    var n28 = FiguraGeometrica(666,-72,25)
    var n29 = FiguraGeometrica(658,-148,27)
    var n30 = FiguraGeometrica(211,-505,28)
    var n31 = FiguraGeometrica(555,-812,15)
    var n32 = FiguraGeometrica(607,-100,42)
    var n33 = FiguraGeometrica(280,-272,24)
    var n34 = FiguraGeometrica(26,-512,31)
    var n35 = FiguraGeometrica(75,-252,15)
    var n36 = FiguraGeometrica(90,-305,27)


    var punteroFiguraGeometrica : FiguraGeometrica?=null

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        //Configuracion de fondo del canvas (Cielo azul)
        canvas.drawColor(Color.rgb(187, 244, 227))

        //Dibujando el pasto
        paint.color=Color.rgb(66, 174, 63)
        pasto.pintar(canvas,paint)

        //Base de la casita
        paint.color=Color.rgb(136, 95, 2 )
        casaBase.pintar(canvas,paint)

        //Se coloca la puerta
        paint.color=Color.rgb(255, 207, 31)
        puerta.pintar(canvas,paint)

        //Se coloca la ventana
        paint.color=Color.rgb(244, 242, 238 )
        ventana.pintar(canvas,paint)

        //Solsticio
        paint.color=Color.rgb(255, 207, 31)
        sol.pintar(canvas,paint)

        //Tronco del arbol
        paint.color=Color.rgb(136, 95, 2 )
        tronco.pintar(canvas,paint)

        //Arbol
        paint.color=Color.rgb(87, 221, 22 )
        arbol.pintar(canvas,paint)

        //Arbol Copa
        paint.color=Color.rgb(87, 221, 22  )
        arbolCopa.pintar(canvas,paint)

        //Nube up
        paint.color=Color.rgb(22, 191, 221   )
        nubeup.pintar(canvas,paint)

        //Nube down
        paint.color=Color.rgb(22, 191, 221  )
        nuberdown.pintar(canvas,paint)

        //Nube left
        paint.color=Color.rgb(22, 191, 221  )
        nubeleft.pintar(canvas,paint)

        //Nube rigth
        paint.color=Color.rgb(22, 191, 221  )
        nubeRight.pintar(canvas,paint)

        //Techo
        var path = Path()
        paint.color = Color.RED
        path.moveTo(840f, 1300f)
        path.lineTo(400f, 1300f)
        path.lineTo(720f, 1050f)
        path.lineTo(1050f, 1300f)
        path.close()
        canvas?.drawPath(path, paint)

        //Nievesita
        paint.color = Color.rgb(255,255,255)
        n1.pintar(canvas,paint)
        n2.pintar(canvas,paint)
        n3.pintar(canvas,paint)
        n4.pintar(canvas,paint)
        n5.pintar(canvas,paint)
        n6.pintar(canvas,paint)
        n7.pintar(canvas,paint)
        n8.pintar(canvas,paint)
        n9.pintar(canvas,paint)
        n10.pintar(canvas,paint)
        n11.pintar(canvas,paint)
        n12.pintar(canvas,paint)
        n13.pintar(canvas,paint)
        n14.pintar(canvas,paint)
        n15.pintar(canvas,paint)
        n16.pintar(canvas,paint)
        n17.pintar(canvas,paint)
        n18.pintar(canvas,paint)
        n19.pintar(canvas,paint)
        n20.pintar(canvas,paint)
        n21.pintar(canvas,paint)
        n22.pintar(canvas,paint)
        n23.pintar(canvas,paint)
        n24.pintar(canvas,paint)
        n25.pintar(canvas,paint)
        n26.pintar(canvas,paint)
        n27.pintar(canvas,paint)
        n28.pintar(canvas,paint)
        n29.pintar(canvas,paint)
        n30.pintar(canvas,paint)
        n31.pintar(canvas,paint)
        n32.pintar(canvas,paint)
        n33.pintar(canvas,paint)
        n34.pintar(canvas,paint)
        n35.pintar(canvas,paint)
        n36.pintar(canvas,paint)



    }


    override fun onTouchEvent(event: MotionEvent): Boolean {
        puntero.setTitle("")
        when(event.action){
            MotionEvent.ACTION_DOWN->{

            }
            MotionEvent.ACTION_MOVE->{
                if(punteroFiguraGeometrica!=null){
                    punteroFiguraGeometrica!!.arrastrar(event)
                }

            }
            MotionEvent.ACTION_UP->{
                punteroFiguraGeometrica=null
            }
        }
        invalidate()
        return true
    }

    fun despeja(){

        if(true){
            nuberdown.desLeft()
            nubeRight.desLeft()
            nubeleft.desLeft()
            nubeup.desLeft()
            sol.desRight()
            if(nubeRight.x<=0){
                n1.nevar()
                n2.nevar()
                n3.nevar()
                n4.nevar()
                n5.nevar()
                n6.nevar()
                n7.nevar()
                n8.nevar()
                n9.nevar()
                n10.nevar()
                n11.nevar()
                n12.nevar()
                n13.nevar()
                n14.nevar()
                n15.nevar()
                n16.nevar()
                n17.nevar()
                n18.nevar()
                n19.nevar()
                n20.nevar()
                n21.nevar()
                n22.nevar()
                n23.nevar()
                n24.nevar()
                n25.nevar()
                n26.nevar()
                n27.nevar()
                n28.nevar()
                n29.nevar()
                n30.nevar()
                n31.nevar()
                n32.nevar()
                n33.nevar()
                n34.nevar()
                n35.nevar()
                n36.nevar()
            }
        }


        invalidate()
    }
}
