package dev.dacc.zslicker.dacc.App.Controller;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dev.dacc.zslicker.dacc.App.Model.Accounting;
import dev.dacc.zslicker.dacc.App.Model.Category;
import dev.dacc.zslicker.dacc.App.Model.Operation;

/**
 * Created by Programmer on 25.05.2015.
 */
public class Controller implements IController {
    //  @Override
    public void Income() {
        Log.d("Controller", "income");
    }

    //  @Override
    public void Outlay() {
        Log.d("Controller", "outlay");
    }

    public void InsertOperation(String Name){}
    public void InsertCategory(String Name){}
    public void InsertAccounting(int CategoryId, int OperationId, double MoneyCount, String Description){}

    public void UpdateOperation(int id, String Name){}
    public void UpdateCategory(int id, String Name){}

    public void DeleteOperation(int id){}
    public void DeleteCategory(int id){}
    public void DeleteMain(int id){}

    public List<Category> GetAllCategory(){
        return new ArrayList<Category>();
    }
    public List<Operation> GetAllOperation(){
        return new ArrayList<Operation>();
    }
    public List<Accounting> GetAllAccounting() {
        return new ArrayList<Accounting>();
    }

    public Category GetCategoryByID(){
        return new Category();
    }
    public Operation GetOperationByID(){
        return new Operation();
    }
    public Accounting GetAccountingByID(){
        return new Accounting();
    }
}
