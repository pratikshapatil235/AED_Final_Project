package model;

import model.network.Network;
import model.organization.Organization;
import model.role.Role;
import model.role.SystemAdminRole;
import java.util.ArrayList;


public class PawcareSystem extends Organization{
    
    private static PawcareSystem ecosystem;
    private ArrayList<Network> networks;
    public static PawcareSystem getInstance(){
        if(ecosystem==null){
            ecosystem=new PawcareSystem();
        }
        return ecosystem;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networks.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getValidRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private PawcareSystem(){
        super(null);
        networks=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(ArrayList<Network> networks) {
        this.networks = networks;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networks){
            
        }
        return true;
    }
}
