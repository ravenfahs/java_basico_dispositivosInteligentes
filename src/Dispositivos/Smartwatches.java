package Dispositivos;

public class Smartwatches {
    public Smartwatches(){

    }

    void SmartwatchesView() {
        //Marca del dispositivo
        System.out.println("...Smartphone - Resumen de características ... ");
        System.out.println("1. Nombre del dispositivo.");
        Identidad_dispositivo Watch_3Nombre;
        Watch_3Nombre = new Identidad_dispositivo("Huawei", "Watch 3");
        System.out.println(Watch_3Nombre.nombreDispositivo());

        //aplicaciones que pueden estar instaladas
        System.out.println("2. Aplicaciones que pueden estar incluidas en el dispositivo.");
        Aplicaciones Watch_3Nombre_App1;
        Watch_3Nombre_App1 = new Aplicaciones("App Gallery", "Motor de búsqueda indexación de paginas más populares.");
        System.out.println(Watch_3Nombre_App1.NombreApps());

        //Sistema del dispositivo
        System.out.println("\n3. Sistema del dispositivo." );
        Sistema Watch_3_Sistema = new Sistema("HarmonyOS", "2.0","No",
                "eSIM",
                "Kirin Hi6262");
        System.out.println(Watch_3_Sistema.sistemaDispositivo());

        //Redes de datos
        System.out.println("4. Redes del datos." );
        RedesDatos Watch_3_RedesDatos = new RedesDatos("1800, 1900, 2100, 800, 850, 900","800, CDMA2000 1x",
                "No","Si");
        System.out.println(Watch_3_RedesDatos.redesDatos());

        //Conexiones
        System.out.println("5. Tipo de Conexiones." );
        Conexiones Watch_3_Connexion = new Conexiones("eSIM 4G, WiFi, Bluetooth 5.2, NFC, GPS","HSPA, LTE","inalámbrica");
        System.out.println(Watch_3_Connexion.tipoConecion());

        //Multimedia
        System.out.println("6. Multimedia." );
        Multimedia Watch_3_Multimedia = new Multimedia("MP3", "","",
                "","Integrado");
        System.out.println(Watch_3_Multimedia.multimedia());

        //Pantalla
        System.out.println("7. Pantallas.");
        PantallaSensores Watch_3_Pantalla = new PantallaSensores("326 ppi","1.000 nits, 100 modos deportivos, 326 ppp, 60 Hz",
                "AMOLED","466 Pixels", "466 Pixels","Acelerómetro, Barómetro, Brújula, Giroscopio, Luz ambiente, " +
                "Ritmo cardiaco, Sensor geomagnético, SpO2, Termómetro", "1.43 Pulgadas");
        System.out.println(Watch_3_Pantalla.pantalla());

        //Memoria
        System.out.println("8. Pantallas.");
        Memoria Watch_3_Memoria = new Memoria("Nano Memory (hasta 256Gb)","2 Gb",
                "16 Gb");
        System.out.println(Watch_3_Memoria.memoria());

        //Diseño
        System.out.println("9. Diseño.");
        Diseño Watch_3_Diseño = new Diseño("Negro, Marrón, Plata, Azul","46.2 Milímetros",
                "46.2 Milímetros","12.2 Milímetros", "Acero inoxidable, Compatible con correas estándar de 22mm, " +
                "Resistente al agua (5ATM), Vidrio","54 Gr");
        System.out.println(Watch_3_Diseño.diseño());

        //Batería
        System.out.println("10. Batería.");
        Bateria Watch_3_Bateria = new Bateria("Ion Litio no renovable","450 Amperios hora"
                ,"Carga inalámbrica 10W");
        System.out.println(Watch_3_Bateria.bateria());

    }
}
