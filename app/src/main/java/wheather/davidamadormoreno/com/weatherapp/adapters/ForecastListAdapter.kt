package wheather.davidamadormoreno.com.weatherapp.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by David on 22/03/2017.
 */
class ForecastListAdapter(val items: List<String>): RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.textView.text = items[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int =items.size

    class ViewHolder(val textView: TextView): RecyclerView.ViewHolder(textView)
}