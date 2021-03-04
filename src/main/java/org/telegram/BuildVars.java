package org.telegram;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ruben Bermudez
 * @version 1.0
 * @brief Custom build vars FILL EVERYTHING CORRECTLY
 * @date 20 of June of 2015
 */

public class BuildVars {
	public static final Boolean debug = true;
    public static final Boolean useWebHook = false;
    public static final int PORT = 8443;
    public static final String EXTERNALWEBHOOKURL = "http://bolethouse.ddns.net::" + PORT; // https://(xyz.)externaldomain.tld
    public static final String INTERNALWEBHOOKURL = "https://localhost.changeme.com:" + PORT; // https://(xyz.)localip/domain(.tld)
    public static final String pathToCertificatePublicKey = "./YOURPEM.pem"; //only for self-signed webhooks
    public static final String pathToCertificateStore = "./YOURSTORE.jks"; //self-signed and non-self-signed.
    public static final String certificateStorePassword = "yourpass"; //password for your certificate-store

    public static final String OPENWEATHERAPIKEY = "e82a5cdcd77dc6c7e68cd03ecce0317c";

    public static final String DirectionsApiKey = "e82a5cdcd77dc6c7e68cd03ecce0317c";

    public static final String TRANSIFEXUSER = "ziad.elkarrabi";
    public static final String TRANSIFEXPASSWORD = "Karrabi23$";
    public static final List<Integer> ADMINS = new ArrayList<>();

    public static final String pathToLogs = "./";

    public static final String linkDB = "jdbc:mysql://localhost:3306/weather?&useUnicode=true&characterEncoding=UTF-8";
    public static final String controllerDB = "com.mysql.cj.jdbc.Driver";
    public static final String userDB = "root";
    public static final String password = "admin"; // "karrabi23";

    static {
        // Add elements to ADMIN array here
    }
}
