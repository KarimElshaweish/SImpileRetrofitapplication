package automation.ebtkarat.simpileretrofitapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import automation.ebtkarat.simpileretrofitapplication.Adapter.RvAdapter;
import automation.ebtkarat.simpileretrofitapplication.Data.Data;
import automation.ebtkarat.simpileretrofitapplication.netowrk.Retrofil;
import automation.ebtkarat.simpileretrofitapplication.netowrk.getDataService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ProgressBar pb;
    private void setDataAdapter(List<Data>data){
        RvAdapter rvAdapter=new RvAdapter(this,data);
        rv.setAdapter(rvAdapter);
    }
    private void Service(){
        getDataService IGet= Retrofil.retrofitGetInstance().create(getDataService.class);
        Call<List<Data>> dataListCall=IGet.getAllData();
        dataListCall.enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {
                    pb.setVisibility(View.GONE);
                    setDataAdapter(response.body());
            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void __init__(){
        rv=findViewById(R.id.rv);
        pb=findViewById(R.id.pb);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        __init__();
        Service();
    }
}
