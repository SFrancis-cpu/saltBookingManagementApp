package com.saltsoftware.service.employee.impl;
import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.factory.dentalService.CostFactory;
import com.saltsoftware.service.dentalService.CostService;
import com.saltsoftware.service.dentalService.impl.CostServiceImpl;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
/*
        * @author name: Junade Frizlar
        * student number: 208046402
        **/
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CostServiceImplTest {

    private static CostService service = CostServiceImpl.getService();
    private static Cost cost = CostFactory.createCost("dsajs634j3832",40.00);

    @Test
    public void d_GetAll() {
        Set<Cost> cost = service.getAll();
        Assert.assertEquals(1,cost.size());
        System.out.println("Total cost"+cost);
    }
    @Test
    public void a_Create() {
        Cost created =service.create(cost);
        Assert.assertEquals(cost.getCostID(), created.getCostID());
        System.out.println("created: "+ created);
    }
    @Test
    public void b_Read() {
        Cost read = service.read(cost.getCostID());
        Assert.assertEquals(cost.getCostID(),read.getCostID());
        System.out.println("Read : " +read);
    }
    @Test
    public void c_Update() {
        Cost updated = new Cost.Builder().copy(cost).setCostID("45fh45kd").build();
        service.update(updated);
        Assert.assertNotEquals(cost.getCostID(), updated.getCostID());
        System.out.println("updated: " + updated);
    }
    @Test
    public void e_Delete() {
        service.delete(cost.getCostID());
    }
}
