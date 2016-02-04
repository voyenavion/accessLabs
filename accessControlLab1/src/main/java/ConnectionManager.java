/**
 * Created by shaungould on 1/24/16.
 */
public class ConnectionManager{

    Connection[] connections;
    public ConnectionManager(int length){
        connections = new Connection[length];
    }

/*
    public static void addConnections(Connection[] connections, int index){
        if(connections[index] == null){
            connections[index]=new Connection();
        }

    }
  */
    public static Connection createConnection(){
        return new Connection();
    }

    public static void addConnections(Connection[] connections, int index){
        if(connections[index] == null){
            connections[index]= createConnection();
        } else {
            System.out.println("ERROR: Array at index " + index + " is full");
        }
    }

    public static Connection removeConnection(Connection[] connections, int index){
        Connection removedConnection = connections[index];
        if(connections[index] == null){
            System.out.println("ERROR: Array at index " + index + " is already empty");
        } else {
            connections[index] = null;
        }

        return removedConnection;
    }

    public static void displayConnection(Connection[] connections, int index){
        Connection targetConnection = connections[index];
        System.out.println("Connection Object's IP Address: " + targetConnection.getIpAddress() + "\n"
                + "Connection Object's Port Number: " + targetConnection.getPortNumber());

    }

    public static void setObjPortNumber(Connection[] connections, int index, int portNumber){
        Connection targetConnection = connections[index];
        targetConnection.setPortNumber(portNumber);
    }

    public static int getObjPortNumber(Connection[] connections, int index) {
        Connection targetConnection = connections[index];
        return targetConnection.portNumber;
    }

    public static void setObjIPAddress(Connection[] connections, int index, int IPAddress){
        Connection targetConnection = connections[index];
        targetConnection.setIpAddress(IPAddress);
    }

    public static int getObjIPAddress(Connection[] connections, int index) {
        Connection targetConnection = connections[index];
        return targetConnection.ipAddress;
    }


    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager(2);
        addConnections(connectionManager.connections, 0);
        setObjIPAddress(connectionManager.connections, 0, 987675);
        setObjPortNumber(connectionManager.connections, 0, 12347);
        displayConnection(connectionManager.connections, 0);
        addConnections(connectionManager.connections, 1);
        setObjIPAddress(connectionManager.connections, 1, 987676);
        setObjPortNumber(connectionManager.connections, 1, 12348);
        displayConnection(connectionManager.connections,1);
        addConnections(connectionManager.connections, 1);



    }

static class Connection{
    private int portNumber;
    private int ipAddress;
    private Connection(){

    }
    private void setPortNumber(int portNumber){
        this.portNumber = portNumber;
    }

    private int getPortNumber(){
        return portNumber;
    }

    private void setIpAddress(int ipAddress){
        this.ipAddress = ipAddress;
    }

    private int getIpAddress(){
        return ipAddress;
    }
    }





}
