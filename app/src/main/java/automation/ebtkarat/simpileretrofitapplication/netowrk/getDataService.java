package automation.ebtkarat.simpileretrofitapplication.netowrk;

import java.util.List;

import automation.ebtkarat.simpileretrofitapplication.Data.Data;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by Antnna on 05-Feb-19.
 */

public interface getDataService {
    @GET("/photos")
    Call<List<Data>> getAllData();
}
