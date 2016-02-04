import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



/**
 * Created by shaungould on 1/24/16.
 */
public class ConnectionManagerSpec {
    ConnectionManager connectionManager;
    ConnectionManager.Connection[] arr;

    @Before
    public void initialize(){
        connectionManager = new ConnectionManager(3);
        arr = connectionManager.connections;

    }



    @Test
    public void addConnectionTest(){
        //ConnectionManager.Connection[] arr = connectionManager.connections;
        ConnectionManager.addConnections(arr,0);
        assertNotNull("Test Failed: null at given index.",arr[0]);
    }
    @Test
    public void removeConnectionsTest(){
        //ConnectionManager.addConnections(arr,0);
        assertNull(ConnectionManager.removeConnection(arr,0));
        //assertNotNull("Test Failed: didn't return anything", ConnectionManager.removeConnection(arr,0));
    }


}
