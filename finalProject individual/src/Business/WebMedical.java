package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Shail
 */
public class WebMedical extends Organization {

    private static WebMedical webMedical;
    private ArrayList<Network> networkList;
    private HashMap<String, ArrayList<String>> patientMapping;
    private static final String serverFileLocation = ".//Resourses//ServerFiles";

    public static WebMedical getInstance() {
        if (webMedical == null) {
            webMedical = new WebMedical();
        }
        return webMedical;
    }

    private WebMedical() {
        super(null);
        networkList = new ArrayList();
        patientMapping = new HashMap<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public boolean isNetworkExists(String countryName) {
        for (Network network : networkList) {
            if (network.getCountryName().equalsIgnoreCase(countryName)) {
                return true;
            }
        }
        return false;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public static boolean checkIfUsernameIsUnique(String username) {
        
        // Check accounts in Healthcare System Organization
        for(UserAccount ua: WebMedical.getInstance().getUserAccountDirectory().getUserAccountList()){
             if (ua.getUsername().equals(username))
                    return false;
        }
        
        for (Network network: webMedical.getNetworkList()){
            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                
                // check accounts in each Enterprise UserAccount directory
                for(UserAccount ua: enterprise.getUserAccountDirectory().getUserAccountList()){
                    if (ua.getUsername().equals(username))
                    return false;
                }
                
                // Check accounts in each organization under enterprise
                for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount ua: org.getUserAccountDirectory().getUserAccountList()){
                        if (ua.getUsername().equals(username))
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    

    @Override
    public Type getOrganizationType() {
        return null;
    }

    public void addPatientMapping(String patientId, String network, String state, String hospitalName) {
        ArrayList<String> patientNetworkAndStateList = patientMapping.get(patientId);

        if (patientMapping.get(patientId) != null) {
            patientNetworkAndStateList.add(network + ":" + state + ":" + hospitalName);
        } else {
            patientNetworkAndStateList = new ArrayList();
            patientNetworkAndStateList.add(network + ":" + state + ":" + hospitalName);
            patientMapping.put(patientId, patientNetworkAndStateList);
        }
    }

    public ArrayList<String> findPatientInformation(String patientId) {
        if (patientMapping.get(patientId) != null) {
            return patientMapping.get(patientId);
        }
        return null;
    }

    

    public static String getServerFileLocation() {
        return serverFileLocation;
    }

    
    public Network getNetwork(String networkName) {
        for (Network network : networkList) {
            if (network.getCountryName().equalsIgnoreCase(networkName)) {
                return network;
            }
        }
        return null;
    }
}
