package klever.hiring.day.android.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import klever.hiring.day.android.R
import klever.hiring.day.android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}
