package cubex.mahesh.googlemaps_aug7am

import android.content.Context
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frag:SupportMapFragment = supportFragmentManager.
                findFragmentById(R.id.frag1) as SupportMapFragment
        frag.getMapAsync(object : OnMapReadyCallback {
            override fun onMapReady(p0: GoogleMap?) {
           //   p0!!.mapType = GoogleMap.MAP_TYPE_HYBRID
                var options = MarkerOptions( )
                options.position(LatLng(17.4361,78.4440))
                options.title("Mythrivanam")
                p0!!.addMarker(options)
                p0!!.animateCamera(CameraUpdateFactory.newLatLngZoom(
                        LatLng(17.4361,78.4440),15f))
            }
        })

    /*    var lManager = getSystemService(Context.LOCATION_SERVICE)
                                as LocationManager
        lManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER)
        lManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,
                1000,1.toFloat(),
                object : LocationListener {
                    override fun onLocationChanged(l: Location?) {
                            Toast.makeText(this@MainActivity,
                                    l!!.latitude.toString()+"\n"+l!!.longitude.toString(),
                                    Toast.LENGTH_LONG).show()
                    }

                    override fun onStatusChanged(p0: String?, p1: Int, p2: Bundle?) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun onProviderEnabled(p0: String?) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun onProviderDisabled(p0: String?) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }
                })
*/
    }
}
