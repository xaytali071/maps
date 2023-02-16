package com.example.maps
import androidx.annotation.NonNull
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import com.yandex.mapkit.MapKitFactory

class MainActivity: FlutterActivity() {
    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        MapKitFactory.setApiKey("cc87ae90-42bb-4291-bf9a-943fca77fdbc") // Your generated API key
        super.configureFlutterEngine(flutterEngine)
    }
}