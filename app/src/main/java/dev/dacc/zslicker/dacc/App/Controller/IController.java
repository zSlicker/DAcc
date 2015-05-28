package dev.dacc.zslicker.dacc.App.Controller;

import java.util.List;

import dev.dacc.zslicker.dacc.App.Model.Category;
import dev.dacc.zslicker.dacc.App.Model.Accounting;
import dev.dacc.zslicker.dacc.App.Model.Operation;

/**
 * Created by Programmer on 25.05.2015.
 */
public interface IController {
    void Income();
    void Outlay();

    void InsertOperation(String Name);
    void InsertCategory(String Name);
    void InsertAccounting(int CategoryId, int OperationId, double MoneyCount, String Description);

    void UpdateOperation(int id, String Name);
    void UpdateCategory(int id, String Name);

    void DeleteOperation(int id);
    void DeleteCategory(int id);
    void DeleteMain(int id);

    List<Category> GetAllCategory();
    List<Operation> GetAllOperation();
    List<Accounting> GetAllAccounting();

    Category GetCategoryByID();
    Operation GetOperationByID();
    Accounting GetAccountingByID();
}
