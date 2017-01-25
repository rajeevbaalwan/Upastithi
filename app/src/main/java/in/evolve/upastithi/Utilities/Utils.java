package in.evolve.upastithi.Utilities;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by RAJEEV YADAV on 10/26/2016.
 */
public class Utils {

    public static void toastS(Context context,String message){
        Toast.makeText(context,message, Toast.LENGTH_SHORT).show();
    }

    public static void toastL(Context context,String message){
        Toast.makeText(context,message, Toast.LENGTH_LONG).show();
    }
}
