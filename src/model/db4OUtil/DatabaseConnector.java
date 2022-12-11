package model.db4OUtil;

import model.SystemConfig;
import model.PawcareSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

public class DatabaseConnector {

    private static final String FILENAME = Paths.get("paw_care_db.db4o").toAbsolutePath().toString();
    private static DatabaseConnector dB4OUtil;
    
    public synchronized static DatabaseConnector getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DatabaseConnector();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(PawcareSystem.class).cascadeOnUpdate(true); 

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(PawcareSystem ecosystem) {
        ObjectContainer conn = createConnection();
        conn.store(ecosystem);
        conn.commit();
        conn.close();
    }
    
    public PawcareSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<PawcareSystem> ecosystems = conn.query(PawcareSystem.class); 
        PawcareSystem ecosystem;
        if (ecosystems.size() == 0){
            ecosystem = SystemConfig.configure();  
        }
        else{
            ecosystem = ecosystems.get(ecosystems.size() - 1);
        }
        conn.close();
        return ecosystem;
    }
}
