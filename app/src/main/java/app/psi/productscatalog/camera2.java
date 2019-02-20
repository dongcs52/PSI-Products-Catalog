package app.psi.productscatalog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class camera2 extends Fragment  implements View.OnClickListener {

    View v;
    private CardView product1,product2,product3,product4,product5;

    public camera2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_camera2, container, false);

        product1 = (CardView)v.findViewById(R.id.produg1);
        product1.setOnClickListener(this);

        product2 = (CardView)v.findViewById(R.id.produg2);
        product2.setOnClickListener(this);

        product3 = (CardView)v.findViewById(R.id.produg3);
        product3.setOnClickListener(this);

        product4 = (CardView)v.findViewById(R.id.produg4);
        product4.setOnClickListener(this);


        // Inflate the layout for this fragment
        return v;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.produg1:
                Toast.makeText(getActivity(),"CCTV 1",Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getActivity(),cctv1.class);
                startActivity(intent1);
                break;
            case R.id.produg2:
                Toast.makeText(getActivity(),"CCTV 2",Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(getActivity(),cctv2.class);
                startActivity(intent2);
                break;
            case R.id.produg3:
                Toast.makeText(getActivity(),"CCTV 3",Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(getActivity(),cctv3.class);
                startActivity(intent3);
                break;
            case R.id.produg4:
                Toast.makeText(getActivity(),"CCTV 4",Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(getActivity(),cctv4.class);
                startActivity(intent4);
                break;
            default:
                break;
        }

    }
}
