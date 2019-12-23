package patterns.templateMethod.scenario2;

public abstract class Network {

    String username;
    String password;

    Network(){}

    public boolean post(String message) {
        // Authenticate before posting. Every network uses a different authentication method.
        // Autentica antes de realizar o post. Todos usam um diferente metodo para autenticar
        if (logIn(this.username, this.password)) {
            // Send the post data.
            // Envia os dados do post
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String username, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
