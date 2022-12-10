package model.insurance;

import java.util.ArrayList;
import java.util.List;

public class InsurancePolicyDirectory {

    private List<Insurance> policies = new ArrayList<>();

    public List<Insurance> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Insurance> policies) {
        this.policies = policies;
    }
    
}
