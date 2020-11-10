package com.saltsoftware.factory.dentalService;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.util.GenericHelper;

/**
 * @author Junade Frizlar
 * Student Number: 208046402
 * Description:Creating a cost Factory
 */
public class CostFactory {

    public static Cost createCost(String costID, Double amount){

        // Utility (functional to be reused)  - generate cost ID
        //Random number generated for cost identification and Amount set

        String CostID = GenericHelper.generateCostID();

        Cost cost = new Cost.Builder()
                .setCostID(costID)
                .setAmount(amount)
                .build();
        return cost;
    }

    public static Cost builCost(String costID) {
        return null;
    }

    public static Cost buildCost(java.lang.String string, java.lang.String string1) {
        return null;
    }
}

