package wheather.davidamadormoreno.com.weatherapp.utils

import android.util.Log
import java.net.URL

/**
 * Created by David on 22/03/2017.
 */
class Request (val url:String) {
    fun run(){
        val forecastJSONStr = URL(url).readText()
        Log.d(javaClass.name,forecastJSONStr)
    }
}