package something;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.client.JenkinsHttpClient;
import org.aerogear.digger.client.DiggerClient;
import org.aerogear.digger.client.util.DiggerClientException;

import java.io.IOException;
import java.net.URI;

/**
 * @author Ali Ok (ali.ok@apache.org)
 *         31/05/2017 11:33
 **/
public class Main {
    public static void main(String[] args) throws DiggerClientException, IOException {
        final DiggerClient client = DiggerClient.createDefaultWithAuth("bla", "asd", "ads");
        com.offbytwo.jenkins.JenkinsServer server = null;
        server = new JenkinsServer(new JenkinsHttpClient(URI.create("asdasd")));
        server.getComputers();
    }
}
