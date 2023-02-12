package Dispositivos;

public class Smartphone {

    public Smartphone() {
    }

    void SmartphoneView() {
        //Marca del dispositivo
        System.out.println("...Smartphone - Resumen de características ... " );
        System.out.println("1. Nombre del dispositivo." );
        Identidad_dispositivo Huawei_P50_Pro_Nombre;
        Huawei_P50_Pro_Nombre = new Identidad_dispositivo("Huawei","Huawei P50 Pro");
        System.out.println(Huawei_P50_Pro_Nombre.nombreDispositivo());

        //aplicaciones que pueden estar instaladas
        System.out.println("2. Aplicaciones que pueden estar incluidas en el dispositivo." );
        Aplicaciones Huawei_P50_Pro_App1;
        Huawei_P50_Pro_App1 = new Aplicaciones("Petal Search","Motor de búsqueda indexación de paginas más populares.");
        System.out.println(Huawei_P50_Pro_App1.NombreApps());
        Aplicaciones Huawei_P50_Pro_App2;
        Huawei_P50_Pro_App2 = new Aplicaciones("Aurora Store",
                "se conecta a los mismos servidores sin necesidad de la tienda oficial ni una cuenta de Google.");
        System.out.println(Huawei_P50_Pro_App2.NombreApps());

        //Sistema del dispositivo
        System.out.println("\n3. Sistema del dispositivo." );
        Sistema Huawei_P50_Pro_Sistema = new Sistema("HarmonyOS", "2.0","Dual SIM Híbrido",
                "Doble modo de espera, Nano Sim",
                "1x2.84 GHz Kryo 680, 1x3.13 GHz Cortex-A77 , 3x2.42 GHz Kryo 680, 3x2.54 GHz Cortex-A77, 4x1.80 GHz Kryo 680, " +
                        "4x2.05 GHz Cortex-A55, Adreno 660, Kirin 9000 (5 nm), Mali-G78 MP24, Octa-core, " +
                        "Qualcomm SM8350 Snapdragon 888 4G (5 nm)");
        System.out.println(Huawei_P50_Pro_Sistema.sistemaDispositivo());

        //Redes de datos
        System.out.println("4. Redes del datos." );
        RedesDatos Huawei_P50_Pro_RedesDatos = new RedesDatos("1700 AWS, 1900, 2100, 800, 850, 900","800, CDMA2000 1x",
                "1800, 1900, 850, 900","Si");
        System.out.println(Huawei_P50_Pro_RedesDatos.redesDatos());

        //Conexiones
        System.out.println("5. Tipo de Conexiones." );
        Conexiones Huawei_P50_Pro_Connexion = new Conexiones("Bluetooth 4.0, Wi-Fi 802.11 b/g/n, WiFi Direct, WiFi hotspot",
                "EDGE, GPRS, HSPA+, LTE","Jack 3,5 mm para auriculares, Micro USB 2.0");
        System.out.println(Huawei_P50_Pro_Connexion.tipoConecion());

        //Multimedia
        System.out.println("6. Multimedia." );
        Multimedia Huawei_P50_Pro_Multimedia = new Multimedia("MP3", "H.263, H.264, MPEG4","FM",
                "MP3, Vibración, WAV Ringtones","estéreo");
        System.out.println(Huawei_P50_Pro_Multimedia.multimedia());

        //Cámaras fotográficas
        System.out.println("7. Cámaras fotográficas." );
        Camarasfotograficas Huawei_P50_Pro_Camaras = new Camarasfotograficas(
                "Apertura Cámara Monocromo de ƒ/1.6, Apertura Cámara Principal de ƒ/1.8, Apertura Gran Angular de ƒ/2.2, " +
                        "Autofocus laser, Cámara Monocromo 40 MP, Cámara Principal 50 MP, Estabilizador de imagen OIS, " +
                        "Gran angular 13MP, HDR, Lente Leica, Panorama, PDAF, Sensor tamaño 1/1.28, " +
                        "Tamaño Cámara Monocromo 23mm, Tamaño Cámara Principal 23mm, tamaño de píxel 1.22 µm, " +
                        "Tamaño Gran Angular 13mm, Telefoto 64MP y f/3.5, Teleobjetivo periscopio 90mm, " +
                        "Teleobjetivo Periscopio con Zoom Óptico de 3.5x",
                "1080p@240fps, 1080p@30fps, 1080p@60fps, 4K@30fps, Apertura de ƒ/2.4, HDR, panorama",
                "Quad 50 + 64 + 13 + 40 Megapíxeles","13 Megapíxeles","Dual LED");
        System.out.println(Huawei_P50_Pro_Camaras.camaras());

        //Video
        System.out.println("7. Vídeo." );
        CamaraVideo Huawei_P50_Pro_Video = new CamaraVideo("1080p@30fps, 1080p@60fps, 1080p@960fps, 4K@30fps, 4K@60fps, HDR",
                "EIS (gyro)", "30/60/240 FPS");
        System.out.println(Huawei_P50_Pro_Video.video());

        //Pantalla
        System.out.println("8. Pantallas.");
        PantallaSensores Huawei_P50_Pro_Pantalla = new PantallaSensores("450 ppi","105,4 cm2, 120Hz, 1B colores, 91,2% de relación pantalla-cuerpo",
                "OLED","1228 Pixels", "2700 Pixels","Acelerómetro, Barómetro, Brújula, Espectro de color, " +
                "Giroscopio, Huella dactilar óptica, Sensor de proximidad, GPS, BDS, GALILEO, GLONASS, NavIC, QZSS", "6.6 Pulgadas");
        System.out.println(Huawei_P50_Pro_Pantalla.pantalla());

        //Memoria
        System.out.println("8. Pantallas.");
        Memoria Huawei_P50_Pro_Memoria = new Memoria("Nano Memory (hasta 256Gb)","8/12 Gb",
                "128/256/512 Gb");
        System.out.println(Huawei_P50_Pro_Memoria.memoria());

        //Diseño
        System.out.println("9. Diseño.");
        Diseño Huawei_P50_Pro_Diseño = new Diseño("Azul, Blanco, Dorado, Negro, Rosa","158.8 Milímetros",
                "72.8 Milímetros","8.5 Milímetros", "Grado de protección IP68 (Agua y Polvo), " +
                "Resistente hasta 1.5 m y 30 minutos del Agua","195 Gr");
        System.out.println(Huawei_P50_Pro_Diseño.diseño());

        //Batería
        System.out.println("10. Batería.");
        Bateria Huawei_P50_Pro_Bateria = new Bateria("Polimero de Litio no renovable","4360 Amperios hora"
        ,"Carga inalámbrica rápida 50W, Carga rápida 66W");
        System.out.println(Huawei_P50_Pro_Bateria.bateria());
    }
}
