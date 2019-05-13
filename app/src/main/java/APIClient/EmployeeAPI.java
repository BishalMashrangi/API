package APIClient;

import java.util.List;

import model.Employee;
import model.EmployeeCUD;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface EmployeeAPI {



     @GET("employees")
    Call<List<Employee>> getEmployee();

     @POST("create")
     Call<Void> registerEmployee(@Body EmployeeCUD emp);


     //Get employee on basis of EmpID
    @GET("employee/{empID}")
    Call<Employee> getEmployeeID(@Path("empID")int empId);

    //Update employee on basis of EmpId

    @PUT("update/{empID}")
    Call<Void> updateEmployee(@Path("empID")int empId, @Body EmployeeCUD emp);

    //Delete employee on basis of EmpId

    @DELETE("delete/{empID}")
    Call<Void> deleteEmployee(@Path("empID")int empId);

}
