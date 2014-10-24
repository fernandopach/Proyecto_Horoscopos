
package com.jc.elementos.model;

import java.util.ArrayList;


public class SignoZ {
    private ArrayList<Signo> signos;

    public SignoZ() {
      signos=new ArrayList<Signo>();
       Signo Acuario=new Signo("Acuario","No te quedes estancado en el pasado. Todo el mundo presume de contar con un buen teléfono móvil y tú no puedes ser menos. Compra uno que te guste");
       Signo Piscis=new Signo("Piscis","Sueles caer por lo general bastante bien a todo el mundo, Borrarás de tu mente muchas situaciones de rencor");
       Signo Aries=new Signo("Aries","Dejarás tu puesto de trabajo para emprender un nuevo proyecto empresarial");
       Signo Tauro=new Signo("Tauro","Te llegará alguna oferta para cambiar de trabajo. Antes de tomar una decisión deberías estudiar las condiciones del contrato");
       Signo Geminis=new Signo("Geminis"," Aparecerán más oportunidades laborales");
       Signo Cancer=new Signo("Cancer","Es posible que te lleves una gran sorpresa cuando te pongas a probar unas prendas que tenías olvidadas en el armario");
       Signo Leo=new Signo("Leo"," Intenta madrugar un poco más de lo normal para salir a correr. Afrontarás el resto de la jornada con más energía");
       Signo Virgo=new Signo("Virgo","Si tienes alguna duda en relación a cualquier tema, recurre a tu intuición. Síguela y te llevará siempre a la opción más adecuada");
       Signo Libra=new Signo("Libra"," Para realizar un desplazamiento largo en coche es preciso que pases antes por el taller. Seguro que así podrás viajar con mucha más seguridad");
       Signo Escorpion=new Signo("Escorpion","SCuando te encuentras de bajón anímico intentas buscar consuelo en la sonrisa de un familiar o en las palabras de ánimo de un amigo");
       Signo Sagitario=new Signo("Sagitario"," Tu sensibilidad estará a flor de piel. No actúes sin pensar, aunque esto sea típico en ti. Has de saber esperar y aguardar el momento idóneo para actuar");
       Signo Capricornio=new Signo("Capricornio"," No cuentes tus problemas a la primera persona que te encuentres por la calle. Lo mejor es que te refugies en tus amigos de siempre");
   
 
   
       
        
        signos.add(Acuario);
        signos.add(Piscis);
        signos.add(Aries);
        signos.add(Tauro);
        signos.add(Geminis); 
        signos.add(Cancer);
        signos.add(Leo);
        signos.add(Virgo);
        signos.add(Libra);   
        signos.add(Escorpion);
        signos.add(Sagitario);
        signos.add(Capricornio);
        
              
}   
}
    