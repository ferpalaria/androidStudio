package Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.faj.fernanda.fragment.IFragment;
import com.faj.fernanda.fragment.R;

public class MeuFragment extends Fragment {

    private IFragment listener;

    public MeuFragment() {

    }

    public void setListener (IFragment listener){
        this.listener = listener;
    }

    private void didOnClickButtonFragment (int value){
        if(listener != null){
            listener.onClickButtonFragment(value);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_meu, container, false);

        Button btnListener = (Button) view.findViewById(R.id.btnListener);
        btnListener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didOnClickButtonFragment(20);
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

}
