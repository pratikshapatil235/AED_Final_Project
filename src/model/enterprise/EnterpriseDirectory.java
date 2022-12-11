package model.enterprise;

import java.util.ArrayList;

public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type == Enterprise.EnterpriseType.HealthCenter){
            enterprise=new HealthCareEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type == Enterprise.EnterpriseType.NGO)
        {
            enterprise =  new NGOEnterprise(name);
            enterpriseList.add(enterprise);
            
        }
        
        else if(type == Enterprise.EnterpriseType.PawInsurance) {
            enterprise = new PawInsuranceEnterprise(name);
            enterpriseList.add(enterprise);
            
            
        } else if (type == Enterprise.EnterpriseType.EmergencyRescue) {
            enterprise = new EmergencyRescueEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
