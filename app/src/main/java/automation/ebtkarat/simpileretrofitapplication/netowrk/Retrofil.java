package automation.ebtkarat.simpileretrofitapplication.netowrk;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Antnna on 05-Feb-19.
 */

public class Retrofil {
    private static Retrofit retrofit;
        private static final String BASE_URL="";

        public static Retrofit retrofitGetInstance(){
            if(retrofit==null){
                retrofit = new retrofit2.Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return  retrofit;
        }
}
